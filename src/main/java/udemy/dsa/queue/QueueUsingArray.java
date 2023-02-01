package udemy.dsa.queue;

public class QueueUsingArray {

	int arr[];

	int beginningOfQueue;

	int topOfQueue;

	public QueueUsingArray(int size) {
		this.arr = new int[size]; // space complexity O(n) for creating queue, all other operations O(1)
									// complexity
		this.beginningOfQueue = this.topOfQueue = -1;
	}

	// O(1)
	public void deleteQueue() {
		this.arr = null;
	}

	// O(1)
	public int deQueue() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return this.beginningOfQueue;
		}
		int element = this.arr[this.beginningOfQueue];
		this.beginningOfQueue++;
		if (this.beginningOfQueue > this.topOfQueue) {
			this.beginningOfQueue = this.topOfQueue = -1;
		}
		return element;
	}

	// O(1)
	public void enQueue(int element) {
		if (isFull()) {
			System.out.println("Queue is full to insert " + element);
			return;
		}
		if (isEmpty()) {
			this.beginningOfQueue = 0;
		}
		this.arr[this.topOfQueue + 1] = element;
		this.topOfQueue++;
	}

	// O(1)
	public boolean isEmpty() {
		return this.beginningOfQueue == -1;
	}

	// O(1)
	public boolean isFull() {
		return this.topOfQueue == this.arr.length - 1;
	}

	// O(1)
	public int peek() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return this.beginningOfQueue;
		}
		return this.arr[this.beginningOfQueue];
	}

}