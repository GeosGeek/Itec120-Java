/*
*
* @author Matt Crichton
* @version 11/13/18
*
*/
public class MatrixSrv {
	public int sum(int[][] arr) {
		int sum = 0;
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				sum += arr[row][col];
			}
		}
		return sum;
	}
	public int min(int[][] arr) {
		int min = arr[0][0];
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if (arr[row][col] < min)
					min = arr[row][col];
			}
		}
		return min;
	}
	public int max(int[][] arr) {
		int max = arr[0][0];
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if (arr[row][col] > max) 
					max = arr[row][col];
			}
		}
		return max;
	}
	public int range(int[][] arr) {
		int range = 0;
		
		int max = max(arr);
		int min = min(arr);
		
		range = max - min;
		return range;
	}
	public int[] sumRows(int[][] arr) {
		int[] sumRows = new int[arr.length];
		int cnt = 0;
		for (int row = 0; row < arr.length; row++) {
			int rowSum = 0;
			for (int col = 0; col < arr[row].length; col++) {
				rowSum += arr[row][col];
			}
			sumRows[cnt] += rowSum;
			cnt++;
		}
		return sumRows;
	}
	public boolean isFound(int[][] arr, int num) {
		boolean found = false;
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if (arr[row][col] == num)
					found = true;
			}
		}
		return found;
	}
	public String print(int[][] arr) {
		String output = "";
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				output += " " + arr[row][col];
			}
		}
		return output; 
	}
}