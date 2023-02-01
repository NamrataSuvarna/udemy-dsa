package udemy.dsa.stack;

public class StackUsingArray {

	int arr[];

	int topOfStack;

	public StackUsingArray(int size) {
		this.arr = new int[size]; // space complexity O(n) for creating stack, all other operations O(1)
									// complexity
		this.topOfStack = -1;
	}

	// O(1)
	public void deleteStack() {
		this.arr = null;
	}

	// O(1)
	public boolean isEmpty() {
		return this.topOfStack == -1;
	}

	// O(1)
	public boolean isFull() {
		return this.topOfStack == this.arr.length - 1;
	}

	// O(1)
	public int peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return this.topOfStack;
		}
		return this.arr[this.topOfStack];
	}

	// O(1)
	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return this.topOfStack;
		}
		int element = this.arr[this.topOfStack];
		this.topOfStack--;
		return element;
	}

	// O(1)
	public void push(int element) {
		if (isFull()) {
			System.out.println("Stack is full to insert " + element);
			return;
		}
		this.arr[this.topOfStack + 1] = element;
		this.topOfStack++;
	}

}