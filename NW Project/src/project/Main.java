//Nicholis Wright
//It is a program to say the kind of car that you have
package project;
import java.util.Scanner;
//the four main java data types used in this program are boolean (true/false), int (numbers with no decimals),
//double (numbers with decimals), and Strings (an array of characters).
//Java operator precedence is how Java determines which operator to evaluate first.Parentheses,Multiplication and division,then addition and subtraction 
//Primitive types are the most basic data types available within the Java language. There are 8: boolean, byte, char, short, int, long, float and double. 
public class Main{

	public static void main(String[] args)throws java.lang.Exception{//header and then parameter in parentheses
		int selection;
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the test program. If you would like to \n get back to the main menu, restart the program.");
		System.out.println("Enter number:");
		System.out.println("1. Math shtuff");
		System.out.println("2. Car age");
		System.out.println("3. String stuff");
		System.out.println("4. Dice");
		System.out.println("5. Car");
		selection = scan.nextInt(); //input
		switch(selection) {
		case 1:
			Knowledge.perimeterArea();//find perimeter and area of a rectangle
			break;
		case 2:
			Car.age();//tells you the age of your car also a method call. No argument within parentheses but that is where it would be
			break;
		case 3:
			Strings.stringStuff();//states the string length, and compares to a predetermined string for boolean true false values
			break;
		case 4:
			Knowledge.dice();
			break;
		case 5:
			Car.myCar("black", "Kia Optima"); //method is Car.myCar and arguments are blue and ford
			break;
		default:
			System.out.println("Invalid Selection"); 
		}
		scan.close();
		}//close switch
	} //close void main
//close main class
