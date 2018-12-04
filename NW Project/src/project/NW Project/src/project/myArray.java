package project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MyArray {
	 
	public static void array() {
		
		//array of 10 numbers
		int array1[] = new int[]{1,5,63,68,23,56,97};
		Integer[] array = {1,2,3,4,5,6};
        System.out.println("One-dimensional array: 1 2 3 4 5 6");
		
        Scanner keyboard = new Scanner(System.in); //below finds the index of a number in the array (language companion)
		final int SIZE = 6;
		int searchValue;
		boolean found = false;
		int index= 0;
		System.out.println("Enter a number to search for in the array: ");
		searchValue = keyboard.nextInt();
		while(found == false && index < array.length) {
			if(array[index].equals(searchValue))
				found = true;
			else
				index = index + 1;
		}
		if(found)
			System.out.println("The index of the number is " + index);
		else
			System.out.println("That number was not found in the array");
		
		//assign first element of an array to largest and smallest also 1 dimensional array
		int smallest = array1[0];
		int largest = array1[0];
		
		for(int i1=1; i1< array1.length; i1++){
			if(array1[i1] > largest)
			  largest = array1[i1];
			else if (array1[i1] < smallest)
			  smallest = array1[i1];		
		}
		System.out.println("Largest Number is : " + largest);
		System.out.println("Smallest Number is : " + smallest);
		
		int sum = 0;
	for (int i=0; i<7; i++) {
	  //int start1 = array1[i];
	  //sum += start1 + array1[i];
	  //i++;
		sum += array1[i];
	}
	System.out.println("The sum of the array is " + sum);
    System.out.println();
    System.out.println("Two dimensional array:");
    int[][] twoArray = { {1,2,3,4,5}, {6,7,8,9,10} }; 
    int indexN = 0;
    int indexW = 0;
    int num = 4;
    
    for(int N=0;N<2; N++) {
  	  for(int W=0;W<5; W++){  
  		 if (twoArray[N][W] == num) {
  		   num = twoArray[N][W];
  		   indexN = N;
  		   indexW = W;
  		  }
  	    System.out.print(twoArray[N][W]+" ");  
  	  }  
  	  System.out.println();
  	  }
    System.out.println(num);
    System.out.print("The number 4 is located at coordinates ("+indexN+","+indexW+")\n");
    ArrayList<String> alist=new ArrayList<String>();  
    alist.add("Steve");
    alist.add("Tim");
    alist.add("Lucy");
    alist.add("Pat");
    alist.add("Angela");
    alist.add("Tom");

    //displaying elements
    System.out.println(alist);
    // from beginnersbook java tutorials
    //Adding "Steve" at the fourth position
    alist.add(3, "Steve");

    //displaying elements
    System.out.println(alist);
    for (Integer element : array) { //enhanced for loop
    // Do something with element of type String
    System.out.println(element);
    }
  }
}
	



				
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      


				
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		 
