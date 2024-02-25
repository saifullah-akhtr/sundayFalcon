package com.upskill.java_5;

public abstract class AbstractClass {      //abstract keyword
    // Can put both regular and abstract method
	
	public abstract void iDoor() ; 
	
	public abstract int iWheel();
	
	public abstract String iEngine();
	
	public void color() {
		String carColor = "Red";
	}
	public int seat() {
		return 7;
	}
}
//Encapsulation we hiding data
//Abstraction we are hiding implementation