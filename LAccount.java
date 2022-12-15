package dadbank;

public class LAccount extends Account{

	int minBalance; // applicable for SB only
	String accType = "Loan Account"; // SB account
	int numWithDrawls;
	int loanApproved;
	
	//default constructor - without any arguments or params  
	public LAccount(){
		numWithDrawls = 0;
		minBalance = 500;
		loanApproved=10000;
		super.balance = loanApproved; 
	}
	
	// Constructor overload. 
	//Create Account using account number, Customer objects, balance
	public LAccount(Customer customer, String acc_Num, int bal){
		//this.accNum = acc_Num;
		//this.cust = customer;
		//this.balance = bal;
		super(customer, acc_Num, bal);
		numWithDrawls = 0;
		minBalance = 500;
		loanApproved = 10000;
		super.balance = loanApproved;				
	}

	// SB functionality 
	
	//Change in logic so need of Deposit method to write. It inherits from super class Account
	public int deposit(int amount){
		System.out.println("In the LoanAccount > deposit()");
		if((balance+amount) > loanApproved){ // you cannot payback more than loan amount ... so fail case
			return -1;
		}
		balance = balance + amount; // valid case. accept deposit
		return balance;
	}
	
	
	// Change in the logic for withdraw hence override the method 
	public int withdraw(int amount){
		System.out.println("In the LoanAccount > Present disburse() count:"+ numWithDrawls+1);
		if(numWithDrawls >= 3){
			return -1;
		}
		balance = balance - amount;
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
		return "LAccount [minBalance=" + minBalance + ", accType=" + accType
				+ ", numWithDrawls=" + numWithDrawls + ", accNum=" + accNum
				+ ", cust=" + cust + ", balance=" + balance + "]";
	}
	
}
