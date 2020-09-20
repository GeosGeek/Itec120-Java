/***********************
 *
 *   LT7Srv - stub methods for Lab Test 7
 *
 *   Author:  Matt Crichton
 *   Date:     11/12/18
 *
 ***********************/
 import java.util.Arrays;
 public class LT7Srv {


/*  for 2 points
    Write a method called sameInTheMiddle that takes an array of int
    and answers if all the elements not including the first and last
    are the same as each other.

        sameInTheMiddle( [4,2,2,2,7] )   --> true
        sameInTheMiddle( [2,2,2,2,7] )   --> true
        sameInTheMiddle( [4,2,2,2] )     --> true
        sameInTheMiddle( [2,2,2,2] )     --> true
        sameInTheMiddle( [5,3,2] )       --> true
        sameInTheMiddle( [2,2,2,9,2] )   --> false
        sameInTheMiddle( [5,2] )         --> false
        sameInTheMiddle( [4] )           --> false
        sameInTheMiddle( [] )            --> false

*/
public boolean sameInTheMiddle(int[] arr) {
	boolean same = false;
	if (arr.length > 2) {
		if (arr[arr.length/2] == arr[(arr.length/2)-1])
			same = true;
	}
    return same;
}

/*  for 1 point
    Write a method called isLower that takes a char and answers if that char is
    a lowercase letter. 

        isLower('a')  --> true
        isLower('A')  --> false
        isLower('&')  --> false
        isLower('8')  --> false
*/
public boolean isLower(char ch) {
	boolean res = false;
	if (ch <= 'z' && ch >= 'a')  
		res = true;
	return res;
}

/*  for 1 point
    Write a method called isValidSpecial that returns true if the given char is
    a '$', '!', or a '#'

        isValidSpecial('$') --> true
        isValidSpecial('!') --> true
        isValidSpecial('#') --> true
        isValidSpecial('A') --> false
        isValidSpecial('%') --> false
*/
public boolean isValidSpecial(char ch) {
	//String validChars = "$!#A%";
	boolean res = false;
	if (ch == '$' || ch == '!' || ch == '#')
		res = true;
	return res;
}

/*  for 2 points
    Suppose a valid password is at least 8 characters long and not more than 16 characters long
    and is made up only of lowercase letters and at least one of the following special characters:
    $, !, or #.

    Write a method called isValidPW that takes a String and answers if that String is a valid password.

        isValidPW("try#this")    --> true
        isValidPW("thi$works!")  --> true
        isValidPW("##########")  --> true (does not require a letter)
        isValidPW("no$go")       --> false (because it is too short)
        isValidPW("HelloWorld!") --> false (contains capital letters)
        isValidPW("thispwistooooolong!") --> false 
*/
public boolean isValidPW(String pw) {
	boolean isValid = false;
	int specialCharCnt = 0;
	if (pw.length() > 7 && pw.length() < 17) {
		for (int i = 0; i < pw.length(); i++) {
			if (pw.charAt(i) == '$' || pw.charAt(i) == '!' || pw.charAt(i) == '#') {
				specialCharCnt++;
			}
			if (pw.charAt(i) <= 'a' && pw.charAt(i) >= 'z' && specialCharCnt > 0) {
				isValid = true;
			}
		}
	}
	else 
		isValid = false;
    return isValid;
}

/*  for 2 points
    Write a method called justLower that takes a String and returns an array of char.
    The returned array contains every character in the String that is a lowercase character.
    The returned array is only as long as it needs to be.

        justLower("AAAaaaAAA")     -->  ['a','a','a']
        justLower("aaa")           -->  ['a','a','a']
        justLower("Try This")      -->  ['r','y','h','i','s']
        justLower("ABCDEFG")       -->  []
        justLower("")              -->  []
*/
public char[] justLower(String s) {
	int cnt = 0;
	String res = "";
	for (int i = 0; i < s.length(); i++) {
		if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
			res += s.charAt(i);
			cnt++;
		}
	}
	char[] lowerArr = new char[res.length()];
	for (int i = 0; i < res.length(); i++)
		lowerArr[i] = res.charAt(i);
    return lowerArr;
}

/*  for 2 points
    Write a method called cntGumBalls that takes an array of GumMachine objects
    and returns the total number of gumballs contained in all of the GumMachines.

    cntGumBalls( [] )  --> 0
    
*/
public int cntGumBalls(GumMachine[] machines) {
	int gumballs = 0;
	
	for (int i = 0; i <  machines.length; i++) {
		gumballs += machines[i].getGumBalls();
	}
	
    return gumballs; 
}

 }