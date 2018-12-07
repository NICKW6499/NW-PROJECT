// Nicholis Wright
/* It is a program to say the kind of car that you have
program to do various things with arrays, strings, loops and mathematical
operators. Also able to construct a car of your own design. */

package project;

public class Subclass extends Superclass {

  // overrides printMethod in Superclass
  
  /**
   * accesses a method that prints a string.
   */
  public void printMethod() {
    super.printMethod();
    System.out.println(
        "I am printed from a subclass method that overrode the superclass "
        + "method and inherited a method or something");
  }

  /**
   * declares variable s that creates a subclass which prints a string.
   */
  public static void supersub() {
    Subclass s = new Subclass();
    s.printMethod();
  }
}
