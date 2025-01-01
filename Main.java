public class Main {
	public static void main(String[] args) {
		Stacks stack = new Stacks();

		stack.push(10);
		stack.pop();
		stack.push(20);
		stack.push(30);
		stack.print();
		stack.pop();
		stack.print();
	}
}