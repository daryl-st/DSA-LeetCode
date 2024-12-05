public class InsertionSort {
	public void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[i] < arr[j-1]) {
					int curr = arr[i];
					arr[j] = arr[j-1];
					arr[j-1] = curr;
					i--;
				}
			}
		}
	}
}