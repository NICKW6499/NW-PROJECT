//Nicholis Wright
package project;
import java.util.Scanner;
import java.util.Random;
public class Knowledge {

//public static double area() {
//	double  length = scan.nextDouble();
	//double width = scan.nextDouble();
//	double area = length * width;
	//return area;
//}
public static void perimeterArea() {
	Scanner scanLength = new Scanner(System.in);
	System.out.println("Length: ");
	int length = scanLength.nextInt();
	
    Scanner scanWidth = new Scanner(System.in);
    System.out.println("Width: ");
	 int width = scanWidth.nextInt();
	 
	 double area = (double) ((int)length * (int)width);//casting the double as int so that the double is briefly treated as int.
	 int totalPerimeter = (int) (2*(double)length + 2*(double)width);
	 System.out.println(totalPerimeter + " is the total perimeter and total area is " + area);
	scanLength.close();
	scanWidth.close();
	System.out.println("PI is" + Math.PI); 
	
	int y = 60;
	int z = 15;
	int a = y < 70 ? y++ : z++;//ternary operator sets a = y as long as y<10 from stackoverflow resource
	System.out.println("Is Y between 0 and 100?");
	if (y > 10 && y < 100) {
		System.out.println(true);}
		else if(y > 100) {
			System.out.println("Y is greater than 100");}
		else { 
			System.out.println("Y is less than 0");
	}
	do { // do while loop
		System.out.println("Is y greater than 10 and less than 15? yes!");
		y++;//do while loop
	}
	while (y>10 && y<15);
	System.out.println("Y + Z = "+ (y + z));
	System.out.println("Y - Z = "+ (y - z));
	System.out.println("Y * Z = "+ (y * z));
	System.out.println("Y % Z = "+ (y % z));
	System.out.println("++Y + Z = "+ (++y + z));
	System.out.println("--Y - Z = "+ (--y - z));
	System.out.println("Y += 5 = "+ (y += 5));

}
public static int dice() {
	System.out.println("Roll the dice!");
	Random roll = new Random();

	int n = roll.nextInt(6) + 1;
	System.out.println("Single dice roll is " + n);
	return n;
	
}
public static int dice(int n, int m) { // method overloaded, same name but different amount of parameters
	System.out.println("Roll the dice!");
	Random roll = new Random();

	n = roll.nextInt(6) + 1;
	m = roll.nextInt(6) + 1;
	System.out.println("Double dice roll is " + (n + m));
	return n;
	
}
}
