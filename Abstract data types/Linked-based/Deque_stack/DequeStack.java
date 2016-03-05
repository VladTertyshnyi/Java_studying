package linkedDataTypes;

public class DequeStack {
	private Linked_Deque D;

	public DequeStack() {
		this.D = new Linked_Deque();
	}

	public int size() {
		return (this.D.size());
	}
	public boolean empty() {
		return (this.D.empty());
	}
	
	public void push(int element) {
		this.D.insertLast(element);
	}
	
	public int peek() {
		if(this.D.empty()) {
			System.out.println("Stack is empty. Nothing to peek.");
			return (0);
		}
		return (this.D.last());
	}
	public int pop() {
		if(empty()) {
			System.out.println("Stack is empty. Nothing to peek.");
			return (0);
		}
		return (this.D.removeLast());						
	}

}
