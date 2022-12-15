package dadbank;

public class CAccount extends Account{

	int minBalance; // applicable for SB only
	String accType = "Current Account"; // SB account
	int numWithDrawls;
	
	//default constructor - without any arguments or params  
	public CAccount(){
		numWithDrawls = 0;
		minBalance = 500;
	}
	
	// Constructor overload. 
	//Create Account using account number, Customer objects, balance
	public CAccount(Customer customer, String acc_Num, int bal){
		this.accNum = acc_Num;
		this.cust = customer;
		this.balance = bal;
		numWithDrawls = 0;
		minBalance = 500;
	}

	// SB functionality 
	
	//No change in logic so need of Deposit method to write. It inherits from super class Account
//	public int deposit(int amount){
//		balance = balance + amount;
//		return balance;
//	}
	
	
	// No Change in the logic for withdraw hence override the method 
//	public int withdraw(int amount){
//		System.out.println("In the SBAccount > Current withdraw() count:"+ numWithDrawls);
//		if(numWithDrawls >= 3){
//			return -1;
//		}
//		balance = balance - amount;
//		numWithDrawls++;
//		return balance;
//	}

	
	
	public int getMinBalance() {
		return minBalance;
	}
	public void setMinBalance(int minBalance) {
		this.minBalance = minBalance;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public int getNumWithDrawls() {
		return numWithDrawls;
	}
	public void setNumWithDrawls(int numWithDrawls) {
		this.numWithDrawls = numWithDrawls;
	}
	
	
	
	//toString() 
	public String toString() {
		return "CAccount [minBalance=" + minBalance + ", accType=" + accType
				+ ", numWithDrawls=" + numWithDrawls + ", accNum=" + accNum
				+ ", cust=" + cust + ", balance=" + balance + "]";
	}
	
}
