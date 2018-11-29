//Nicholis Wright
//It is a program to say the kind of car that you have
package project;
import java.util.Scanner;
//the four main java data types used in this program are boolean (true/false), int (numbers with no decimals),
//double (numbers with decimals), and Strings (an array of characters).
//Java operator precedence is how Java determines which operator to evaluate first.Parentheses,Multiplication and division,then addition and subtraction 
//Primitive types are the most basic data types available within the Java language. There are 8: boolean, byte, char, short, int, long, float and double. 
//inheritance in java is the ability to allow one class to inherit methods and fields of another class. it is useful because it allows you to not have to rewrite code that you would normally use a lot.
public class Main extends Knowledge{

	public static void main(String[] args)throws java.lang.Exception{//header and then parameter in parentheses
		int selection;
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the test program. If you would like to \n get back to the main menu, restart the program.");
		System.out.println("Enter number:");
		System.out.println("1. Math shtuff");
		System.out.println("2. String stuff");
		System.out.println("3. Dice");
		System.out.println("4. Car");
		System.out.println("5. Loops");
		System.out.println("6. Array");
		System.out.println("7. Super and subclasses inheritance");
		System.out.println("8. Polymorphism");
		try {
		selection = scan.nextInt(); //input
	
		switch(selection) {
		case 1:
			Knowledge.perimeterArea();//find perimeter and area of a rectangle
			break; // break statement halts a loop and exits it
		case 2:
			Strings.stringStuff();//states the string length, and compares to a predetermined string for boolean true false values
			break;
		case 3:
			Knowledge.dice();
			Knowledge.dice( 4, 3); //overloaded method
			break;
		case 4: 
			Car myCar= new Car("black", "Kia Optima", 2011);
			    System.out.println("My car is a " + myCar.toString()); 
			    //method is Car.myCar and arguments are kia optima
			    	System.out.println("year of your car:");
			    	int year = scan.nextInt();
			    	
			    	System.out.println("Enter make and model of car:");
			    	
			    	String model = scan.nextLine();
			    	String make = scan.nextLine();
			    	
			        Car yourCar = new Car(make, model, year);
			        
			    	System.out.println("Your car is a "+ yourCar + " ");
			break;
		case 5:
			Loops.loop(); // for loops while loops do while loops
		    break;
		case 6:
			myArray.array();
			break;
		case 7:
			Subclass.Supersub();
			break;
		case 8:
			Food.eat();
			break;
		default:
			System.out.println("Invalid Selection"); 
			scan.close();
		 }
		}
		catch(java.util.InputMismatchException ex) {
			System.out.println("Please only enter a number");
		}
	  }//close switch
	} //close void main
//close main class
