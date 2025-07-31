package singly_linked_list;

//import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {

		SLL.singularLinkedList();

		System.out.println();

		CLL.printCircularList();
		/*
		 * LinkedList linked = new LinkedList<Integer>(); linked.add(10);
		 * linked.add(20); linked.addFirst(5);
		 * 
		 * for(Object val : linked) {
		 * System.out.println(linked.get(linked.indexOf(val)));; }
		 * System.out.println(linked.size());
		 */
	}

}

class SLL {

	static class Node {
		int data;
		Node nextNode;

		public Node(int data) {
			this.data = data;
		}

	}

	Node headnode;
	Node tailnode;

	public void insertAtBegin(int data) {

		Node newNode = new Node(data);

		if (headnode == null) {
			headnode = newNode;
			tailnode = newNode;
		} else {
			newNode.nextNode = headnode;
			headnode = newNode;
		}

	}

	public void insertAtEnd(int data) {

		Node newNode = new Node(data);

		if (headnode == null) {
			headnode = newNode;
			tailnode = newNode;
		} else {
			tailnode.nextNode = newNode;
			tailnode = newNode;
		}

	}

	public void insertByIndex(int pos, int data) {

		Node newNode = new Node(data);

		int count = 0;

		if (pos < 0) {
			System.out.println("Invalid Location");
			return;
		}
		if (pos == 0) {
			insertAtBegin(data);
			return;
		}
		Node current = headnode;
		while (current != null && pos > count) {
			count++;
			current = current.nextNode;
		}
		if (current == null) {
			System.out.println("Location Out of Reach");
			return;
		}
		if (pos == count) {
			current.nextNode = newNode;
			newNode.nextNode = current.nextNode.nextNode;
		}

	}

	public void update(int oldval, int newVal) {

		Node current = headnode;
		while (current != null) {

			if (current.data == oldval) {
				current.data = newVal;
			}
			current = current.nextNode;
		}

	}

	public int length() {
		Node current = headnode;
		int count = 0;
		while (current != null) {
			count++;
			current = current.nextNode;
		}
		return count;
	}

	public void reverse() {

		Node prev = null;
		Node current = headnode;
		while (current != null) {

			current.nextNode = prev;
			prev = current;
			current = current.nextNode;

		}

	}

	public void printList() {

		Node current = headnode;
		while (current != null) {
			System.out.print(current.data + "->");
			current = current.nextNode;
		}
		System.out.print("null");
	}

	public static void singularLinkedList() {

		SLL list1 = new SLL();

		list1.insertAtBegin(10);
		list1.insertAtBegin(20);
		list1.insertAtEnd(30);

		list1.printList();

		System.out.println();

		System.out.println(list1.length());

		list1.reverse();

		list1.printList();

	}
}

class CLL extends SLL {

	public void insertATCbegin(int data) {

		Node newNode = new Node(data);

		if (headnode == null) {
			headnode = newNode;
			newNode.nextNode = headnode;
		} else {
			headnode.nextNode = newNode;
			newNode.nextNode = headnode;
		}

	}

	public void printCircular() {

		System.out.println("Circular Linked List Begin");

		System.out.println();

		Node curr = headnode;

		do {

			System.out.print(curr.data + "->");

			curr = curr.nextNode;

		} while (curr.nextNode != headnode);

		System.out.println("head");

	}

	public static void printCircularList() {
		
		CLL list2 = new CLL();
		
		list2.insertATCbegin(10);
		list2.insertATCbegin(5);
		
		System.out.println(list2.length());
		
		list2.printCircular();
		
	}

}

class Doubly{
	
	static class Node {
		int data;
		Node nextNode;
		Node prevNode;

		public Node(int data) {
			this.data = data;
			this.nextNode = null;
			this.prevNode = null;
			
		}

	}

	Node headnode;
	Node tailnode;
	
	public void deleteByValue(int val) {
		
		if(headnode == null) {
			System.out.println("List is empty");
			return;
		}
		
		if(headnode.data == val) {
			headnode = null;
			headnode = headnode.nextNode;
			return;
		}
		Node curr = headnode;
		
		while(curr != null) {
			
			if(curr.nextNode != null && curr.nextNode.data == val) {
				curr.nextNode = curr.nextNode.nextNode;
				curr.nextNode.prevNode = curr; 
				System.out.println(val + " erased");
				return;
			}
			curr = curr.nextNode;
		}
		
		System.out.println("Value not exists");
		
	}

	
	public void doublyReverse() {
		
	}
	
	public static void printDoubleLinkedList() {
		
	}
}
