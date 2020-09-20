/**
author@ Matt Crichton
version@ 9/3/18
**/

public class BillsCoins
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
		final int NICKELS = 05;
		final int PENNIES = 01;
		
		int payment = 57;
		// get the number of bils needed then update payment
		int twenties = payment / TWENTY;
		payment = payment % TWENTY;
		int tens = payment / TEN;
		payment = payment % TEN;
		int fives = payment / FIVE;
		payment = payment % FIVE;
		int ones = payment;
		payment = payment % ONES;
		
		int coins = 49;
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