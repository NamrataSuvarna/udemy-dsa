package udemy.dsa.linked.list;

public class LinkedListTest {

	public static void main(String[] args) {
		System.out.println("---------------------");
		System.out.println("Single Linked List ->");
		testLinkedList(new SingleLinkedList());
		System.out.println("---------------------");

		System.out.println("---------------------");
		System.out.println("Double Linked List ->");
		testLinkedList(new DoubleLinkedList());
		System.out.println("---------------------");

		System.out.println("------------------------------");
		System.out.println("Circular Single Linked List ->");
		testLinkedList(new CircularSingleLinkedList());
		System.out.println("------------------------------");

		System.out.println("------------------------------");
		System.out.println("Circular Double Linked List ->");
		testLinkedList(new CircularDoubleLinkedList());
		System.out.println("------------------------------");
	}

	private static void testLinkedList(LinkedList linkedList) {
		linkedList.create(1);
		linkedList.insert(12, 0);
		linkedList.insert(6, 1);
		linkedList.insert(3, 2);
		linkedList.insert(8, 3);
		linkedList.insert(9, 4);
		linkedList.insert(10, 5);
		linkedList.insert(11, 6);
		linkedList.insert(5, 7);
		linkedList.insert(7, 8);
		linkedList.traverse();
		linkedList.reverseTraverse();
		linkedList.search(3);
		linkedList.search(4);
		linkedList.search(9);
		linkedList.search(0);
		linkedList.search(10);
		linkedList.search(16);
		linkedList.delete(0);
		linkedList.traverse();
		linkedList.delete(8);
		linkedList.traverse();
		linkedList.delete(1);
		linkedList.traverse();
		linkedList.delete(7);
		linkedList.traverse();
		linkedList.delete(3);
		linkedList.traverse();
		linkedList.delete(5);
		linkedList.traverse();
		linkedList.destroy();
		linkedList.traverse();
	}

}