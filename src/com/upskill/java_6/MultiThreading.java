package com.upskill.java_6;

public class MultiThreading {
   
	/* MultiThreading is a java feature that allows concurrent execution of two or more parts of a program
	
	 Threads can be created by using two mechanisms
	 
	       1. Extending the Thread class
	       2. Implementing the Runnable Interface
	 */
	
	public static void main(String[] args) {
		
		int n = 10;
		
		for (int i=0; i<n; 1++) {
			MultiThreadingThread obj = new MultiThreadingThread();
			obj.start();
		}
	}
}
