package project;

/*
  Find Largest and Smallest Number in an Array Example
  This Java Example shows how to find largest and smallest number in an 
  array.
*/
/*
 * The main method
 */
public class  ArrayStuff{
public static void n9() {
	      
	      System.out.println("One-Dimensional array:");// 1-D Array
	      int[] anArray = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, };//Declared, Instantiation, and Initialization

	      for (int i = 0; i < anArray.length; i++) {
		        System.out.println(anArray[i]);
		      }
	      //System.out.println("Index position of 60 is: "+ findIndex(anArray, 60));
	      
	      
	      
	      System.out.println("\nTwo-Dimensional array:");// 2-D Array
	      
	      int[][] twoArray = { {1,3,5,7,9}, {2,4,6,8,10} }; //Declared, Instantiation, and Initialization
	      int indexI = 0;
	      int indexJ = 0;
	      int num = 8;
	      
	      for(int i=0;i<2; i++) {
	    	  for(int j=0;j<5; j++){  
	    		  
	    		  if (twoArray[i][j] == num) {
	    			  num = twoArray[i][j];
	    			  indexI = i;
	    			  indexJ = j;
	    		  }
	    	    System.out.print(twoArray[i][j]+" ");  
	    	  }  
	    	  System.out.println();
	    	  }
	      System.out.println(num);
	      System.out.print("The coordinates for 8: ("+indexI+","+indexJ+")\n");//Coordinates of value
}
}
	     