package com.upskill.java_4;

public class Constructor {
	/*Constructor is instance of class, method same as class name, java will execute constructor first
	 -      Constructor cannot be static or override nor void or return type
	 -      Default Constructor  : No constructor is initialized
	 -      Parameterized Constructor   :   Add different signature
	 -      Constructor Overloading  : Different Signature
	 
	 
	 */
	
	// DIfference bw object and instance(constructor) is that object doesn't make decision but constructor can act as a class but both
	// are representative of class
	
	//Constructor is entry point of class, it execute before main method
	
	String studentName;
	int studentAge;
	
	public Constructor(String name,int age) {     //Method name is same as class name -No void, No return type, No static. AND we parameterize(name,age)
		                                  // a constructor because we can't do in class but it act like we parameterize class
		studentName=name;
		studentAge=age;
		
	}
	public Constructor(String name) {    //One more Constructor, Have to overload with different parameter
		studentName=name;
	}
	public Constructor(int age) { 
		studentAge=age;
	}

	public static void main(String[] args) {
		Constructor obj = new Constructor("saif",20); //object of class create, have to pass a name which we parameterize in Constructor
		System.out.println(obj.studentName);
		System.out.println(obj.studentAge);
		
		Constructor obj2 = new Constructor("akhtar");   //Object for 2nd Constructor(instance), same variable passing different value
		System.out.println(obj2.studentName);
		
		Constructor obj3 = new Constructor(20);
		System.out.println(obj3.studentAge);
	}

}
