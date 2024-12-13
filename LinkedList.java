public class LinkedList {
	private class Node { 
		private int value;
		private Node next;

		public Node(int value) {
			this.value = value;
			next = null;
		}
	}

	private Node head;
	private Node tail;
	private int counter = 0;

	// addFirst
	public void addFirst(int value) {
		var node = new Node(value); // create a node with the value
		if (head == null) // list is empty
			head = tail = node;
		else {
			node.next = head;
			head = node;
		}
		counter++;
	}

	// addLast
	public void addLast(int value) {
		var node = new Node(value); // create a node with the value
		if (head == null && tail == null) // list is empty
			head = tail = node;
		else { // add it to last and make it the new tail
			tail.next = node;
			tail = node;
		}
		counter++;
	} 

	// deleteFirst
	public void deleteFirst() {
		if (head == null) { // list is empty
			counter = 0;
			return; 
		} 
		head = head.next;
		counter--;
	}

	// deleteLast
	public void deleteLast() {
		if (head == null) // list is empty
			return; 	

		if (head == tail) { // list got only one item
			head = tail = null;
			return; 	
		} 

		Node temp = getPreviousNode();
		temp.next = null; // break the link
		tail = temp;
		counter--;
	}

	public Node getPreviousNode() {
		Node temp = head;
		if (head == null) // list is empty
			return null; 

		if (temp.next == null) {
			return temp;
		}

		while (temp.next != tail)  // find the node before the tail
			temp = temp.next;
		return temp;
	}

	// contains
	public boolean contains(int value) {
		Node temp = head;
		while (temp != null) {
			if (temp.value == value) return true;
			temp = temp.next; // Go-to next one
		}
		return false;
	}

	// indexOf
	public int indexOf(int value) {
		int index = 0;
		Node temp = head; // to avoid direct manipulation

		for (int i = 0; i <= counter; i++) {
			if (temp.value == value)
				return i; // found
			temp = temp.next;
			if (temp == null) break; //we reached the end
		}
		return -1; // Not found
	}

	// getSize
	public int getSize() {
		if (head == null) {
			return 0;
		}
		return counter;
	}

	// getArray
	public int[] toArray() {
		Node temp = head;
		int[] arr = new int[counter];
		for (int i = 0; i < counter; i++) {
			arr[i] = temp.value;
			temp = temp.next;
		}
		return arr;
	}

	// reverse
	public void reverse() { // it works now but need refactoring
		Node temp = getPreviousNode();
		Node first = tail;
		if (temp == null) return; // list is empty

		while (temp != head) {
			tail.next = temp;
			tail = temp;
			temp = getPreviousNode();
		}
		tail.next = temp;
		tail = temp;
		head = first;
	}

	// print the linkedList
	public void display() {
		Node temp = head; // to avoid direct manipulation

		if (head == null) {
			System.out.println("list is empty");
			return;
		}

		for (int i = 0; i < counter; i++) { // we already know the size of the list
			if (i != 0)
				System.out.print(" -> ");
			System.out.print(temp.value);
			temp = temp.next;
		}
		System.out.println(' ');
	}
}