/*
	@author Matt Crichton
	@version 9-21-18
*/
import java.util.*;
public class Vowel
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		final String vowels = "aeiou";
		String vowelsPresent = "";
		int count = 0;
		System.out.println("Welcome to the vowel counter!"
					+ "\nEnter a sentence (type Quit to quit): ");
		String sentence = scan.nextLine();
		String quit = "quit";
		while (!sentence.equalsIgnoreCase("quit"))
		{
			vowelsPresent = "";
			count = 0;
			while (count < sentence.length())
			{
				char letter = sentence.charAt(count);
				// if the char at sentence index equals any char in vowels constant,
				// increment count
				if (letter == 'a' || letter == 'A')
					vowelsPresent += letter;
				else if (letter == 'e' || letter == 'E')
					vowelsPresent += letter;
				else if (letter == 'i' || letter == 'I')
					vowelsPresent += letter;
				else if (letter == 'o' || letter == 'O')
					vowelsPresent += letter;
				else if (letter == 'u' || letter == 'U')
					vowelsPresent += letter;
				count++;
			}
			System.out.println("There are " + vowelsPresent.length() + " vowels in that sentence."
						+ "\n" + sentence + "\nThey are: " + vowelsPresent);
			
			System.out.println("\nEnter a sentence (type Quit to quit): ");
			sentence = scan.nextLine();
		}		
	}
}