/*
*
*	@author Matt Crichton
*
*/
import java.util.Arrays;
public class LT8Srv {
/*************
 *  weightedAve - takes two arrays the same length: the first are ints
 *                the second are doubles and represent weights of each
 *                corresponding int in the integer array. The method
 *                calculates the weighted average of all the integers
 *                weighted by corresponding weights in the double array.
 *          NOTE: You may assume the two arrays are the same length.
 *  
 *  weightedAve( [80, 90, 60], [ .25, .25, .5] )   --> 72.5   
 *               because ( 80*.25 + 90*.25 + 60*.5 ) / (.25 + .25 + .5) is 72.5
 *  
 *  weightedAve( [70, 60], [ .3, .3 ] )            --> 65.0
 *               because ( 70*.3 + 60*.3 ) / (.3 + .3) is 65
 *
 *  weightedAve( [], [] )                          --> 0.0
 *
 ************/
 public double weightedAve(int[] nums, double[] weights) {
	double result = 0.0;
	double sumWeight = 0.0;
	if (nums.length > 0 && weights.length > 0) {
		for (int n = 0; n < nums.length; n++) {
			result += nums[n] * weights[n];
			sumWeight += weights[n];
		}
		result = result / sumWeight;
	}
    return result;
 }

/*************
 *  createCharArray - takes two ints representing a number of rows and a number
 *                    of columns and returns a two d array of char, numRows by
 *                    numCols, filled with the given character.
 *
 *      createCharArray(3,5,'k')  -->  [ [k,k,k,k,k],
 *                                       [k,k,k,k,k],
 *                                       [k,k,k,k,k] ]
 *      createCharArray(0,0,'v')  -->  []
 ************/
public char[][] createCharArray(int r, int c, char ch) {
	char[][] result = new char[r][c];
	for (int row = 0; row < r; row ++) {
		for (int col = 0; col < c; col++) {
			result[row][col] = ch;
		}
	}
    return result;
}
/*************
 *  isJagged - takes a 2DArray of char and answers if
 *             the array is jagged.
 *
 *      isJagged( [ [k,k,k,k,k],
 *                  [k,k,k,k,k],
 *                  [k,k,k,k,k] ] )   -->  false
 *
 *      isJagged( [ [t,h,i,s],
 *                  [i,s],
 *                  [j,a,g,g,e,d] ] ) -->  true
 *
 *      isJagged( [ ] )               --> false
 *
 ************/
public boolean isJagged(char[][] cArr) {
	boolean jagged = false;
	int count = 0;
	for (int row = 0; row < cArr.length; row++) {
		for (int col = 0; col < cArr[row].length; col++) {
			count++;
		}
		if (cArr[row].length != count)
			jagged = true;
	}
    return jagged;
 }

/*************
 *  allUpper - takes a 2DArray of char and answers if every
 *             char in the array is an uppercase char.
 *
 *      allUpper( [ [A,B,C],
 *                  [D,E],
 *                  [F,G,H,H,H,H] ] )   -->  true
 *
 *      allUpper( [ [A,B,C],
 *                  [D,E,F],
 *                  [H,b,H] ] )         -->  false
 *
 *      allUpper( [ ] )                 -->  false 
 *
 ************/
 public boolean allUpper( char[][] chArr ) {
	boolean upper = true;
	if (chArr.length > 0) {
		for (int row = 0; row < chArr.length; row++) {
			for (int col = 0; col < chArr[row].length; col++) {
				if (chArr[row][col] < 'A' || chArr[row][col] > 'Z')
					upper = false;
			}
		}
	}
	else
		upper = false;
    return upper;
 }

/*************
 *  remove - takes a 2DArray of char and a char removes
 *           all occurrences of the char from the 2D array.
 *           This method changes the 2D array passed to it.
 *           If a char is removed, the row becomes shorter.
 *  
 *
 *      remove( [ [A,A,B],                changes         [ [B],
 *                [D,E,F],                the array to:     [D,E,F],
 *                [A,A,A,A,H,H] ], 'A' )                    [H,H]    ]
 *
 ************/
 public void remove(char[][] chArr, char ch) {
	for(int row = 0; row < chArr.length; row++) {
		for(int col = 0; col < chArr[row].length; col++) {
			if (chArr[row][col] == ch) {
				chArr[row][col] 
			}
		}
	}
 }
    
}










