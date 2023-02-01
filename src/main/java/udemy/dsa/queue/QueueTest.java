package udemy.dsa.queue;

public class QueueTest {

	public static void main(String[] args) {
		testingQueueUsingArray();
		testingCircularQueueUsingArray();
		testingQueueUsingLinkedList();
	}

	private static void testingCircularQueueUsingArray() {
		CircularQueueUsingArray circularQueueUsingArray = new CircularQueueUsingArray(3);
		circularQueueUsingArray.enCircularQueue(10);
		circularQueueUsingArray.enCircularQueue(20);
		circularQueueUsingArray.enCircularQueue(30);
		circularQueueUsingArray.enCircularQueue(40);
		System.out.println(circularQueueUsingArray.deCircularQueue());
		System.out.println(circularQueueUsingArray.deCircularQueue());
		System.out.println(circularQueueUsingArray.peek());
		circularQueueUsingArray.deleteCircularQueue();
		System.out.println(circularQueueUsingArray.arr);
	}

	private static void testingQueueUsingArray() {
		QueueUsingArray queueUsingArray = new QueueUsingArray(4);
		System.out.println(queueUsingArray.isEmpty());
		System.out.println(queueUsingArray.isFull());
		queueUsingArray.enQueue(1);
		queueUsingArray.enQueue(2);
		queueUsingArray.enQueue(3);
		queueUsingArray.enQueue(4);
		queueUsingArray.enQueue(5);
		System.out.println(queueUsingArray.deQueue());
		System.out.println(queueUsingArray.deQueue());
		System.out.println(queueUsingArray.deQueue());
		System.out.println(queueUsingArray.peek());
		System.out.println(queueUsingArray.peek());
		queueUsingArray.deleteQueue();
		System.out.println(queueUsingArray.arr);
	}

	private static void testingQueueUsingLinkedList() {
		QueueUsingLinkedList queueUsingLinkedList = new QueueUsingLinkedList();
		System.out.println(queueUsingLinkedList.isEmpty());
		queueUsingLinkedList.enQueue(10);
		queueUsingLinkedList.enQueue(20);
		queueUsingLinkedList.enQueue(30);
		System.out.println(queueUsingLinkedList.isEmpty());
		System.out.println(queueUsingLinkedList.deQueue());
		System.out.println(queueUsingLinkedList.deQueue());
		System.out.println(queueUsingLinkedList.peek());
		System.out.println(queueUsingLinkedList.peek());
		queueUsingLinkedList.deleteQueue();
		System.out.println(queueUsingLinkedList.linkedList.head);
	}

}