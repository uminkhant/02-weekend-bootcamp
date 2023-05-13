import java.util.Scanner;

class ArrayDemoTwo{
	static Scanner sc;
	static int[] array;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		addToArray();
		askOperation();
		getAllArray();
	}

	static void askOperation(){
		System.out.println("""
			Select Operation By Type Number
				1.updateArray
				2.deleteByArrayIndex
			""");
		int res = sc.nextInt();
		
		System.out.println("please type index number");
		int index = sc.nextInt();

		switch(res){
		case 1:
			System.out.println("Please type new value!");
			int value = sc.nextInt();
			updateArray(index,value);
			break;
		case 2:
			deleteByArrayIndex(index);
			break;
		}
	}
	static void updateArray(int index,int newValue){
		array[index] = newValue;
	}
	
	static void deleteByArrayIndex(int index){
		int tmp[] = new int[array.length-1];
		for(int i = 0 ;i < tmp.length ;i++){

			if(i >= index){
				tmp[i] = array[i+1];
			}else{
				tmp[i] = array[i];
			}
		}
		array = tmp;
	}

	static void addToArray(){
		System.out.println("Type array length");
		int i = sc.nextInt();
		array = new int[i];
		for (int x =0 ;x <array.length ;x++ ) {
			array[x] = x + 5 ;
		}
	}

	static void getAllArray(){
		System.out.println("Array Length :"+array.length);
			
		for(int x = 0 ;x <array.length;x++){
			System.out.println("Values :"+array[x]);
		}
	}
}