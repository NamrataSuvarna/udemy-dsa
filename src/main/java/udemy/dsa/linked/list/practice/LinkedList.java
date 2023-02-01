package udemy.dsa.linked.list.practice;

public class LinkedList {

	Node head;

	int size;

	Node tail;

	public void createLL(int nodeValue) {
		Node newNode = new Node(nodeValue);
		this.head = this.tail = newNode;
		this.size = 1;
	}

	public void insertNode(int nodeValue) {
		if (this.head == null) {
			createLL(nodeValue);
			return;
		}
		Node newNode = new Node(nodeValue);
		this.tail.next = newNode;
		this.tail = newNode;
		this.size++;
	}

	public void traverseLL() {
		Node tempNode = this.head;
		for (int i = 0; i < this.size; i++) {
			System.out.print(tempNode.value);
			if (i != this.size - 1) {
				System.out.print(" -> ");
			}
			tempNode = tempNode.next;
		}
		System.out.println("\n");
	}

}