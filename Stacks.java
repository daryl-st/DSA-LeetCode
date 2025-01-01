// stacks are used mainly to implement the undo buttons, syntax checking
// coz they use Last In First Out(LIFO) principle
// The main operations on stack are push(), pop(), peek(), isEmpty()

// import java.util.*;

// implement stack with integer array
public class Stacks {
	int[] arr = new int[0];
	int count = 0;

	// push
	public void push(int item) {
		// construct new array with plus one size and copy every thing
		int[] arr2 = new int[arr.length + 1];
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i];
		}
		// arr2[count] is executed first
		arr2[count++] = item; // then add the new element at the end
		arr = arr2; // change the original reference of arr to arr2
	}

	// pop
	public int pop() {
		if (isEmpty()) 
			throw new IllegalArgumentException(); // if stack is empty
		
		int last = arr[arr.length - 1]; 

		int[] arr2 = new int[arr.length - 1]; // create new arr with less one size
		for (int i = 0; i < arr2.length; i++)
			arr2[i] = arr[i];
		
		arr = arr2;
		count--;
		return last;
	}

	// peek
	public int peek() {
		return arr[arr.length -1]; // retun the last element
	}

	// isEmpty
	public boolean isEmpty() {
		if (arr.length == 0) 
			return true;
		else 
			return false;
	}

	// print 
	public void print() { // not needed 
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}


	// reversing string
	// public String reverse(String text) {
	// 	Stack<Character> stack = new Stack<>();

	// 	for(char ch : text.toCharArray()) // in java we can't iterate over string to we change it to char array.
	// 		stack.push(ch);

	// 	String reversed = "";
	// 	while (!stack.empty())
	// 		reversed += stack.pop();

	// 	return reversed;
	// }

	// syntax checking
	// public boolean check(String text) {
	// 	Stack<Character> stack = new Stack<>();

	// 	for (char ch : text.toCharArray()) {
	// 		// if (ch == '(' || ch == '[' || ch == '{' || ch == '<') // is left bracket 
	// 		var leftBrackets = Arrays.asList('(', '[', '{', '<');
	// 		if (leftBrackets.contains(ch))
	// 			stack.push(ch);

	// 		// if (ch == ')' || ch == ']' || ch == '}' || ch == '>') { // is right bracket
	// 		var rightBrackets = Arrays.asList(')', ']', '}', '>'); // initializing it everytime takes too much memory
	// 		if (rightBrackets.contains(ch)) {						// we can initialize it once at the top
	// 			if (stack.empty()) return false;

	// 			var temp = stack.pop();
	// 			if (								
	// 				(ch == ')' && temp != '(') ||	// check left & right brackets
	// 				(ch == '[' && temp != '[') ||	// we can always extract this checking to private methods
	// 				(ch == '}' && temp != '{') ||
	// 				(ch == '>' && temp != '<') 
	// 			) return false;
	// 		}
	// 	}

	// 	return stack.empty();
	//}
} 