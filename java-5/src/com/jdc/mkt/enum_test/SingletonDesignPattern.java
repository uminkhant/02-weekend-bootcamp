package com.jdc.mkt.enum_test;

public class SingletonDesignPattern {

	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		Account acc = Account.getInstance();
	}
	
	
}

class Account{
	private static Account account ;
	
	private Account() {
		account = new Account();
	}
	
	public static  Account getInstance() {
		
		if(null == account) {	
			synchronized (Account.class) {
				return new Account();
			}
			
		}
		return account;
	}
}


