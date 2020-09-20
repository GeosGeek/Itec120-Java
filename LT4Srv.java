/***********************
 *
 *   LT4Srv - contains methods for Lab Quiz 4
 *
 *   @author:   Matt Crichton 
 *   @date:     10/8/18
 *
 *   -----------------------------------------------------------
 *   README NOTE README NOTE README NOTE README NOTE README NOTE 
 *   -----------------------------------------------------------
 *   For the purpose of this lab quiz the ONLY String methods
 *   you may use are charAt() and length().
 *   -----------------------------------------------------------
 *
 ***********************/
public class LT4Srv {

/* *********************
 *
 * smallest - takes three integers and returns the smallest one. 
 *
 *     smallest(5, 2, 1)   -->  1
 *     smallest(2, 2, 1)   -->  1
 *     smallest(2, 2, 6)   -->  2
 *     smallest(12, -2, 4) --> -2 
 *     smallest(0, 7, 3)   -->  0
 *     smallest(0, -7, 3)  --> -7 
 * 
 * *********************/
public int smallest(int num1, int num2, int num3) {

    int smallest = num1;
	if (num2 < num1) {
		if (num2 < num3)
			smallest = num2;
		else 
			smallest = num3;
	}
	else if (num2 < num3) {
		if (num2 < num3)
			smallest = num2;
		else
			smallest = num3;
	}
	else if (num3 < num1)
		smallest = num3;
	return smallest;
}
/* *********************
 *
 * buildString - takes four parameters: num1, char1, num2, and char2
 *    and returns a String comprised of num1 occurrences of char1 followed
 *    by num2 occurrences of char2 
 *
 *    buildString(3,'#', 5, 'a')  -->  "###aaaaa"
 *    buildString(1,'$', 1, '5')  -->  "$5"
 *    buildString(0,'8', 0, 'W')  -->  ""
 *    buildString(4,'$', 0, 'G')  -->  "$$$$"
 * 
 * *********************/
public String buildString(int num1, char char1, int num2, char char2)
{
	String s1 = "";
	String s2 = "";
	String result = "";
	for (int i = 0; i < num1; i++) {
		s1 += char1;
	}
	for (int i = 0; i < num2; i++) {
		s2 += char2;
	}
	result = s1 + s2;
    return result;
}
/* *********************
 *
 * firstCharAppearsAgain - returns true if the first character in the
 *     given String appears a second time later in the String
 *
 *     firstCharAppearsAgain("aba")           --> true
 *     firstCharAppearsAgain("abracadabra")   --> true
 *     firstCharAppearsAgain("Abracadabra")   --> false
 *     firstCharAppearsAgain("xxxxxxxx")      --> true
 *     firstCharAppearsAgain("*")             --> false
 *     firstCharAppearsAgain("")              --> false
 * 
 * *********************/
public boolean firstCharAppearsAgain(String str) {
    if (str.length() > 0) {
		char firstChar = str.charAt(0);
		int n = 0;
		int count = 0;
		while (n < str.length()) {
			if (str.charAt(n) == firstChar) {
				count++;
			}
			n++;
		}
	if (count > 1)
		return true;
	}
    return false;
}
/* *********************
 *
 * squeze - returns a String which is the given String with runs of the same
 *     consecutive characters replaced with only one of those characters.
 *
 *     squeze("tatter")         --> "tater"   
 *     squeze("aa55555cccc333") --> "a5c3"
 *     squeze("Rrrrrrrr")       --> "Rr"
 *     squeze("Mississippi")    --> "Misisipi"
 *     squeze("ha ha ha")       --> "ha ha ha"
 *     squeze("bwaaah haaah")   --> "bwah hah"
 *     squeze("")               --> ""
 * 
 * *********************/
public String squeze(String str) {
	String result = "";
	int n = 0;
	while (n < str.length()) {
		if (n != str.length() - 1) {
			if (str.charAt(n) != str.charAt(n + 1))
				result += str.charAt(n);
		}
		else 
			result += str.charAt(str.length() - 1);
		n++;
	}
    return result;
}

}