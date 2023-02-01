package udemy.dsa.stack;

public class StackTest {

	public static void main(String[] args) {
		testingStackUsingArray();
		testingStackUsingLinkedList();
	}

	private static void testingStackUsingArray() {
		StackUsingArray stackUsingArray = new StackUsingArray(4);
		System.out.println(stackUsingArray.isEmpty());
		System.out.println(stackUsingArray.isFull());
		stackUsingArray.push(1);
		stackUsingArray.push(2);
		stackUsingArray.push(3);
		stackUsingArray.push(4);
		stackUsingArray.push(5);
		System.out.println(stackUsingArray.pop());
		System.out.println(stackUsingArray.pop());
		System.out.println(stackUsingArray.pop());
		System.out.println(stackUsingArray.peek());
		System.out.println(stackUsingArray.peek());
		stackUsingArray.deleteStack();
		System.out.println(stackUsingArray.arr);
	}

	private static void testingStackUsingLinkedList() {
		StackUsingLinkedList stackUsingLinkedList = new StackUsingLinkedList();
		System.out.println(stackUsingLinkedList.isEmpty());
		stackUsingLinkedList.push(1);
		stackUsingLinkedList.push(2);
		stackUsingLinkedList.push(3);
		stackUsingLinkedList.push(4);
		stackUsingLinkedList.push(5);
		System.out.println(stackUsingLinkedList.pop());
		System.out.println(stackUsingLinkedList.pop());
		System.out.println(stackUsingLinkedList.pop());
		System.out.println(stackUsingLinkedList.peek());
		System.out.println(stackUsingLinkedList.peek());
		stackUsingLinkedList.deleteStack();
		System.out.println(stackUsingLinkedList.linkedList.head);
	}

}