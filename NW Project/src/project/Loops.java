//Nicholis Wright
package project;

public class Loops{
	public static void loop() {
	int width = 3;
	int height = 6;
	while (height<= 6 && width <=3) { // while loop
		System.out.println("you can fit through the door");
		height++;
		width++;
		continue; // continue jumps to the next iteration of a loop if there is one
	}
	for(width=2; width<6; width++) { // for loop
		System.out.print("your width is " + width + " feet across so you can fit through the hatch");
		System.out.println();
	}
}
}

