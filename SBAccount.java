package dadbank;

public class SBAccount extends Account{

	int minBalance; // applicable for SB only
	String accType = "Savings Account"; // SB account
	int numWithDrawls;
	
	//default constructor - without any arguments or params  
	public SBAccount(){
		numWithDrawls = 0;
		minBalance = 500;
	}
	
	// Constructor overload. 
	//Create Account using account number, Customer objects, balance
	public SBAccount(Customer customer, String acc_Num, int bal){
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
	
	
	// Change in the logic for withdraw hence override the method 
	public int withdraw(int amount){
		System.out.println("In the SBAccount > Present withdraw() count:"+ numWithDrawls+1);
		
		if(numWithDrawls >= 3){ // #withdrawls exceeded limit, dont allow to withdraw
			return -1;
		}
		else if((balance - amount) < minBalance){ // falling below minimum balance. dont allow to withdraw
			return -1;
		}
		else{
			balance = balance - amount; // all valid success scenario
		}
		numWithDrawls++;
		return balance;
	}

	
	
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
		return "SBAccount [minBalance=" + minBalance + ", accType=" + accType
				+ ", numWithDrawls=" + numWithDrawls + ", accNum=" + accNum
				+ ", cust=" + cust + ", balance=" + balance + "]";
	}
	
}
