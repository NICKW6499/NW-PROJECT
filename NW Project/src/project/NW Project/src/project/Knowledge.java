// Nicholis Wright
/* It is a program to say the kind of car that you have
program to do various things with arrays, strings, loops and mathematical
operators. Also able to construct a car of your own design. */
//lots of math functions in this class

package project;

import java.util.Random;
import java.util.Scanner;


/**contains a lot of math related functions and some loops/ random class stuff.
 * @author nicholiswright
 *
 */
public class Knowledge {

  // public static double area() {
  // double length = scan.nextDouble();
  // double width = scan.nextDouble();
  // double area = length * width;
  // return area;
  // }
  /**
   * finds the perimiter and area of given values.
   */
  public static void perimeterArea() {
    Scanner scanLength = new Scanner(System.in);
    System.out.println("Length in inches: ");
    int length = scanLength.nextInt();

    Scanner scanWidth = new Scanner(System.in);
    System.out.println("Width in inches: ");
    int width = scanWidth.nextInt();

    double area = (double) ((int) length * (int) width); /* casting the double
  as int so that the double is briefly treated as int.*/
    int totalPerimeter = (int) (2 * (double) length + 2 * (double) width);
    System.out.println(totalPerimeter + " is the total perimeter and "
        + "total area is " + area);
    scanLength.close();
    scanWidth.close();
    System.out.println("PI is" + Math.PI);

    int y = 60;
    
    final int z = 15;
    // int a = y < 70 ? y++ : z++;//ternary operator sets a = y as long as
    // y<10 from stackoverflow resource
    System.out.println("Is Y between 0 and 100?");
    if (y > 10 && y < 100) {
      System.out.println(true);
    } else if (y > 100) {
      System.out.println("Y is greater than 100");
    } else {
      System.out.println("Y is less than 0");
    }
    do { // do while loop
      System.out.println("Is y greater than 10 and less than 15? yes!");
      y++;// do while loop
    } while (y > 10 && y < 15);
    System.out.println("Y + Z = " + (y + z));
    System.out.println("Y - Z = " + (y - z));
    System.out.println("Y * Z = " + (y * z));
    System.out.println("Y % Z = " + (y % z));
    System.out.println("++Y + Z = " + (++y + z));
    System.out.println("--Y - Z = " + (--y - z));
    System.out.println("Y += 5 = " + (y += 5));

  }

  /** gives you a random number between 1 and 6.
   * @return returns a dice roll.
   */
  public static int dice() {
    System.out.println("Roll the dice!");
    Random roll = new Random();

    int n = roll.nextInt(6) + 1;
    System.out.println("Single dice roll is " + n);
    return n;

  }

  /** gives you a double dice roll between 1 and 12.
   * @param n new roll for dice.
   * @param m is a new roll for dice number 2.
   * @return returns value of n.
   */
  public static int dice(int n, int m) { /* method overloaded, same name but
different amount of parameters */
    System.out.println("Roll the dice!");
    Random roll = new Random();

    n = roll.nextInt(6) + 1;
    m = roll.nextInt(6) + 1;
    System.out.println("Double dice roll is " + (n + m));
    return n;
  }
}
