package udemy.dsa.queue;

public class QueueUsingLinkedList {

	LinkedList linkedList;

	public QueueUsingLinkedList() {
		this.linkedList = new LinkedList();
	}

	// O(1)
	public void deleteQueue() {
		this.linkedList.head = null;
	}

	// O(1)
	public int deQueue() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		int element = this.linkedList.head.value;
		this.linkedList.delete(0);
		return element;
	}

	// O(1)
	public void enQueue(int element) {
		this.linkedList.insert(element, this.linkedList.size);
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

}