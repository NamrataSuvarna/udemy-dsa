package udemy.dsa.queue;

public class CircularQueueUsingArray {

	int arr[];

	int beginningOfCircularQueue;

	int topOfCircularQueue;

	public CircularQueueUsingArray(int size) {
		this.arr = new int[size]; // space complexity O(n) for creating circular queue, all other operations O(1)
									// complexity
		this.beginningOfCircularQueue = this.topOfCircularQueue = -1;
	}

	// O(1)
	public int deCircularQueue() {
		if (isEmpty()) {
			System.out.println("Circular queue is empty");
			return this.beginningOfCircularQueue;
		}
		int element = this.arr[this.beginningOfCircularQueue];
		this.beginningOfCircularQueue++;
		if (this.beginningOfCircularQueue > this.topOfCircularQueue) {
			this.beginningOfCircularQueue = this.topOfCircularQueue = -1;
		}
		return element;
	}

	// O(1)
	public void deleteCircularQueue() {
		this.arr = null;
	}

	// O(1)
	public void enCircularQueue(int element) {
		if (isFull()) {
			System.out.println("Circular queue is full to insert " + element);
			return;
		}
		if (isEmpty()) {
			this.beginningOfCircularQueue = 0;
		}
		if (this.topOfCircularQueue == this.arr.length - 1) {
			this.topOfCircularQueue = -1;
		}
		this.arr[this.topOfCircularQueue + 1] = element;
		this.topOfCircularQueue++;
	}

	// O(1)
	public boolean isEmpty() {
		return this.beginningOfCircularQueue == -1;
	}

	// O(1)
	public boolean isFull() {
		return (this.beginningOfCircularQueue == this.topOfCircularQueue + 1)
				|| (this.beginningOfCircularQueue == 0 && this.topOfCircularQueue == this.arr.length - 1);
	}

	// O(1)
	public int peek() {
		if (isEmpty()) {
			System.out.println("Circular queue is empty");
			return this.beginningOfCircularQueue;
		}
		return this.arr[this.beginningOfCircularQueue];
	}

}