/*
*	@author Matt Crichton
*	@version 11/7
*/

import java.io.*;
import java.util.Scanner;

public class FileIO
{
    public static void main(String[] args) throws IOException 
    {
		File startFile = new File("start.txt");
		Scanner scanStart = new Scanner(startFile);
		while (scanStart.hasNextLine()) {		// This loop prints all lines in start file
			String line = scanStart.nextLine();
			System.out.println(line);
		}
		File scoresFile = new File("scores.txt");
		Scanner scanScore = new Scanner(scoresFile);		// Scan in the scoresFile
		while (scanScore.hasNextLine()) {
			String line = scanScore.nextLine();
			Scanner lineScan = new Scanner(line);
			lineScan.useDelimiter(",");
			System.out.println("Line: " + line);
			// Find the high, low, sum, and avg of the quiz scores on each line
			int high = 0;
			int low = 100;
			int sum = 0;
			int quizScore = 0;
			int count = 0;
			System.out.print("Score: ");
			while (lineScan.hasNextInt()) {
				int num = lineScan.nextInt();
				int score = num;
				System.out.print(" " + score + " ");
				quizScore = num;
				if (num > high)
					high = num;
				else if (num < low)
					low = num;
				sum += num;
				count++;
			}
			double avg = (double)sum / (double)count;
			System.out.println();
			System.out.println("High: " + high + "  Low: " + low + "  Sum: " + sum
					+ "  Avg: " + avg);
			System.out.println();
		}
    }
}