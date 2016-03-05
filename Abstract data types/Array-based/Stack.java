package linearDataTypes;

public class Stack {
	private static final int MAX_CAPACITY = 1000;
	private int stackArr[];
	private int top;

	public Stack() {
		stackArr = new int[MAX_CAPACITY];
		top = -1;
	}

	public Stack(int cap) {
		stackArr = new int[cap];
		top = -1;
	}

	public int size() {
		return (top + 1);
	}

	public boolean empty() {
		return (top < 0);
	}

	public int peek() {
		if (empty()) {
			System.out.println("Stack is empty.");
			return (0);
		}
		return (stackArr[top]);
	}

	public void push(int element) {
		if (size() == stackArr.length) {
			System.out.println("Stack is full.");
			return;
		}
		top++;
		stackArr[top] = element;
	}

	public int pop() {
		if (empty()) {
			System.out.println("Stack is empty.");
			return (0);
		}
		int temp = stackArr[top];
		stackArr[top] = 0;
		top--;
		return (temp);
	}

	/**
	 * Testing function. <br>
	 * Displays all the elements of the stack.
	 */
	public void print() {
		if (empty()) {
			System.out.println("Stack is empty.");
			return;
		}
		for (int i = 0; i <= top; i++) {
			System.out.printf("%d ", stackArr[i]);
		}
		System.out.println("");
	}

	/**
	 * Testing function.
	 * 
	 * @return Capacity of the stack.
	 */
	public int getCapacity() {
		return (stackArr.length);
	}

	/**
	 * Fun function. <br>
	 * Reverse an array with help of stack!
	 * @return Reversed array
	 */
	public Integer[] reverse(Integer[] a) {
		Stack s = new Stack(a.length);
		Integer[] b = new Integer[a.length];
		for (int i = 0; i < a.length; i++) // add elements to the stack. Now
											// they are reversed
			s.push(a[i]);
		for (int i = 0; i < a.length; i++) // pop elements from stack to the
											// another array - in the reversed
											// order
			b[i] = s.pop();
		return (b);
	}
}
