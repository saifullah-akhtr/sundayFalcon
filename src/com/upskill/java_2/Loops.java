package com.upskill.java_2;

public class Loops {
	//Types of Loops
			//1. For Loop  - Do again and again upto upper limit, Initiate the variable, Setting lower limit, upper limit, Increment and
	                         //Decrement, Statement
			//2. While Loop
			//3.Do While Loop
			//4. Infinite Loop
	public static void main(String[] args) {
	//	practiceForLoop();
	//	practiceWhileLoop();
	//	practiceDowhileLoop();
		practiceNestedLoop();
	}
	public static void practiceForLoop() {
		int i;
		for(i = 1; i<=10; i++) {
			System.out.println(i);
		}
	}
	//WHILE LOOP - Do again and again until condition match - CONDITIONAL LOOP
	public static void practiceWhileLoop() {
		int i = 1;                            //
		while(i<=10) {
			System.out.println("While Loops numbers are = " + i);
			i++;
		}
		
	}
	//DoWhileLoop  - Do Action first than match condition
	public static void practiceDowhileLoop() {
		int i = 1;
		do {
			System.out.println("Do While Loops numbers are = " + i);
			i++;
		} while(i<=10);
			
		
	}
	//Infinite Loop - Never ending loop
	public static void practiceInfiniteLoop() {
		int i;
		for(i = 1; ; i++) {        //No Upper Limit
			System.out.println(i);
		}
	}
	//NESTED LOOP - Loop inside another loop
	public static void practiceNestedLoop() {
		int i;
		int j;
		for(i = 1; i<=10; i++) {
			for(j =1; j<=10; j++) {
				int multiplicationTable = i*j;
				System.out.print(multiplicationTable + " ");
			}
			System.out.println(" ");
		}
	}

}
