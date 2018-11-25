//Nicholis Wright
package project;

public class Strings {

public static String stringStuff(){
	System.out.println("Array: My program is frustrating because it takes a super long \n "
			+ "time to figure out how to get everything working! :D");
	final String x = ("My program is frustrating because it takes a super long \n " //final used to set x permanently as the given string
			+ "time to figure out how to get everything working! :D");//next line has escape sequence of the \n
	System.out.println( x.length() + " is the length of the string." ); // returns "110" by counting the number of characters in the array
	System.out.println( x.equalsIgnoreCase("My program is frustrating because it takes a super long \n "
			+ "time to figure out how to get everything working! :D")); // is "true" outputs true after comparing the final string and this string because they are the same
	System.out.println( x.charAt(4) + " is the character in the 4th spot in the array"); // takes the character in the 4th position of the array and prints it
	Integer T = new Integer(40);
	Integer Y = new Integer(40);
	
    // will output 0 since 40 equals 40 because it compares the two variables lexicographically
    System.out.println(Y.compareTo(T));//== compares two operands to see if they point to the same object, not equivalent objects.
    //.equals()checks to see if objects are equivalent
	return null;
}
}
