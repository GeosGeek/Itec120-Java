/***********************
 *
 *   TestGumMachine - demonstrates the GumMachine class
 *
 *   Author:   Matt Crichton 
 *   Date:     2018-Oct
 *
 ***********************/
public class TestGumMachine {
    public static void main(String[] args) {
        System.out.println("\n--- Creating two machines, one with 20 gumballs, the other full:");
        // write code to create two machines, one with 20, one full, and print them out
		GumMachine m1 = new GumMachine(20);
		GumMachine m2 = new GumMachine(475);
	    System.out.println(m1);
	    System.out.println(m2);

        System.out.println("\n--- buying gum from each machine:");
        // write code to buy gum once from each machine, print them out
		m1.buyGum();
		m2.buyGum();
		System.out.println(m1);
		System.out.println(m2);


        System.out.println("\n--- buying gum from machine one 4 more times:");
        // buy gum from first machine four times, print both out
		m1.buyGum();
		m1.buyGum();
		m1.buyGum();
		m1.buyGum();
		System.out.println(m1);
		System.out.println(m2);


        System.out.println("\n--- Testing to see if gum machines are empty:");
        // print the results of the isEmpty method for both machines
		System.out.println(m1.isEmpty());
		System.out.println(m2.isEmpty());


        System.out.println("\n--- a loop to buy gum from second machine 90 times:");
        // write a loop to buy gum from the full machine 90 times, print both out
		for (int n = 0; n < 90; n++) {
			m2.buyGum();
		}
		System.out.println(m1);
		System.out.println(m2);


        System.out.println("\n--- Testing to see if gum machines are empty:");
        // print the results of the isEmpty method for both machines
		System.out.println(m1.isEmpty());
		System.out.println(m2.isEmpty());


        System.out.println("\n--- servicing both gum machines:");
        // call the serviceMachine for both machines, print them out, and 
        // also print out how much money was retrieved from each machine.
		System.out.println(m1.serviceMachine());
		System.out.println(m2.serviceMachine());
		System.out.println();
		System.out.println(m1);
		System.out.println(m2);

        System.out.println("\n--- Testing to see if gum machines are empty:");
        // Once more, print the results of the isEmpty method for both machines
		System.out.println(m1.isEmpty());
		System.out.println(m2.isEmpty());


        System.out.println();
    } //main
}