package dadbank;

public class GenBankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenBankApp app = new GenBankApp(); 

		// create 3 customers with below details
		// Customer 1: CustID - CUST3678, fname - VS, lname- Rao, pan - aoxbwe456 aadhar - 3456 7899
		// Customer 3: CustID - CUST3679, fname - Reethu, lname- Jahnavi, pan - boopbwe126 aadhar - 1239 9022
		// Customer 3: CustID - CUST3680, fname - Vani, lname- Satya, pan - bhpbwe560 aadhar - 3490 7811
		
		//create Customers
		Customer cust1 = app.createCustomer("CUST3678","VS", "Rao", "aoxbwe456","3456 7899");
		// print cust1
		System.out.println(cust1.toString());
		Customer cust2 = app.createCustomer("CUST3679","Reethu", "Jahnavi", "boopbwe126","1239 9022");
		// print cust2
		System.out.println(cust2.toString());
		
		// Create Account 3 
		Customer cust3 = app.createCustomer("CUST3680","Vani", "Satya", "bhpbwe560","3490 7811");
		// print cust3
		System.out.println(cust3.toString());
		
	
		
		//create 3 Accounts with below details
		// Account 1 : Customer cust1, acc_num: AC2310789, balance : 2500
		// Account 2 : Customer cust2, acc_num: AC2310799, balance : 5000
		// Account 3 : Customer cust3, acc_num: AC2310999, balance : 7500
		
		
		//create Account 1 SB pass 1 for SB
		Account acc1 = app.createAccount(cust1,"AC2310789", 2500, 1);
		// print acc1
		System.out.println(acc1.toString());
		
		// Create Account 2 CA pass 2 for CA
		Account acc2 = app.createAccount(cust2,"AC2310799", 5000, 2);
		// print acc1
		System.out.println(acc2.toString());
		
		// Create Account 3 CA pass 3 for LA
		Account acc3 = app.createAccount(cust3,"AC2310999", 7500, 3);
		// print acc1
		System.out.println(acc3.toString());
		
	
		// do some operations on account 1
		System.out.println("Balance Account 1 = " + acc1.getBal());
		int newBal = acc1.deposit(255);
		if(newBal == -1){
			System.out.println("Deposit Transaction failed");
		}
		else{
			System.out.println("New balance Account 1 = " + newBal);
		}
		newBal = acc1.withdraw(500);
		if(newBal == -1){
			System.out.println("Withdraw Transaction failed for : " +500);
		}
		else{
			System.out.println("New balance Account 1 = " + newBal);
		}
		newBal = acc1.withdraw(200);
		if(newBal == -1){
			System.out.println("Withdraw Transaction failed for : " + 200);
		}
		else{
			System.out.println("New balance Account 1 = " + newBal);
		}		
		newBal = acc1.withdraw(550);
		if(newBal == -1){
			System.out.println("Withdraw Transaction failed for : "+  550);
		}
		else{
			System.out.println("New balance Account 1 = " + newBal);
		}
		newBal = acc1.withdraw(150);
		if(newBal == -1){
			System.out.println("Withdraw Transaction failed for : "+  150);
		}
		else{
			System.out.println("New balance Account 1 = " + newBal);
		}

		// do some operations on account 2
		System.out.println("Balance Account 2 = " + acc2.getBal());
		newBal = acc2.deposit(1000);
		if(newBal == -1){
			System.out.println("Acct2 Depost Transaction failed for : "+  1000);
		}
		else{
			System.out.println("New balance Account 2 = " + newBal);
		}
		
		newBal = acc2.withdraw(3500);
		if(newBal == -1){
			System.out.println("Acct2 Withdrawl Transaction failed for : "+  3500);
		}
		else{
			System.out.println("New balance Account 2 = " + newBal);
		}		

		// do some operations on account 3
		System.out.println("Balance Account 3 = " + acc1.getBal());
		newBal = acc3.withdraw(500);
		if(newBal == -1){
			System.out.println("Acct3 Withdraw Transaction failed for : "+  5000);
		}
		else{
			System.out.println("New balance Account 3 = " + newBal);
		}
		
		newBal = acc3.deposit(200);
		if(newBal == -1){
			System.out.println("Acct3 Withdrawl Transaction failed for : "+  200000);
		}
		else{
			System.out.println("New balance Account 3 = " + newBal);
		}
	}
	
	// Create customer
	private Customer createCustomer(String cust_ID, String firstname, String lastname, String pan, String aadhar){
		//accType 1 for SB, 2 for CA and 3 for LA 
		// create Customer using default custructor
//		Customer cust = new Customer();
//		cust.setCustID(cust_ID);
//		cust.setfName(firstname);
//		cust.setlName(lastname);
//		cust.setPan(pan);
//		cust.setAadhar(aadhar);

		// create Customer using parameter custructor
		Customer cust = new Customer(cust_ID, firstname);
		cust.setlName(lastname);
		cust.setPan(pan);
		cust.setAadhar(aadhar);
				
		return cust;
	}
	
	// Create Account
	private Account createAccount(Customer cust, String accNum, int bal, int accType){
		//accType 1 for SB, 2 for CA and 3 for LA 

		// using default constructor
		//Account acc = new Account();
		//acc.setCust(cust);
		//acc.setAccNum(accNum);
		//acc.setbal(bal);
		Account acc = null;
		// using parameter constructor
		if (accType ==1){
			acc = new SBAccount(cust,accNum, bal);
		}
		else if (accType ==2){
			acc = new CAccount(cust,accNum, bal);
		}
		else if (accType ==3){
			acc = new LAccount(cust,accNum, bal);
		}
		else {
			// default SB account
			acc = new SBAccount(cust,accNum, bal);
		}
		
		
		return acc;
	}
	

}
