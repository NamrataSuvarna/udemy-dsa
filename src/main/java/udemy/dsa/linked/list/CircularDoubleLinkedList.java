package udemy.dsa.linked.list;

public class CircularDoubleLinkedList implements LinkedList {

	DoubleNode head;

	int size;

	DoubleNode tail;

	// Space Complexity O(1), Time Complexity O(1)
	public void create(int value) {
		DoubleNode doubleNode = new DoubleNode(value);
		doubleNode.previous = doubleNode.next = doubleNode;
		this.head = this.tail = doubleNode;
		this.size = 1;
	}

	// Space Complexity O(1), Time Complexity O(n)
	public void delete(int location) {
		if (this.head == null) {
			return;
		}
		if (this.size == 1) {
			this.head.previous = this.head.next = this.head = this.tail = null;
			return;
		}
		if (location == 0) {
			this.head = this.head.next;
			this.head.previous = this.tail;
			this.tail.next = this.head;
			this.size--;
			return;
		}
		if (location >= this.size) {
			this.tail = this.tail.previous;
			this.tail.next = this.head;
			this.head.previous = this.tail;
			this.size--;
			return;
		}
		DoubleNode temp = this.head;
		int index = 1;
		while (index < location) {
			temp = temp.next;
			index++;
		}
		temp.next = temp.next.next;
		temp.next.previous = temp;
		this.size--;
	}

	// Space Complexity O(1), Time Complexity O(1)
	public void destroy() {
		DoubleNode temp = this.head;
		for (int i = 0; i < this.size; i++) {
			temp.previous = null;
			temp = temp.next;
		}
		this.head = this.tail = null;
	}

	// Space Complexity O(1), Time Complexity O(n)
	public void insert(int value, int location) {
		DoubleNode doubleNode = new DoubleNode(value);
		if (this.head == null) {
			this.create(value);
			return;
		}
		if (location == 0) {
			doubleNode.previous = this.tail;
			doubleNode.next = this.head;
			this.head.previous = doubleNode;
			this.head = doubleNode;
			this.tail.next = doubleNode;
			this.size++;
			return;
		}
		if (location >= this.size) {
			doubleNode.next = this.head;
			doubleNode.previous = this.tail;
			this.tail.next = doubleNode;
			this.tail = doubleNode;
			this.head.previous = doubleNode;
			this.size++;
			return;
		}
		DoubleNode temp = this.head;
		int index = 1;
		while (index < location) {
			temp = temp.next;
			index++;
		}
		doubleNode.next = temp.next;
		doubleNode.previous = temp;
		doubleNode.next.previous = doubleNode;
		temp.next = doubleNode;
		this.size++;
	}

	// Space Complexity O(1), Time Complexity O(n)
	public void reverseTraverse() {
		if (this.tail == null) {
			System.out.println("Linked list is empty!");
			return;
		}
		DoubleNode temp = this.tail;
		for (int i = 0; i < this.size; i++) {
			System.out.print(temp.value);
			if (i != this.size - 1) {
				System.out.print(" <- ");
			}
			temp = temp.previous;
		}
		System.out.println();
	}

	// Space Complexity O(1), Time Complexity O(n)
	public boolean search(int value) {
		if (this.head == null) {
			System.out.println("Value not found!");
			return false;
		}
		DoubleNode temp = this.head;
		for (int i = 0; i < this.size; i++) {
			if (temp.value == value) {
				System.out.println("Value -> " + value + " found at location -> " + i);
				return true;
			}
			temp = temp.next;
		}
		System.out.println("Value " + value + " not found!");
		return false;
	}

	// Space Complexity O(1), Time Complexity O(n)
	public void traverse() {
		if (this.head == null) {
			System.out.println("Linked list is empty!");
			return;
		}
		DoubleNode temp = this.head;
		for (int i = 0; i < this.size; i++) {
			System.out.print(temp.value);
			if (i != this.size - 1) {
				System.out.print(" -> ");
			}
			temp = temp.next;
		}
		System.out.println();
	}

}