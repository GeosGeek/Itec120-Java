/***********************
 *
 *   GumMachine - class modeling a gumball machine
 *
 *   Author:   Matt Crichton
 *   Date:     2018-Oct
 *
 ***********************/
// A gum machine has two constants:
//       the pieces dispensed per sale: 6
//       the capacity (number of gumballs) of a machine: 475
// A gum machine has two properties (both ints):
//       the number of gumballs in the machine
//       the number of quarters in the machine
 public class GumMachine {
	final private int PIECES_PER_SALE = 6;
	final private int GUMBALL_CAPACITY = 475;
	private int gumballs;
	private int quarters;
	
 // There are two ways to create a new GumMachine.
 // If the constructor has no parameters, a new gum machine is
 // created that has no quarters and is full to capacity of gumballs. 
 // A second constructor can take a number of gumballs as a parameter,
 // and a new machine will be created with no quarters and the given
 // number of gumballs initially in the machine (provided that number
 // is less than the capacity of the machine - otherwise, the machine
 // will start full, at capacity.)
public GumMachine() {
	this.gumballs = GUMBALL_CAPACITY;
	this.quarters = 0;
}
public GumMachine(int gumballs) {
	this.gumballs = gumballs;
	this.quarters = 0;
}

 // the buyGum method takes no parameters, inserts one quarter into the machine, 
 // dispenses gumBalls, and returns the number of gumballs dispensed. If possible,
 // it dispenses "pieces dispensed per sale", or 6. If there are not 6 pieces
 // left in the machine, it dispenses all that are left.
public int buyGum() {
	int gumballsDispensed = 0;
	if (gumballs >= 6) {
		gumballs -= 6;
		gumballsDispensed = 6;
	}
	else {
		gumballsDispensed = gumballs;
		gumballs = 0;
	}
	quarters++;
	return gumballsDispensed;
}
 // the serviceMachine method refills the machine to capacity and removes
 // all the money from the machine. The method returns the total amount
 // of money removed from the machine (as a double).
 public double serviceMachine() {
	 double moneyRemoved = quarters * .25;
	 gumballs = GUMBALL_CAPACITY;
	 quarters = 0;
	 return moneyRemoved;
 }
 
 
 // the isEmpty method answers if the machine is empty of gumballs
 public boolean isEmpty() {
	 boolean empty = false;
	 if (gumballs == 0)
		 empty = true;
	 return empty;
 }
 
 
 // the toString method returns a nicely formatted String showing how many gumballs
 // are in the machine and how much money is in the machine.
 public String toString() { 
	String output = "";
	double moneyLeft = quarters * .25;
	output += "Gumballs in machine: " + gumballs;
	output += "\nMoney in machine: " + moneyLeft;
	return output;
 }
	public boolean equals(GumMachine other) {
		boolean result = false;
		if ((this.gumballs == other.gumballs) &&
			(this.quarters == other.quarters))
			result = true;
		return result;
	}
	public int compareTo(GumMachine other) {
		int result = 0;
		if (this.quarters > other.quarters)
			result = 1;
		else if (this.quarters < other.quarters)
			result = -1;
		return result;
	}
 
 }