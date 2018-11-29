//Nicholis Wright
package project; //The goal is for this to work by the end of the semester there is some stuff for this check in it though
//this class has private fields, public getters and setters and a constructor with and without parameters
	class Car {
	    private static String color; 
	    private static String make;
	    private static int year;
	    private boolean bluetooth;
	    private boolean sunroof;
	    
	    
	    
	    Car(){
	    	color = "silver";
	    	make = "ford";
	    	year = 1984;
	    	bluetooth = false;
	    	sunroof = true;
	    }
	    
	     Car (String color, String make, int year){//argument is all the stuff in parentheses
	    	Car.color = color;
	    	Car.make = make;
	    	Car.year = year;
	    	this.bluetooth = false; //this to access constructor
	    	this.sunroof = true;
	    	
	    }
	     public String toString() {
	    	 return  year + " " + color + " " + make;
	     }
	     
	    
	    public static String getColor(){
	      return color;
	    }
	    
	    public static String getMake(){
	      return make;
	    }
	    
	    public void setColor(String color){//argument is String color
	      Car.color=color;
	    }
	    
	    public void setMake(String make){
	      Car.make=make;
	    }
	    public int getYear() {
	    	return year;
	    }
	    public boolean getBluetooth() {
	    	return bluetooth;
	    }
	    public boolean getSunroof() {
	    	return sunroof;
	    }
	    
	}