import java.util.Arrays;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("*** Hello COE 312 ***");
		
		// Intro
		System.out.println("*** Welcome to COE 312. Today is " + LocalDate.now() + "***");

		// Java Variables
		System.out.println("*** Java Variables ***");
		byte age = 30;
		long viewsCount = 3_123_456L;
		float price  = 11.32F;
		char letter = 'A';
		char letter_ = 65;
		boolean isBoolean = true;
		System.out.println(letter_);
			
		System.out.println("*** Casting ***");
		// explicit casting (widening cast)
		int myInt = 9;
	    double myDouble = myInt;
	    
	    // Implicit casting (narrowing cast)
	    double myDouble2 = 9.78;
	    int myInt2 = (int) myDouble2;
	    
	    System.out.println("*** Casting to/from string *** ");
	    // To convert a string to a number, we use one of the following methods (wrapper classes):
	    Integer.parseInt("10");
	    Float.parseFloat("3.13");
	    Float.toString(3.14f);
	    
	    System.out.println("*** Operators *** ");
	    // Operators
	    // Arithmetic operators +, -, *
	    // Comparison operators, ==, !=, >, >=, <=, <, 
	    // x == y;
	    // x != y;
	    // Logical operators &&, ||, !
	    // bitwise bitwise or (|), bitwise and (&), bitwise (^), bitwise complement (~)
	    System.out.println(3<5 && 5<6);
	    byte var1 = 0b10;
	    byte var2 = 0b11;    
	    System.out.println(Integer.toBinaryString(var1 | var2));
	    
	    System.out.println("*** String Class *** ");
	    // String is reference data type
	    String greeting = "Hello";
	    System.out.println("The length of the txt string is: " + greeting.length());
	    // More string methods
	    String txt1 = "Hello World";
	    System.out.println(txt1.toUpperCase());   // Outputs "HELLO WORLD"
	    System.out.println(txt1.toLowerCase());   // Outputs "hello world"
	    String txt2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	    System.out.println("The length of the txt string is: " + txt2.length());
	    String txt3 = "Please locate where 'locate' occurs!";
	    System.out.println(txt3.indexOf("locate")); // Outputs 7

	    System.out.println("*** Java Match Class *** ");
	    // The Java Math class has many methods that allows you to perform mathematical tasks on numbers.
	    System.out.println(Math.max(20,5));
	    
	    System.out.println("*** Control Flow,if else *** ");
	    // If else statement
	    int time = 20;
	    if (time < 18) {
	      System.out.println("Good day.");
	    } else {
	      System.out.println("Good evening.");
	    }
	    
	    System.out.println("*** ternary operator *** ");
	    // Ternary operator
	    int income = 100_00;
	    String ticket = (income > 100_000) ? "First" : "Economy";
	    
	    System.out.println("*** switch statement *** ");
	    // switch
	    int day = 4;
	    switch (day) {
	      case 1:
	        System.out.println("Monday");
	        break;
	      case 2:
	        System.out.println("Tuesday");
	        break;
	      case 3:
	        System.out.println("Wednesday");
	        break;
	      case 4:
	        System.out.println("Thursday");
	        break;
	      case 5:
	        System.out.println("Friday");
	        break;
	      case 6:
	        System.out.println("Saturday");
	        break;
	      case 7:
	        System.out.println("Sunday");
	        break;
	    }
	    
	    System.out.println("*** while/for loop *** ");
	    // while loop: The while loop loops through a block of 
	    // code as long as a specified condition is true:
	    int i = 0;
	    while (i < 5) {
	      System.out.println(i);
	      i++;
	    }
	    
	    // For loop: When you know exactly how many times you 
	    // want to loop through a block of code, use the for loop 
	    // instead of a while loop
	    for (int j = 0; j < 5; j++) {
	    	  System.out.println(j);
	    }
	    
	    System.out.println("*** continue statement *** ");
	    // Java break and continue keywords
	    for (int k = 0; k < 10; k++) {
	    	  if (k == 4) {
	    	    continue;
	    	  }
	    	  System.out.println(k);
	    }
	    
	    System.out.println("*** Arrays *** ");
	    // Arrays
	    String[] cars = {"BMW", "Honda", "Toyota"};
	    int[] numbers = {10, 20, 30};
	    int[] items = new int[5];
	    items[0] = 2;
	    items[1] = 1;
	    items[2] = 3;
	    // Array class provides some useful methods
	    System.out.println(Arrays.toString(items));
	    Arrays.sort(items);
	    System.out.println(Arrays.toString(items));
	    
	    // 2 d array
	    int[][] matrix = {{1,2,3},{4,5,6}};
	    System.out.println(Arrays.deepToString(matrix));
		
	    // for-each loop is a special loop for arrays
	    for (String c : cars) {
	      System.out.println(c);
	    }
	    // some more array functions
	    Arrays.fill(items, 5);
	    Arrays.equals(items, matrix[0]);
	    
	    
	    System.out.println("*** final keyword for constants *** ");
		// constants: Constants (also called final variables) have a fixed value.  
		// Once we set them, we cannot change them. By convention, we use CAPITAL LETTERS 
		// to name constants.
		final float PI = 3.14F;	
	
		System.out.println("*** Java Methods and methods overloading *** ");
		myMethod1();
		myMethod2("Ahmad", 10);
		System.out.println(myMethod3(6,7));
		
		System.out.println(plusMethod(6,7));
		System.out.println(plusMethod(6.5,7.9));
		
		int aVar = 5;
		String aString = "string";
		int aArray[] = {1,2,3};
		update(aVar);
		update(aString);
		update(aArray);
		System.out.println(aVar);
		System.out.println(aString);
		System.out.println(Arrays.toString(aArray));
	}
	
	// Java Methods
	// static means that the method belongs to the class and not the object
	// void means that the method does not return value.
	static void myMethod1() {
		System.out.println("I am myMethod");
	}
	static void myMethod2(String name, int age) {
		System.out.println(name + " is " + age);
	}
	
	static int myMethod3(int x, int y) {
		return x + y;
	}
	
	static void update(int x) {
		x += 1;
	}
	static void update(String s) {
		s += " Updated";
	}
	static void update(int [] aArray) {
		aArray[0] = 5;
	}
	
	// method overloading
	// With method overloading, multiple methods can have the same name with different parameters:
	static int plusMethod(int x, int y) {
		  return x + y;
	}

	static double plusMethod(double x, double y) {
		  return x + y;
	}
	
	// scope: variables are only accessible inside the region they are created. This is called scope.
	// Method scope
	// Block scope
}


