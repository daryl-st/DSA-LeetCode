public class Main {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		list.addLast(10);
		list.addFirst(20);
		list.addLast(30);
		list.addFirst(40);

		list.display();

		list.reverse();
		list.display();
	}
}