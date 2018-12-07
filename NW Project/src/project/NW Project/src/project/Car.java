// Nicholis Wright
/* It is a program to say the kind of car that you have
program to do various things with arrays, strings, loops and mathematical
operators. Also able to construct a car of your own design. */

package project; 

/* The goal is for this to work by the end of the semester 
there is some stuff for this check in it though*/

/* this class has private fields, public getters and setters and a 
constructor with and without parameters */
/** class contains a car constructor.
 * @author nicholiswright.
 */
class Car {
  private String color;
  private String make;
  private int year;
  private boolean bluetooth;
  private boolean sunroof;

  /**
   * general constructor for car (default).
   */
  Car() {
    color = "silver";
    make = "ford";
    year = 1984;
    bluetooth = false;
    sunroof = true;
  }

  /** car constructor with make, model and year parameters.
   * @param color sets the color of the car.
   * @param make sets the make of the car.
   * @param year sets the year of the car.
   */
  Car(String color, String make, int year) {
    // argument is all the stuff in parentheses
    this.color = color;
    this.make = make;
    this.year = year;
    this.bluetooth = false; // this to access constructor
    this.sunroof = true;

  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString() returns the year, color, and make.
   */
  public String toString() {
    return year + " " + color + " " + make;
  }

  /** returns color.
   * @return returns the color of the car.
   */
  public String getColor() {
    return color;
  }

  /** returns the make of the car.
   * @return returns the make of the car.
   */
  public String getMake() {
    return make;
  }

  /** sets the color of the car.
   * @param color sets the color of the car.
   */
  public void setColor(String color) {
    // argument is String color
    this.color = color;
  }

  /** sets the make of the car.
   * @param make sets the make of the car.
   */
  public void setMake(String make) {
    this.make = make;
  }

  /** returns the year of the car.
   * @return returns the year of the car.
   */
  public int getYear() {
    return year;
  }

  /** returns whether or not the car has bluetooth.
   * @return returns boolean of bluetooth for the car.
   */
  public boolean getBluetooth() {
    return bluetooth;
  }

  /**returns whether or  not the car has a sunroof.
   * @return returns boolean of whether or not car has sunroof.
   */
  public boolean getSunroof() {
    return sunroof;
  }

}
