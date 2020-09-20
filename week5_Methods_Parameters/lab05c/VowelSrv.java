/*
	@author Matt Crichton
	@version 9/27/18
	This is a service class for the VowelDrv driver class
*/

public class VowelSrv 
{
	// This method takes a string and returns the number of vowels within it.
	public int vowelCount(String str) {
		int count = 0;
		int pos = 0;
		while (pos < str.length()) {
			if (str.charAt(pos) == 'a' || str.charAt(pos) == 'e' ||
				str.charAt(pos) == 'i' || str.charAt(pos) == 'o' ||
				str.charAt(pos) == 'u' || str.charAt(pos) == 'A' ||
				str.charAt(pos) == 'E' || str.charAt(pos) == 'I' ||
				str.charAt(pos) == 'O' || str.charAt(pos) == 'U') {
				count++;
			}
			pos++;
		}
		return count;
	}
	// This method takes a string (str) and returns a string with all the vowels from the
	// input string.
	public String vowelString(String str) {
		String res = "";
		for (int pos = 0; pos < str.length(); pos++)
			if (str.charAt(pos) == 'a' || str.charAt(pos) == 'e' ||
				str.charAt(pos) == 'i' || str.charAt(pos) == 'o' ||
				str.charAt(pos) == 'u' || str.charAt(pos) == 'A' ||
				str.charAt(pos) == 'E' || str.charAt(pos) == 'I' ||
				str.charAt(pos) == 'O' || str.charAt(pos) == 'U')
				res += str.charAt(pos);
		return res;
	}
}