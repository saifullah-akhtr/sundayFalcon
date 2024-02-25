package com.upskill.java_4;

public class Encapsulation {

	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		System.out.println(obj.getName());
		obj.setName("Tahmid");
		System.out.println(obj.getName());
		obj.setssn(999999);
		System.out.println(obj.getusername());
		obj.setpassword("upskill999");
	}
	
		// TODO Auto-generated method stub
        // Encapsulation used to hide the data using setter and getter method
		
			private String name = "Saif";            //Read & Write
			private int mobileNumber = 34567890;     //Retrieve, Read Only
			private int ssn = 34567890;              //Update, Write Only
			private String username= "Upskill";      //Retrieve it, Read Only
			private String password= "Upskill123";  //Update, Write only
			
			
			// Setter Method  - name
	public void setName (String value) {
		name = value;
	}
	
	//Getter Method - name
	public String getName() {
		return name;
	}
	
	
	// Getter Method  - mobileNumber                //We can only get mobile number because its read only
	public int getmobileNumber () {
		return mobileNumber;
	}
	 
	//Setter Method - ssn                We can only write ssn but cant read so its only setter method
	public void setssn(int value) {
		ssn = value;
	}
	
	//getter Method because read Only
	public String getusername () {
		return username;
	}
	//setter Method because write only
	public void setpassword(String value) {
		password = value;
	}

}
