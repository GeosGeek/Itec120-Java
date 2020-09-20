/*
	@author Matt Crichton
	@version 9/27/18
	This is the driver class
*/
public class VowelDrv {
	public static void main(String[] args){
		VowelSrv obj = new VowelSrv();
		System.out.println("==== Testing the vowelCount method ====");
		// A String length one without a vowel
		System.out.print("Test number 1: ");
		if (obj.vowelCount("h") == 1)
			System.out.println("Pass");
		else
			System.out.println("Fail");
		// A string length one with an upper case vowel
		System.out.print("Test number 2: ");
		if (obj.vowelCount("A") == 1)
			System.out.println("Pass");
		else
			System.out.println("Fail");
		// A string with no vowels
		System.out.print("Test number 3: ");
		if(obj.vowelCount("bfjpv") == 0)
			System.out.println("Pass");
		else
			System.out.println("Fail");
		// An empty string
		System.out.print("Test number 4: ");
		if (obj.vowelCount("") == 0)
			System.out.println("Pass");
		else
			System.out.println("Fail");
		// A string with repeating mixed case vowels
		System.out.print("Test number 5: ");
		if (obj.vowelCount("AwesomE lab tOday") == 7)
			System.out.println("Pass");
		else
			System.out.println("Fail");
		// A string with one lowercase vowel
		System.out.print("Test number 6: " );
		if (obj.vowelCount("i") == 1)
			System.out.println("Pass");
		else 
			System.out.println("Fail");
		// A string with 5 vowels, all lowercase
		System.out.print("Test number 7: ");
		if (obj.vowelCount("hilarious") == 5)
			System.out.println("Pass");
		else 
			System.out.println("Fail");
		// A string with 2 vowels, all upper case
		System.out.print("Test number 8: ");
		if (obj.vowelCount("WINDOWS") == 2)
			System.out.println("Pass");
		else 
			System.out.println("Fail");
		
// **********************************************************************************
		System.out.println("=== Testing the vowelString method ===");
		// A string with multiple lower case letters.
		System.out.print("Test number 1: ");
		if (obj.vowelString("hello").equals("eo"))
			System.out.println("Pass");
		else
			System.out.println("Fail");
		// A string length one with one lower case letter.
		System.out.print("Test number 2: ");
		if (obj.vowelString("a").equals("a"))
			System.out.println("Pass");
		else
			System.out.println("Fail");
		// A string length one with upper case letter.
		System.out.print("Test number 3: ");
		if (obj.vowelString("E").equals("E"))
			System.out.println("Pass");
		else 
			System.out.println("Fail");
		// An empty string
		System.out.print("Test number 4: ");
		if (obj.vowelString("").equals(""))
			System.out.println("Pass");
		else 
			System.out.println("Fail");
		// A string without a vowel.
		System.out.print("Test number 5: ");
		if (obj.vowelString("rtghy").equals(""))
			System.out.println("Pass");
		else 
			System.out.println("Fail");
		// A string with multiple vowels, all upper case.
		System.out.print("Test number 6: ");
		if (obj.vowelString("EXCITING").equals("EII"))
			System.out.println("Pass");
		else
			System.out.println("Fail");
		// A string with repeating mixed case letters.
		System.out.print("Test number 7: ");
		if (obj.vowelString("parAmetErs").equals("aAeE"))
			System.out.println("Pass");
		else 
			System.out.println("Fail");
	}
}