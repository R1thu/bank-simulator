package dadbank;

public class Customer {

	// member variables
		String custID;
		String fName;
		String lName;
		String aadhar;
		String pan;
		
		// default customer
		public Customer(){
			
		}
		// parameter customer with mandatory fields
		public Customer(String cust_ID, String firstName){
			this.custID = cust_ID;
			this.fName = firstName;
		}
		
		
		//getters and setters
		public String getCustID() {
			return custID;
		}
		public void setCustID(String custID) {
			this.custID = custID;
		}
		public String getfName() {
			return fName;
		}
		public void setfName(String fName) {
			this.fName = fName;
		}
		public String getlName() {
			return lName;
		}
		public void setlName(String lName) {
			this.lName = lName;
		}
		public String getAadhar() {
			return aadhar;
		}
		public void setAadhar(String aadhar) {
			this.aadhar = aadhar;
		}
		public String getPan() {
			return pan;
		}
		public void setPan(String pan) {
			this.pan = pan;
		}
		
		// toString to print Customer object
		public String toString() {
			return "Customer [custID=" + custID + ", fName=" + fName + ", lName="
					+ lName + ", aadhar=" + aadhar + ", pan=" + pan + "]";
		}
		
}
