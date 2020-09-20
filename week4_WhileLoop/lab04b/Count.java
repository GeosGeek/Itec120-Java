/*
	@author Matt Crichton
	@version 9/19/18
*/
import java.util.*;
public class Count
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a starting number: ");
		int startNum = scan.nextInt();
		System.out.print("Enter an ending number: " );
		int endNum = scan.nextInt();
		int sum = 0;
		int num = startNum; 
		if (startNum > endNum)
		{
			while (num > endNum - 1)
			{
				System.out.println(num);
				sum += num;
				num --;
			}
		}
		else 
		{	
			while (num < endNum + 1)
			{
				System.out.println(num);
				sum += num;
				num ++;
			}
		}
		System.out.println("The sum of the numbers from " + startNum 
				+ " to " + endNum + " is " + sum);
	}
}