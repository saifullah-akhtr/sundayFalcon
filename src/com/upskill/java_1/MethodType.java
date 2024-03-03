package com.upskill.java_1;
import com.upskill.java_1.*;

public class MethodType extends Variables {
	
	//THREE TYPE OF METHOD
	// VOID METHOD
	// STATIC METHOD
	// RETURN TYPE METHOD
	
	public static int hourlyIncome = 70;

	public static void main(String[] args) {
		
		MethodType obj = new MethodType();
		obj.annualIncomeVoid();
		
		System.out.println("My Monthly Income = " + obj.monthlyIncomeReturn());
		
		weeklyIncomeStatic(); // no need to create object for calling static method
		

	}
	
	//void method
	
	public void annualIncomeVoid() {
		
		int calculateAnnualIncome = hourlyIncome * 2000;
		System.out.println("My Annual Income = " + calculateAnnualIncome);
	}
	
	//return type method
	public int monthlyIncomeReturn() {
		int calculateMonthlyIncome = hourlyIncome * 200;
		return calculateMonthlyIncome;
	}
	
	//static method
	public static void weeklyIncomeStatic() {
		int calculateWeeklyIncome = hourlyIncome * 40;
		System.out.println("My weekly Income = " + calculateWeeklyIncome);
	}

}
