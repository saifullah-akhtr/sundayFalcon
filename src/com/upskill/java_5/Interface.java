package com.upskill.java_5;

public interface Interface {    // Need Interface just to Frame e.g take this interface to create a car
	
	// Interface can have only abstract methods, java 8 and forward they have static method too
	// Abstract method doesn't have any implementation
	
	
	
	public abstract void iDoor() ;  //No body, No implementation on ABstarct Method
	
	public abstract int iWheel();
	
	public abstract String iEngine();

}


/*
(Parent)				   (Keyword) 				(Child)				 (Keyword) 				(GrandChild)	
					
Class						extends			         class 
Abstract Class(3)   	    extends                  class(3-3=0)
Interface(+3)				implements               class(3-3=0)
Interface(+3)				extends                  interface(+3+3=6)    implements              Class(6-6=0)

*/