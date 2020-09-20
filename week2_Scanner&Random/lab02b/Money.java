/**
author@ Matt Crichton
version@ 9/5/18
This code uses a Scanner to calculate the bills needed
to complete a cash interaction. 
**/
import java.util.Scanner;
public class Money
{
	public static void main(String[] args)
	{
		// constants showing # of dollars in each
		final int TWENTY = 20;
		final int TEN = 10;
		final int FIVE = 5;
		final int ONES = 1;
		final int QUARTERS = 25;
		final int DIMES = 10;
		final int NICKELS = 5;
		final int PENNIES = 1;
		
		System.out.print("Enter dollars: ");
		// Import scanner for user input
		Scanner scan = new Scanner(System.in);
		int payment = scan.nextInt();
		// get the number of bils needed then update payment
		int twenties = payment / TWENTY;
		payment = payment % TWENTY;
		int tens = payment / TEN;
		payment = payment % TEN;
		int fives = payment / FIVE;
		payment = payment % FIVE;
		int ones = payment;
		payment = payment % ONES;
		
		System.out.print("Enter cents: ");
		int coins = scan.nextInt();
		int quarters = coins / QUARTERS;
		coins = coins % QUARTERS;
		int dimes = coins / DIMES;
		coins = coins % DIMES;
		int nickels = coins / NICKELS;
		coins = coins % NICKELS;
		int pennies = coins / PENNIES;
		
		
		System.out.println(twenties + " twenty dollar bills");
		System.out.println(tens + " ten dollar bills");
		System.out.println(fives + " five dollar bills");
		System.out.println(ones + " one dollar bills");
		System.out.println(quarters + " quarters");
		System.out.println(dimes + " dimes");
		System.out.println(nickels + " nickels");
		System.out.println(pennies + " pennies");
		
	}
}