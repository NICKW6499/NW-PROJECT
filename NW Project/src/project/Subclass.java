package project;

public class Subclass extends Superclass {

    // overrides printMethod in Superclass
    public void printMethod() {
        super.printMethod();
        System.out.println("I am printed from a subclass method that overrode the superclass method");
    }
    public static void Supersub() {
        Subclass s = new Subclass();
        s.printMethod();    
    }
}