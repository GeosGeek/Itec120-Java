/*
*	@author Matt Crichton
*	@version 10/31/18
*/
public class TreasureArraySrv {
	public Treasure min(Treasure[] arr) {
		Treasure result = arr[0];
		Treasure min;
		for(int i = 0; i < arr.length - 1; i++) {
			if (arr[i].getValue() < arr[i + 1].getValue()) {
				min = arr[i];
			if (arr[arr.length - 1].getValue() < min.getValue())
				min = arr[arr.length - 1];
				result = arr[i];
			}
		}
		return result;
	}
	public Treasure max(Treasure[] arr) { 
		Treasure result = arr[0];
		Treasure max;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i].getValue() > arr[i + 1].getValue())
				max = arr[i];
			if (arr[arr.length - 1].getValue() > max.getValue())
				max = arr[arr.length];
				result = arr[i];
		}
		return result;
	}
	public boolean isFound(Treasure[] arr, Treasure t1) {
		boolean found = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(t1))
				found = true;
		}
		return found;
	}
	public int timesFound(Treasure[] arr, Treasure t1) {
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(t1))
				result++;
		}
		return result;
	}
	public boolean searchVal(Treasure[] arr, Treasure t1) {
		boolean result = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].compareTo(t1) == 0)
				result = true;
		}
		return result;
	}
}