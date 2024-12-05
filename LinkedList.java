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

	// addFirst
	public void addFirst(int value) {
		var node = new Node(value); // create a node with the value
		if (head == null) // list is empty
			head = tail = node;
		else {
			node.next = head;
			head = node;
		}
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
	} 

	// deleteFirst
	public void deleteFirst() {
		if (head == null) return; // list is empty
		head = head.next;
	}

	// deleteLast
	public void deleteLast() {
		Node temp = head;
		while (temp.next != tail)  // find the node before the tail
			temp = temp.next;

		temp.next = null; // break the link
		tail = temp;
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
		Node temp = head; // to avoid playing with the list
		for (int i = 0; i <= index; i++) {
			if (temp.value == value)
					return index; // if found break;

			temp = temp.next;
			index++; // count each iteration that took to reach the desired number

			if (temp == null) break; //we reached the end
		}
		return -1; // Not found
	}

	// print the linkedList
	public void display() {
		int count = 1;
		Node temp = head; // to avoid direct manipulation
		for (int i = 0; i < count; i++) {
			if (temp.next != null)
				count++;

			if (i != 0)
				System.out.print(" -> ");

			System.out.print(temp.value);
			temp = temp.next;
		}
		System.out.println(' ');
	}
}