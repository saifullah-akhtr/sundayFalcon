package com.upskill.java_4;

import com.upskill.java_1.MethodType;

public class Polymorphism extends MethodType{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Polymorphism is the ability of an object to take on many forms.
		- Method Overloading (Compile time Polymorphism/Static binding) Same method name with different signature to overload
		- Method Overridding (Runtime Polymorphism/Dynamic binding) Same method name from Parent class to override
	*/
		car();
		car("red",4);
		car(7);
		
		Polymorphism obj = new Polymorphism();
		obj.annualIncomeVoid();
		
	}
	public void annualIncomeVoid() {                          // Have This method in parent class but override it here	qwer
		int calculateAnnualIncome = hourlyIncome * 2000;
		int rentalIncome = 15000;
		int sideHussel = 25000;
		int newCalculateAnnualIncome =  calculateAnnualIncome + rentalIncome + sideHussel;
		System.out.println("My annual Income is :" + newCalculateAnnualIncome);
	}
	public static void car() {
		System.out.println("My Car is Tesla");
	}
	public static void car(String color, int door) {
		System.out.println("My Car is Tesla, Color is " + color + " It has " + door +  " doors ");
	}
	public static void car(int seat) {
		System.out.println( "It has a seat: " + seat);
	}
	public static void car(Boolean dualMotor) {
		System.out.println("My Car is Tesla, It has dualMotor: " + dualMotor);
	}
	

}
