package adt_proj;

public class List {
	private final int STANDART_CAPACITY = 1000;
	private int[] list;
	private int size;

	public List() {
		list = new int[STANDART_CAPACITY];
		size = 0;
	}

	public List(int capacity) {
		list = new int[capacity];
		size = 0;
	}

	public boolean full() {
		return (list.length == size);
	}

	public boolean empty() {
		return (0 == size);
	}

	public boolean add(int element) {
		if (full()) {
			System.out.println("Can`t add an element - list is full.");
			return (false);
		}
		list[size] = element;
		size++;
		return (true);
	}

	public boolean addByIndex(int index, int element) {
		if (full()) {
			System.out.println("Can`t add an element - list is full.");
			return (false);
		}
		for (int i = size; i >= index; i--) {
			list[i] = list[i - 1];
		}
		list[index] = element;
		size++;
		return (true);
	}

	public int removeByIndex(int index) {
		if (empty()) {
			System.out.println("List is empty. Nothing to delete.");
			return (0);
		}
		int temp = list[index];
		for (int i = index; i < size; i++) {
			list[i] = list[i + 1];
		}
		list[size] = 0;
		size--;
		return (temp);
	}

	public boolean remove(int element) {
		if (empty()) {
			System.out.println("List is empty. Nothing to delete.");
			return (false);
		}
		for (int i = 0; i < size; i++) {
			if (list[i] == element) {
				removeByIndex(i);
				return (true);
			}
		}
		return (false);
	}

	public int getByIndex(int index) {
		if (index >= size) {
			System.out.println("Incorrect index.");
			return (0);
		}
		return (list[index]);
	}

	public void setByIndex(int index, int element) {
		if (index >= size) {
			System.out.println("Incorrect index.");
			return;
		}
		list[index] = element;
	}

	/**
	 * Testing function. <br/>
	 * Prints the list out.
	 */
	public void print() {
		if (empty()) {
			System.out.println("List is empty.");
			return;
		}
		for (int i = 0; i < size; i++)
			System.out.printf("%d ", list[i]);
		System.out.println("");
	}

	/**
	 * Testing function. <br/>
	 * 
	 * @return Capacity of the list.
	 */
	public int getSize() {
		return (size);
	}

}
