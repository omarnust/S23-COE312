
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
	    double myDouble2 = 9.78d;
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
	    byte var1 = 0b10;
	    byte var2 = 0b11;    
	    System.out.println(Integer.toBinaryString(var1 | var2));
	    
	    System.out.println("*** String Class *** ");
	    // String is reference data type
	    String greeting = "Hello";
	    System.out.println("The length of the txt string is: " + greeting.length());
	    // More string methods
	    String txt = "Hello World";
	    System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
	    System.out.println(txt.toLowerCase());   // Outputs "hello world"
	}

}
