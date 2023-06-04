package com.jdc.mkt.enum_test;

public class EnumDemo {

	public static void main(String[] args) {

		// before
		int a = Account.ADMIN;
		System.out.println(a);

		// after
		int b = Acc.ADMIN.ordinal();
		System.out.println(b);
		
		@SuppressWarnings("unused")
		String str = Acc.ADMIN.name();

		Acc acc = Acc.CASHIER;
		System.out.println(Acc.ADMIN == acc);

		// test with switch case
		test(acc);

		Acc acc1 = Acc.CASHIER;
		acc1.doSomething();

		Acc.ADMIN.getName();

		System.out.println("Name :" + acc1.getName());

	}

	static void test(Acc ac) {
		String str = null;

		switch (ac) {
		case ADMIN:
			str = " ,all permitted";
			break;
		case CASHIER:
			str = " ,access cashier level only";
			break;
		}
		System.out.println(ac.name() + str);

	}

	// after
	public enum Acc {

		ADMIN("Head") {
			@Override
			void doSomething() {
				System.out.println("do something with admin ");
			}

		},
		CASHIER {
			@Override
			void doSomething() {
				System.out.println("do something with cashier");
			}

		};

		private String name;

		static int age;

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString();
		}

		Acc() {
		}

		Acc(String name) {
			this.name = name;
		}

		abstract void doSomething();

		public String getName() {
			return name;
		}

	}

	public interface Data {
		void showWork();
	}

	// before enum
	public static interface Account {
		public static final int ADMIN = 1, CASHIER = 2;
	}
}

 class Done extends Object {

}
