// Nicholis Wright
/* It is a program to say the kind of car that you have
program to do various things with arrays, strings, loops and mathematical
operators. Also able to construct a car of your own design. THis part
does a bunch of different functions with loops */

package project;

/**class contains loops.
 * @author nicholiswright 
 */
public class Loops {
  /**
   * uses loops to output strings.
   */
  public static void loop() { // do while loop is in Knowledge.java
    int width = 3;
    int height = 6;
    while (height <= 6 && width <= 3) { // while loop
      System.out.println("you can fit through the door");
      height++;
      width++;
      continue; // continue jumps to the
      // next iteration of a loop if there is one
    }
    for (width = 2; width < 6; width++) { // for loop
      System.out
          .print("your width is " + width + " feet across so " + "you can fit through the hatch");
      System.out.println();
    }
  }
}

