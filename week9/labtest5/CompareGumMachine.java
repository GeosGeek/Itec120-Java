/***********************
 *
 *   CompareGumMachine - compares two GumMachine objects
 *	 @author Matt Crichton
 *   Date:     2018-Oct
 *
 ***********************/
public class CompareGumMachine {
    public static void main(String[] args) {

        System.out.println("\n--- Creating two machines, each with 100 gumballs:");
        // write code to create two machines, each with 100 gumballs,  print them out
		GumMachine m1 = new GumMachine(100);
		GumMachine m2 = new GumMachine(100);
		System.out.println(m1.toString());
		System.out.println(m2.toString());
        // then print out the return value of the equals and compareTo methods
		System.out.println(m1.equals(m2));
		System.out.println(m1.compareTo(m2));

        System.out.println("\n--- buying gum from one machine:");
        // write code to buy gum once from one machine 
        // then print out the return value of the equals and compareTo methods
		m1.buyGum();
		System.out.println(m1.equals(m2));
		System.out.println(m1.compareTo(m2));

        System.out.println("\n--- buying gum from machine the other machine twice:");
        // write code to buy gum once from the other machine twice
        // then print out the return value of the equals and compareTo methods
		m2.buyGum();
		m2.buyGum();
		System.out.println(m1.equals(m2));
		System.out.println(m1.compareTo(m2));

        System.out.println("\n--- buying gum from machine the first machine again:");
        // write code to buy gum once from the first machine once
        // then print out the return value of the equals and compareTo methods
        // and, finally, print out the two GumMachine objects again
		m1.buyGum();
		System.out.println(m1.equals(m2));
		System.out.println(m1.compareTo(m2));
		
        System.out.println();
    } //main
}