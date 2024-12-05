public class Main {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		list.addLast(10);
		list.addFirst(20);
		list.addLast(30);
		list.addFirst(40);

		System.out.println(list.contains(40));

		list.display();

		list.deleteFirst();
		list.deleteLast();

		System.out.println(" ");
		System.out.println(list.contains(30));
		list.display();
	}
}