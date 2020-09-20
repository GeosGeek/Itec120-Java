//
//author@ Matt Crichton
//version@ 9/7/18
//
import java.util.Random;
import java.util.Scanner;
public class RandomTest
{
	public static void main(String[] args)
	{
		Random generator = new Random();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the amount of numbers: ");
		final int RANGE_SIZE = scan.nextInt();
		System.out.print("Enter the maximum value: ");
		final int MAX = scan.nextInt();
		System.out.print("Enter the minimum value: ");
		final int MIN = scan.nextInt();
		System.out.println("Generating " + RANGE_SIZE + " random numbers in range " + 
							"[" + MIN + "," + MAX + "]");
		for (int n = 0; n < RANGE_SIZE; n++){
			int random = generator.nextInt((MAX - MIN) + 1) + MIN;
			System.out.println(" " + random);
		}
	}
}