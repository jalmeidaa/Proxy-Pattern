package com.proxy.www;
/**
 * 
 * Proxy
 *
 */

public class ATMProxy implements IATM {
	
	ATM atm;
	User user;
	
	public ATMProxy(User user){
		this.user = user;
	}

	@Override
	public void performOperation() {
		
		if(user.getUserName().equalsIgnoreCase("Loyola") && user.getPassword().equalsIgnoreCase("Chicago"))
		{
		atm = new ATM();
		atm.performOperation();
		}
		else
		{
			System.out.println("Wrong Credentials!!");
		}
	}
	
}

