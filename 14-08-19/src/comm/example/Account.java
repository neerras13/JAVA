package comm.example;

import java.io.Serializable;

public class Account implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6672430833402960055L;
    private int AccountNum;
    private double amount;
	public int getAccountNum() {
		return AccountNum;
	}
	public void setAccountNum(int accountNum) {
		AccountNum = accountNum;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Account(int accountNum, double amount) {
		super();
		AccountNum = accountNum;
		this.amount = amount;
	}
	public Account() {
		super();
	}

	
	public Account createAccount(int acc,double amt) throws CustomException{
		if(amt < 10000)
			throw new CustomException("Minimum Balance is 10000! Account not created.");
		System.out.println("Account created successfully");
		return new Account(acc,amt);
	}
}
