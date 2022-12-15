package dadbank;

public class Account {

	String accNum;
	Customer cust;
	int balance;
	
	//default constructor - without any arguments or params  
	public Account(){
		
	}
	
	// Constructor overload. 
	//Create Account using account number, Cusotmer objects, balance
	public Account(Customer customer, String acc_Num, int bal){
		this.accNum = acc_Num;
		this.cust = customer;
		this.balance = bal;
	}

	// getters and setters 
	public String getAccNum() {
		return accNum;
	}

	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}

	public Customer getCust() {
		return cust;
	}

	public void setCust(Customer cust) {
		this.cust = cust;
	}

	public int getBal() {
		return this.balance;
	}

	public void setbal(int bal) {
		this.balance = bal;
	}
	
	// Write Account common functionality here
	// this refers member variables defined in this class

	// Deposit / adjusts balance and return new balance
	public int deposit(int amount){
		System.out.println("In the Base Account > deposit()");

		balance = balance + amount;
		return balance;
	}
	
	// withdraw / adjusts balance and return new balance. Ensure balance cannot be negative
	public int withdraw(int amount){
		System.out.println("In the Base Account > withdraw()");
		if((balance - amount)< 0)	{ // falling below minimum balance 0. don't allow to withdraw
			return -1;
		}
		else{
			balance = balance - amount; // valid case. allow to withdraw
		}
		return balance;
	}
	
	// toString() to print Account details. It internally calls toString of Customer
	public String toString() {
		return "Account [accNum=" + accNum + ", cust=" + cust + ", balance="
				+ balance + "]";
	}	
	
}
