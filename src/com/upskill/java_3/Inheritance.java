package com.upskill.java_3;
import com.upskill.java_1.MethodType;

public class Inheritance extends MethodType{
	
	         //child class       Parent class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*  The process of obtaining the data members are methods from one class to another class is known as inheritance.
		 -   Single Inheritance
		 -   Multiple Inheritance   (Java dosen't support Multiple Inheritance directly rather through Interfaces)
		 -   Multilevel Inheritance
		   */
        Inheritance obj = new Inheritance();
        obj.annualIncomeVoid();
        obj.weeklyIncomeStatic();
        
        obj.CT("haha");
        }

}
