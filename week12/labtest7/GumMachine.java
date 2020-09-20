/***********************
 *
 *   GumMachine - class modeling a gumball machine
 *
 *   Author:   Shawn Brenneman
 *   Date:     2018-Oct
 *
 ***********************/
 public class GumMachine {

 // Instance data

    private int gumBalls;
    private int quarters;
    private final int PIECES_PER_QUARTER = 6;
    private final int CAPACITY = 475;

 // Constructors
    
    public GumMachine(int gum) {
        if (gum < CAPACITY){
            this.gumBalls = gum;
        } else {
            this.gumBalls = CAPACITY;
        }
        this.quarters = 0;
    }
    public GumMachine() {
        this.gumBalls = CAPACITY;
        this.quarters=0;
    }

 // Getter for gumBalls

    public int getGumBalls() {
        return gumBalls;
    }

 // the buyGum method 

    public int buyGum() {
        int gumBallsDispensed = 0;
        this.quarters++;
        if (this.gumBalls >= PIECES_PER_QUARTER) {
            this.gumBalls -= PIECES_PER_QUARTER;
            gumBallsDispensed = PIECES_PER_QUARTER;
        } else {
            gumBallsDispensed = this.gumBalls;
            this.gumBalls = 0;
        }
        return gumBallsDispensed;
    }

 // the serviceMachine method 

    public double serviceMachine() {
        this.gumBalls = CAPACITY;
        double moneyRetrieved = this.quarters * 0.25;
        this.quarters = 0;
        return moneyRetrieved;
    }

 // the isEmpty method 

    public boolean isEmpty() {
        return (this.gumBalls <= 0);
    }

 // equals and compareTo

    public boolean equals(GumMachine other) {
        return (this.gumBalls == other.gumBalls && this.quarters == other.quarters);
    }
    public int compareTo (GumMachine other) {
        return this.quarters - other.quarters;
    }

 // the toString method 

    public String toString() {
        String result = "\n\tGum machine with " + this.gumBalls + " gumballs and $";
        int totalCents = quarters*25; 
        int dollars = totalCents/100;
        int cents = totalCents%100;
        result += dollars + ".";
        result += cents;
        if (cents/10 == 0) {
            result += "0";
        }
        return result;
    }
 }