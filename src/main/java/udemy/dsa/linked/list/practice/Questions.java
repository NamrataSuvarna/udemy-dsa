package udemy.dsa.linked.list.practice;

import java.util.HashSet;

public class Questions {

	void deleteDups(LinkedList linkedList) {
		HashSet<Integer> hashSet = new HashSet<>();
		Node currentNode = linkedList.head;
		Node newNode = null;
		while (currentNode != null) {
			if (!hashSet.contains(currentNode.value)) {
				hashSet.add(currentNode.value);
				newNode = currentNode;
			} else {
				newNode.next = currentNode.next;
				linkedList.size--;
			}
			currentNode = currentNode.next;
		}
	}

	Node findIntersection(LinkedList ll1, LinkedList ll2) {
		if (ll1.tail.value != ll2.tail.value) {
			return null;
		}
		int sizeDifference = ll1.size - ll2.size;
		Node longerLlNode = sizeDifference < 0 ? ll2.head : ll1.head;
		Node shorterLlNode = sizeDifference < 0 ? ll1.head : ll2.head;
		for (int i = 0; i < sizeDifference; i++) {
			longerLlNode = longerLlNode.next;
		}
		while (longerLlNode.value != shorterLlNode.value) {
			longerLlNode = longerLlNode.next;
			shorterLlNode = shorterLlNode.next;
		}
		return longerLlNode;
	}

	Node nthToLast(LinkedList linkedList, int n) {
		Node node = linkedList.head;
		for (int i = 0; i < linkedList.size - n; i++) {
			node = node.next;
		}
		return node;
	}

	LinkedList partition(LinkedList ll, int value) {
		Node node = ll.head;
		ll.tail = ll.head;
		while (node != null) {
			Node next = node.next;
			if (node.value < value) {
				node.next = ll.head;
				ll.head = node;
			}
			if (node.value >= value) {
				ll.tail.next = node;
				ll.tail = node;
			}
			node = next;
		}
		return ll;
	}

	LinkedList sumLists(LinkedList ll1, LinkedList ll2) {
		Node n1 = ll1.head;
		Node n2 = ll2.head;
		LinkedList linkedList = new LinkedList();
		int carry = 0;
		do {
			int result = carry;
			if (n1 != null) {
				result = result + n1.value;
				n1 = n1.next;
			}
			if (n2 != null) {
				result = result + n2.value;
				n2 = n2.next;
			}
			linkedList.insertNode(result % 10);
			carry = result / 10;
		} while (n1 != null || n2 != null || carry != 0);
		return linkedList;
	}

}