public class SelectionSort {
	public void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int min = arr[i]; // the first item in the unsorted part 
			int index = i; // index of first item in the unsorted part
			for (int j = i; j < arr.length; j++) {
				if (min > arr[j]) { // if min is greater than items switch
					min = arr[j];
					index = j; // track index number of new min
				}
			}
			// swap min with indexed element
			int temp = arr[i]; 
			arr[i] = min;
			arr[index] = temp;
		}
	}
}