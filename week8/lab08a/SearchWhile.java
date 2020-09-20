
public class SearchWhile {
	public int timesFound(int[] arr, int num) {
		int count = 0;
		int i = 0;
		while (i < arr.length - 1) {
			if (arr[i] == num)
				count++;
		}
		return count;
	}
	public boolean isFound(int[] arr, int num) {
		boolean found = false;
		int i = 0;
		while (i < arr.length - 1 && found == false) {
			if (arr[i] == num)
				found = true;
		}
		return found;
	}
	public int range(int[] arr) {
		int range = 0;
		int max = arr[0];
		int min = arr[0];
		int i = 0;
		while (i < arr.length - 1) {
			if (arr[i] < min)
				min = arr[i];
			if (arr[i] > max)
				max = arr[i];
		}
		range = max - min;
		return range;
	}
	public int[] reverse(int[] arr) {
		int[] newArr = new int[arr.length];
		int pos2 = 0;
		int pos1 = arr.length - 1;
		while (pos1 >= 0) {
			newArr[pos2] = arr[pos1];
			pos1++;
			pos2++;
		}
		return newArr;
	}
}