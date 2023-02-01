package udemy.dsa.linked.list;

public class SingleLinkedList implements LinkedList {

	Node head;

	int size;

	Node tail;

	// Space Complexity O(1), Time Complexity O(1)
	public void create(int value) {
		Node node = new Node(value);
		this.head = this.tail = node;
		this.size = 1;
	}

	// Space Complexity O(1), Time Complexity O(n)
	public void delete(int location) {
		if (this.head == null) {
			return;
		}
		if (this.size == 1) {
			this.head = this.tail = null;
			this.size--;
			return;
		}
		if (location == 0) {
			this.head = this.head.next;
			this.size--;
			return;
		}
		Node temp = this.head;
		int index = 1;
		while (index < location) {
			temp = temp.next;
			index++;
		}
		if (location >= this.size) {
			if (temp == this.head) {
				this.head = this.tail = null;
				this.size--;
				return;
			}
			temp.next = null;
			this.tail = temp;
			this.size--;
			return;
		}
		temp.next = temp.next.next;
		this.size--;
		if (this.size == 1) {
			this.tail = this.head;
		}
	}

	// Space Complexity O(1), Time Complexity O(1)
	public void destroy() {
		this.head = this.tail = null;
	}

	// Space Complexity O(1), Time Complexity O(n)
	public void insert(int value, int location) {
		Node node = new Node(value);
		if (this.head == null) {
			this.create(value);
			return;
		}
		if (location == 0) {
			node.next = this.head;
			this.head = node;
			this.size++;
			return;
		}
		if (location >= this.size) {
			this.tail.next = node;
			this.tail = node;
			this.size++;
			return;
		}
		Node temp = this.head;
		int index = 1;
		while (index < location) {
			temp = temp.next;
			index++;
		}
		Node next = temp.next;
		temp.next = node;
		node.next = next;
		this.size++;
	}

	public void reverseTraverse() {
		System.out.println("Not applicable for single linked list!");
	}

	// Space Complexity O(1), Time Complexity O(n)
	public boolean search(int value) {
		if (this.head == null) {
			System.out.println("Value not found!");
			return false;
		}
		Node temp = this.head;
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
		Node temp = this.head;
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