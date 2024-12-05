public class BubbleSort {
	public void sort(int[] arr) {
		boolean isSorted;
		for (int i = 0; i < arr.length; i++) {
			isSorted = true; // assume the array is sorted
			for (int j = 0; j < arr.length - 1 -i; j++) {
				if (arr[j] > arr[j+1]) { // swap the two items
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					isSorted = false; // if any swap is done then not sorted
				} // else nothing happens continue;

				System.out.println(i+1 + "iteration");
			}
			if (isSorted)
				return;
		}
	}
}