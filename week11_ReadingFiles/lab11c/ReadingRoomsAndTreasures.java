/*
*	@author Matt Crichton
*	@version 11/9/18
*/

import java.io.*;
import java.util.*;

public class ReadingRoomsAndTreasures 
{
    public static void main(String[] args) throws IOException  
	{
		File quizScores = new File("quiz_scores.txt");
		Scanner quizScan = new Scanner(quizScores);
		String line = "";
		System.out.println("Name  High Low Average");
		while (quizScan.hasNextLine()) {
			//quizScan.useDelimiter(",");
			line = quizScan.nextLine();
			Scanner lineScan = new Scanner(line);
			lineScan.useDelimiter(",");
			System.out.print(lineScan.next() + " ");
			int high = 0;
			int low = 100;
			int sum = 0;
			int quizScore = 0;
			int count = 0;
			while (lineScan.hasNextInt()) {
				num = lineScan.nextInt();
				quizScore = num;
				if (num > high)
					high = num;
				else if (num < low)
					low = num;
				sum += num;
				count++;
				System.out.print(lineScan.nextInt() + " " );
			}
			System.out.println();
		}
    }
}