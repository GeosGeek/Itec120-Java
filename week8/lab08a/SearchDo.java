
public class SearchDo {
	public int timesFound(int[] arr, int num) {
		int count = 0;
		int i = 0;
		do {
			if (arr[i] == num)
				count++;
			i++;
		} while(count < arr.length - 1);
		return count;
	}
	public boolean isFound(int[] arr, int num) {
		boolean found = false;
		int i = 0;
		do {
			if (arr[i] == num)
				found = true;
			i++;
		} while(i < arr.length - 1 && found == false);
		return found;
	}
	public int range(int[] arr) {
		int range = 0;
		int min = arr[0];
		int max = arr[0];
		int i = 0;
		do {
			if (arr[i] < min)
				min = arr[i];
			if (arr[i] > max)
				max = arr[i];
		} while(i < arr.length - 1);
		range = max - min;
		return range;
	}
	public int[] reverse(int[] arr) {
		int[] revArr = new int[arr.length];
		int pos1 = arr.length - 1;
		int pos2 = 0;
		do { 
			revArr[pos2] = arr[pos1];
			pos1--;
			pos2++;
		} while(pos2 < arr.length - 1);
		return revArr;
	}
}