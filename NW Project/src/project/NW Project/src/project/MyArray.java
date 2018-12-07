// Nicholis Wright
/* It is a program to say the kind of car that you have
program to do various things with arrays, strings, loops and mathematical
operators. Also able to construct a car of your own design. This
class does functions with arrays. */

package project;

import java.util.ArrayList;
import java.util.Scanner;

/** this class does different functions with arrays.
 * @author nicholiswright
 *
 */
public class MyArray {

  /**
   * declares arrays and does various functions with them.
   */
  public static void array() {

    // array of 10 numbers
    final int[] array1 = new int[] {1, 5, 63, 68, 23, 56, 97};
    final Integer[] array = {1, 2, 3, 4, 5, 6};
    System.out.println("One-dimensional array: 1 2 3 4 5 6");

    Scanner keyboard = new Scanner(System.in); 
    // below finds the index of a number in the array
    //final int size = 6;
    int searchValue;
    boolean found = false;
    int index = 0;
    System.out.println("Enter a number to search for in the array: ");
    searchValue = keyboard.nextInt();
    while (found == false && index < array.length) {
      if (array[index].equals(searchValue)) {
        found = true;
      } else {
        index = index + 1;
      }
    }
    if (found) {
      System.out.println("The index of the number is " + index);
    } else {
      System.out.println("That number was not found in the array");
    }

    // assign first element of an array to largest and smallest also 1
    // dimensional array
    int smallest = array1[0];
    int largest = array1[0];

    for (int i1 = 1; i1 < array1.length; i1++) {
      if (array1[i1] > largest) {
        largest = array1[i1];
      } else if (array1[i1] < smallest) {
        smallest = array1[i1];
      }
      keyboard.close();
    }
    System.out.println("Largest Number is : " + largest);
    System.out.println("Smallest Number is : " + smallest);

    int sum = 0;
    for (int i = 0; i < 7; i++) {
      // int start1 = array1[i];
      // sum += start1 + array1[i];
      // i++;
      sum += array1[i];
    }
    System.out.println("The sum of the array is " + sum);
    System.out.println();
    System.out.println("Two dimensional array:");
    int[][] twoArray = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};
    int indexN = 0;
    int indexW = 0;
    int num = 4;

    for (int n = 0; n < 2; n++) {
      for (int w = 0; w < 5; w++) {
        if (twoArray[n][w] == num) {
          num = twoArray[n][w];
          indexN = n;
          indexW = w;
        }
        System.out.print(twoArray[n][w] + " ");
      }
      System.out.println();
    }
    System.out.println(num);
    System.out.print("The number 4 is located at coordinates (" + indexN + ","
        + indexW + ")\n");
    ArrayList<String> alist = new ArrayList<String>();
    alist.add("Steve");
    alist.add("Tim");
    alist.add("Lucy");
    alist.add("Pat");
    alist.add("Angela");
    alist.add("Tom");

    // displaying elements
    System.out.println(alist);
    // from beginnersbook java tutorials
    // Adding "Steve" at the fourth position
    alist.add(3, "Steve");

    // displaying elements
    System.out.println(alist);
    for (Integer element : array) { // enhanced for loop
      // Do something with element of type String
      System.out.println(element);
    }
  }
}
