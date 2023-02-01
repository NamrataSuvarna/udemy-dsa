package udemy.dsa.stack;

public class StackUsingLinkedList {

	LinkedList linkedList;

	public StackUsingLinkedList() {
		this.linkedList = new LinkedList();
	}

	// O(1)
	public void deleteStack() {
		this.linkedList.head = null;
	}

	// O(1)
	public boolean isEmpty() {
		return this.linkedList.head == null;
	}

	// O(1)
	public int peek() {
		if (isEmpty()) {
			return -1;
		}
		return this.linkedList.head.value;
	}

	// O(1)
	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		int element = this.linkedList.head.value;
		this.linkedList.delete(0);
		return element;
	}

	// O(1)
	public void push(int element) {
		this.linkedList.insert(element, 0);
	}

}