// this Array class lets insertion with fixed size, deletion at index, and search for element index
public class Array {
	public int[] arr; 
	private int count; // insertion counter set to default to 0;

	public Array(int length) {
		arr = new int[length];
	}

	public void insert(int item) { 
		if (count < arr.length) { // if no overflow
			arr[count++] = item; // first arr[count]=item is excuted 
		} else {
			// construct new array with plus one size and copy every thing
			int[] arr2 = new int[arr.length + 1];
			for (int i = 0; i < arr.length; i++) {
				arr2[i] = arr[i];
			}
			arr2[count] = item; // then add the new element at the end
			arr = arr2; // change the original reference of arr to arr2
		}
	}

	public void removeAt(int index) {
		// validate the index
		if (index < 0 || index > arr.length-1) {
			throw new IllegalArgumentException();
		}

		// i've to copy every element except the specified element to the new array
		int[] arr2 = new int[arr.length - 1];

		for (int i = 0, j = 0; i < arr.length; i++, j++) {
			if (i == index) { // skip when matched
				j--;
				continue;
			} else {
				arr2[j] = arr[i];
			}
		}
		arr = arr2; // change the original reference of arr to arr2
	}

	public int indexOf(int item) {
		// check if the item exist
		for (int i = 0; i < arr.length; i++) {
			if (item == arr[i]) {
				return i; // return index
			} 
		}
		return -1; // not found
	}

	public void print() { // not needed 
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}