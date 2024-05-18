package com.upskill.java_6;

public class MultiThreadingRunnable implements Runnable{
	
	public void run () {
		   try {
			   System.out.println("Thread #  " + Thread.currentThread().getId);
		   }catch (Exception e) {
			   
		   }System.out.println("Exception is caught");
	   }

}
