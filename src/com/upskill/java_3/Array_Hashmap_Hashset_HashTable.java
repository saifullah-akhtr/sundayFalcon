package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 30;   //Variable
		int[] ageFalcon = new int[] {25, 30, 28, 35, 40};  //Array
		
		//Array index               [0] [1] [2] [3] [4]
		System.out.println("Student Age : " + ageFalcon[3]);
		System.out.println("Total Student : " + ageFalcon.length);
		
		String[] nameFalcon = new String[] {"saif", "Fahim", "Farhana", "Rumi", "Umar"};
		
		boolean[] attendaneFalcoon = new boolean[] {true, false, false, true};
		System.out.println("Students attendance : " + attendaneFalcoon[0]);
		
		//Multi-Dimensional Array
		int[][] ageFalcon2D = {{25, 30, 28, 35, 40},    //[0][0]  [0][1]  [0][2]  [0][3]  [0][4]
				               {24, 28, 32, 22, 45}};   //[1][0]  [1][1]  [1][2]  [1][3]  [1][4]
        System.out.println("Student Age 2D : " +ageFalcon2D[1][4]);
        
        //Hashmap store multiple data using key-value pair, Implementations of Map Interface
        
        HashMap<String, Integer> StudentAge = new HashMap<String, Integer>();
        
        StudentAge.put("abc", 20);
        StudentAge.put("xyz", 25);
        
        System.out.println("Hashmap Studen Age : " + StudentAge.get("abc"));
        
        
 HashMap<String, String> Capital = new HashMap<String, String>();
        
 Capital.put("USA", "Washington Dc");
 Capital.put("Pakistan", "Islamabad");
 Capital.put("Bangladesh", "Dhaka");
        
        System.out.println("Capital is : " + Capital.get("USA"));
        //HashTable store multiple data using key-value pair, No duplicate,
        //also is synchronized (only one thread can be modified)
        Hashtable<String, String> Region = new Hashtable<String, String>();
        Region.put("USA", "America");
        Region.put("Pakistan", "Asia");
        Region.put("Bangladesh", "Asia");
        System.out.println("Hashtable Region  : " + Region.get("USA"));
        
        //Hashset store unordered collection containing unique value, Implementation of Set interface
        
        HashSet<String> car = new HashSet<>();
        car.add("BMW");
        car.add("Tesla");
        car.add("AUDI");
        car.add("FORD");
        
        System.out.println("Car :" + car);
        
	}

}
