package com.proxy.www;

public class ProxyTest {

	public static void main(String[] args) {

		User user = new User("Loyola", "Chicago");
		ATMProxy atmProxy = new ATMProxy(user);

		System.out.println("Welcome, Select your options");
		atmProxy.performOperation();
		System.out.println("***********");

		User thief = new User("NorthWest", "Michigan");
		ATMProxy thiefATMProxy = new ATMProxy(thief);

		System.out.println("You Have No Authority");
		thiefATMProxy.performOperation();
		System.out.println("************");

	}

}
