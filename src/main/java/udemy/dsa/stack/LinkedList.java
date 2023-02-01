package udemy.dsa.stack;

public class LinkedList {

	public Node head;

	public int size;

	public Node tail;

	public void delete(int position) {
		// empty linked list
		if (this.head == null) {
			this.size = 0;
			return;
		}
		// start of linked list
		if (position == 0) {
			this.head = this.head.next;
			this.size--;
			return;
		}
		// end of linked list
		if (position >= size) {
			Node temp = this.head;
			for (int i = 0; i < this.size - 1; i++) {
				temp = temp.next;
			}
			temp.next = null;
			this.tail = temp;
			this.size--;
			return;
		}
		// middle of linked list
		Node temp = this.head;
		for (int i = 0; i < position - 1; i++) {
			temp = temp.next;
		}
		temp.next = temp.next.next;
		this.size--;
	}

	public void insert(int value, int position) {
		Node node = new Node(value);
		// initializing linked list
		if (this.head == null) {
			this.head = this.tail = node;
			this.size = 1;
			return;
		}
		// start of linked list
		if (position == 0) {
			node.next = this.head;
			this.head = node;
			this.size++;
			return;
		}
		// end of linked list
		if (position >= size) {
			this.tail.next = node;
			this.tail = node;
			this.size++;
			return;
		}
		// middle of linked list
		Node temp = this.head;
		for (int i = 0; i < position - 1; i++) {
			temp = temp.next;
		}
		Node tempNext = temp.next;
		temp.next = node;
		node.next = tempNext;
		this.size++;
	}

}