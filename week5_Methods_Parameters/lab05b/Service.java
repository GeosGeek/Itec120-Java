/***********************
 *
 *   Service - This class contains methods, or services which will be called
 *             and tested by code in the main method in Driver.java.
 *
 *   Author:   Matt Crichton 
 *   Date:     9/26/18
 *
 ***********************/
public class Service {

/********
 *
 *   mult - takes two ints and returns an in that is the product of the given ints.
 *
 *          mult(5,3)    --> 15 
 *          mult(-3,2)   --> -6 
 *          mult(0,4)    -->  0
 *          mult(0,0)    -->  0 
 *
 ********/
public int mult(int num1, int num2) {
    return num1*num2;
}
/********
 *
 *   mult - takes an int and a String and returns a String which is the given
 *          String repeated the given int number of times.
 *
 *          mult("Hey",3)         --> "HeyHeyHey"
 *          mult("RU",1)          --> "RU"
 *          mult("",5)            --> ""
 *          mult("anything",0)    --> ""
 *
 ********/
 // This is a stub method, meaning it compiles and runs, but does not yet
 // work correctly. It just returns the empty String, so the driver runs
 // but this method doesn't yet return the right answer. The body of the
 // method must be written (by you).
 public String mult(String word, int times) {
    int count = 0;
	String str = "";
	while (count < times){
		str += word;
		count++;
	}	
	return str;
 }

/********
 *
 *   mult - takes a String and an int and returns a String which is the given
 *          String repeated the given int number of times.
 *
 *          mult(3,"Hey")         --> "HeyHeyHey"
 *          mult(1,"RU")          --> "RU"
 *          mult(5,"")            --> ""
 *          mult(0,"anything")    --> ""
 *
 ********/
public String mult(int times, String word) {
		int count = 0;
		String str = "";
		while (count < times) {
				str += word;
				count++;
		}
		return str;
		}

/********
 *
 *   mult - takes two ints and returns a double that is the product of the given ints.
 *
 *          mult(5,3)    --> 15.0
 *          mult(-3,2)   --> -6.0
 *          mult(0,4)    -->  0.0
 *          mult(0,0)    -->  0.0
 *
 ********/
 /*
public double mult(int n1, int n2) {
	double res = 0.00;
	res = n1+n2;
	return res;
}
*/
	// Java compiler does not use the return type to distinguish between methods
/********
 *
 *   containsLower - takes a String and returns true if the given String
 *                   contains a lowercase letter.
 *
 *          containsLower("Yippee!")    --> true
 *          containsLower("WOW!")       --> false
 *          containsLower("$4.56")      --> false
 *          containsLower("")           --> false
 *
 ********/
 public boolean isLowerCase(String str) {
	 boolean lowerPresent = false;
	 int count = 0;
	 while (count < str.length()) {
		if (str.charAt(count) >= 'a' && str.charAt(count) <= 'z')
			lowerPresent = true;
		count++;
	 }
	 return lowerPresent;
 }
 // The following method returns an int, which is the area of a square/rectangle
 public int area(int width, int height) {
	 return width * height;
 }
}
