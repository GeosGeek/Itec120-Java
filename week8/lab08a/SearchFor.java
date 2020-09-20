
public class SearchFor {
	public int timesFound(int[] arr, int num) {
		int count = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == num)
				count++;
		}
		return count;
	}
	public boolean isFound(int[] arr, int num) {
		boolean found = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num && found == false)
				found = true;
		}
		return found;
	}
	public int range(int[] arr) {
		int range = 0;
		int min = arr[0];
		int max = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] < min)
				min = arr[i];
			if (arr[i] > max)
				max = arr[i];
		}
		range = max - min;
		return range;
	}
	public int[] reverse(int[] arr) {
		int[] revArr = new int[arr.length];
		int pos1 = arr.length - 1;
		int pos2 = 0;
		for (int i = pos1; i >= 0; i--) {
			revArr[pos2] = arr[i];
			pos2++;
		}
		return revArr;
	}
}