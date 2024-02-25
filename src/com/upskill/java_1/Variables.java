package com.upskill.java_1;

public class Variables {
	
	String country = "USA"; // Global or instance variable: Variable declare in class level, outside method 
	
	static String region = "America"; //Static varibales belong to class no need to create object

	public static void main(String[] args) {
		
		
		String city = "New York";
		System.out.println(city);
		
		Variables object = new Variables();
		System.out.println(object.country);
		
		System.out.println(region); // static no need object
		
		object.CT("Danbary");
		object.NJ();
		 
		
	}
	
	public void NJ() {
		
		String city = "Paterson"; // Local Variable: Variable declare in method
		System.out.println(city);
		//How to create object
		Variables obj = new Variables(); // 'Variables' is class name : ClassName ObjectName = new ClassName();
		System.out.println(obj.country);
		
		System.out.println(region);
		
	}
	public void CT(String county) {  //county is method parameter use to pass data from global to local
		
		
		String city = "Hartfort";
		System.out.println(city);
		
		String myCounty = county;
		System.out.println(myCounty);
		
		Variables object = new Variables();
		System.out.println(object.country);
		
		System.out.println(region);
	}
	

}
