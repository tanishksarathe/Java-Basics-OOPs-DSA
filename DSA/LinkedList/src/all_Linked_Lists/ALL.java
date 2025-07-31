package all_Linked_Lists;

public class ALL {

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

	Node head;
	Node tail;

	public static void main(String[] args) {

//		Singly.singlyLinkedList();

//		System.out.println();

//		Circular.circularLinkedList();

//		System.out.println();

//		Doubly.doublyLinkedList();

		System.out.println();

		DoubleCircular.printDoubleCircular();

	}
}

class Singly extends ALL {

	public void printSingly() {

		Node curr = head;

		while (curr != null) {

			System.out.print(curr.data + "->");
			curr = curr.next;
		}
		System.out.println("null");
	}

	public void insertATBegining(int data) {

		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}

	}

	public void insertAtEnd(int data) {

		Node newNode = new Node(data);

		if (head == null) {
			head = tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}

	}

	public void insertAtpos(int pos, int data) {

		if (pos < 0) {
			System.out.println("Position Invalid");
			return;
		}
		if (pos == 0) {
			insertATBegining(data);
			return;
		}

		int count = 0;
		Node curr = head;

		while (curr.next != null && count < pos - 1) {
			curr = curr.next;
			count++;
		}

		if (curr.next == null) {
			System.out.println("Position out of bound");
			return;
		}

		Node newNode = new Node(data);

		newNode.next = curr.next;
		curr.next = newNode;

	}

	public void deleteByValue(int val) {

		if (head == null) {
			System.out.println("List is empty");
			return;
		}

		if (head.data == val) {
			head = null;
			head = head.next;
			return;
		}
		Node curr = head;

		while (curr != null) {

			if (curr.next != null && curr.next.data == val) {
				curr.next = curr.next.next;
				System.out.println(val + " erased");
				return;
			}
			curr = curr.next;
		}

		System.out.println("Value not exists");

	}

	public void UpdateValue(int old, int fresh) {

		Node curr = head;
		while (curr != null) {

			if (curr.data == old) {
				curr.data = fresh;
				System.out.println("Updated " + old + " with " + fresh);
				return;
			}
			curr = curr.next;
		}

	}

	public int length() {

		int count = 0;

		Node curr = head;

		while (curr != null) {

			count++;
			curr = curr.next;
		}

		return count;
	}

	public void revrse() {

		Node curr = head;

		Node pre = null;

		Node other = null;

		while (curr != null) {

			other = curr.next;
			curr.next = pre;
			pre = curr;

			curr = other;
		}

		other = head;
		head = tail;
		tail = other;

	}

	public void findMiddle() {

		Node fast = head;

		Node slow = head;

		while (fast != null && fast.next != null) {

			slow = slow.next;
			fast = fast.next.next;
		}
		System.out.println(slow.data);
	}

	public void sort() {

		Node i = head;
		while (i.next != null) {

			Node j = i.next;
			while (j != null) {

				if (i.data > j.data) {

					int temp = i.data;
					i.data = j.data;
					j.data = temp;

				}
				j = j.next;
			}
			i = i.next;
		}

	}

	public static void singlyLinkedList() {

		Singly list1 = new Singly();

		list1.insertATBegining(20);
		list1.insertATBegining(10);
		list1.insertAtEnd(30);
		list1.insertATBegining(5);
		list1.insertAtpos(2, 15);
		list1.deleteByValue(15);
		list1.UpdateValue(10, 40);
		list1.printSingly();
		System.out.println(list1.length());
		list1.findMiddle();
		list1.sort();
		list1.printSingly();
		System.out.println();

		list1.revrse();

		list1.printSingly();

	}

}

class Circular extends ALL {

	public void print() {

		Node curr = head;

		while (true) {

			System.out.print(curr.data + "->");

			curr = curr.next;
			if (curr == head) {
				break;
			}

		}
		System.out.print("head");
	}

	public void insertATBegin(int data) {

		Node newNode = new Node(data);

		if (head == null) {
			head = tail = newNode;
			tail.next = head;
		}

		else {

			newNode.next = head;
			head = newNode;
			tail.next = newNode;

		}

	}

	public void insertAtEnd(int data) {

		Node newNode = new Node(data);

		Node curr = head;

		if (head == null) {
			head = tail = null;
			tail.next = head;
		} else {

			tail.next = newNode;
			tail = newNode;
			tail.next = head;

		}

	}

	public void insertAtposition(int pos, int data) {

		if (pos < 0) {
			System.out.println("Position Invalid");
			return;
		}
		if (pos == 0) {
			insertATBegin(data);
			return;
		}

		Node curr = head;
		int count = 0;

		while (curr.next != head && count < pos - 1) {

			curr = curr.next;

			count++;

		}

		if (count != pos - 1) {
			System.out.println("Position Out of bound");
			return;
		}

		Node newNode = new Node(data);

		newNode.next = curr.next;
		curr.next = newNode;

		if (curr == tail) {
			tail = newNode;
		}
	}

	public void deleteByValue(int val) {

		if (head == null) {
			System.out.println("Empty");
			return;
		}
		if (head.data == val) {

			if (head.next != head) {
				head = head.next;
			} else {
				head = null;
			}

		}

		Node curr = head;

		while (curr.next != head && curr.next.data != val) {

			curr = curr.next;

		}

		if (curr.next == head) {
			System.out.println("Value not found");
			return;
		}

		if (curr.next.data == val) {

			curr.next = curr.next.next;

			if (curr.next == tail) {
				curr = tail;
			}
		}

	}

	public void updateValue(int old, int n) {

		Node curr = head;

		while (true) {

			if (curr.data == old) {
				curr.data = n;
				return;
			}

			curr = curr.next;
			if (curr == head) {
				System.out.println("Didn't find the value");
				break;
			}

		}
	}

	public boolean search(int val) {

		Node curr = head;

		while (true) {

			if (curr.data == val) {
				return true;
			}

			curr = curr.next;

			if (curr == head) {

				return false;

			}

		}

	}

	public int lengthofCircular() {

		int count = 0;

		Node cNode = head;

		while (true) {
			count++;
			cNode = cNode.next;
			if (cNode == head)
				return count;
		}

	}

	public void reverseC() {

		Node cNode = head;

		Node prev = tail;

		Node other = null;

		do {

			other = cNode.next;
			cNode.next = prev;
			prev = cNode;

			cNode = other;

		} while (cNode != head);

		other = head;
		head = tail;
		tail = other;

	}

	public int findMiddle() {

		Node slow = head;

		Node fast = head;

		while (fast.next != head && fast.next.next != head) {

			slow = slow.next;
			fast = fast.next.next;

		}

		return slow.data;
	}

	public void sort() {

		Node i = head;
		while (i.next != head) {

			Node j = i.next;
			while (j != head) {

				if (i.data > j.data) {

					int temp = i.data;
					i.data = j.data;
					j.data = temp;

				}
				j = j.next;
			}
			i = i.next;
		}

	}

	public static void circularLinkedList() {

		System.out.println("Circular Linked List");

		Circular list2 = new Circular();

		list2.insertATBegin(100);
		list2.insertAtEnd(200);

		System.out.println();

		list2.insertAtposition(2, 600);
		list2.deleteByValue(100);
		list2.insertAtEnd(800);
		list2.insertAtposition(2, 520);
		list2.insertAtposition(4, 320);
		list2.insertATBegin(700);
		list2.insertAtEnd(50);

		System.out.println();

		list2.print();

		System.out.println();

		list2.updateValue(600, 400);
		list2.print();

		System.out.println();

		System.out.println(list2.search(400));

		System.out.println();

		System.out.println(list2.lengthofCircular());

		System.out.println();

		System.out.println(list2.findMiddle());

		System.out.println();

		list2.sort();

		list2.print();

		list2.reverseC();

		System.out.println();

		list2.print();

	}

}

class Doubly {

	static class Node {

		int data;
		Node prev;
		Node next;

		public Node(int data) {
			this.data = data;
		}

	}

	Node head = null;
	Node tail = null;

	public void printDoubly() {

		Node cNode = head;

		while (true) {

			System.out.print(cNode.data + "<->");
			cNode = cNode.next;
			if (cNode == null)
				break;
		}

		System.out.print("null");

	}

	public void insertAtBegin(int data) {

		Node newNode = new Node(data);

		if (head == null) {
			head = tail = newNode;
			head.next = null;
			head.prev = null;
		}

		else {

			newNode.next = head;
			newNode.prev = null;
			head = newNode;

		}

	}

	public void insertAtend(int data) {

		Node newNode = new Node(data);

		if (head == null) {

			head = tail = newNode;
			head.prev = head.next = null;
		}

		else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
			tail.next = null;

		}

	}

	public void insertAtPosition(int pos, int data) {

		if (pos < 0) {
			System.out.println("Invalid Position");
			return;
		}
		if (pos == 0) {
			insertAtBegin(data);
			return;
		}

		int count = 0;

		Node curr = head;

		while (curr != null && count < pos - 1) {

			curr = curr.next;
			count++;
		}

		if (count != pos - 1) {

			System.out.println("Position Out of Bound");
			return;

		}

		Node newNode = new Node(data);

		newNode.next = curr.next;
		newNode.next.prev = newNode;
		newNode.prev = curr;
		curr.next = newNode;

		if (newNode.prev == tail)
			tail = newNode;

	}

	public void deletebyValue(int val) {

		if (head == null) {
			System.out.println("Empty");
			return;
		}

		if (head.data == val) {

			if (head.next != null) {
				head = head.next;
				head.prev = null;
			} else {
				head = tail = null;
			}
			return;
		}

		Node curr = head;

		while (curr.next != null) {

			if (curr.data == val) {

				curr.prev.next = curr.next;
				curr.next.prev = curr.prev;

			}
			curr = curr.next;
		}

		curr.prev.next = curr.next;
		tail = curr.prev;

	}

	public void update(int old, int n) {

		Node cNode = head;

		while (true) {

			if (cNode.data == old) {

				cNode.data = n;

			}

			cNode = cNode.next;

			if (cNode == null) {
				break;
			}

		}

	}

	public boolean searchV(int val) {

		Node cNode = head;

		while (true) {

			if (cNode.data == val)
				return true;

			cNode = cNode.next;

			if (cNode == null)
				return false;
		}

	}

	public int lengthD() {

		int count = 0;

		Node cNode = head;

		while (true) {

			count++;

			cNode = cNode.next;

			if (cNode == null)
				return count;

		}
	}

	public int findtheMiddle() {

		Node slow = head, fast = head;

		while (fast != null && fast.next != null) {

			slow = slow.next;

			fast = fast.next.next;

		}

		return slow.data;

	}

	public void sortD() {

		Node i = head;
		while (i.next != null) {

			Node j = i.next;
			while (j != null) {

				if (i.data > j.data) {

					int temp = i.data;
					i.data = j.data;
					j.data = temp;

				}
				j = j.next;
			}
			i = i.next;
		}

	}

	public void revrse() {

		Node curr = head; 

		Node pre = null;

		Node other = null;

		while (curr != null) {

			other = curr.next;
			curr.next = pre;
			pre = curr;

			curr = other;
		}

		other = head;
		head = tail;
		tail = other;

	}

	public static void doublyLinkedList() {

		System.out.println("Doubly Linked List");

		Doubly list3 = new Doubly();

		list3.insertAtBegin(20);
		list3.insertAtBegin(40);
		list3.insertAtend(50);
		list3.insertAtend(60);
		list3.printDoubly();

		System.out.println();

		list3.insertAtPosition(2, 25);
		list3.insertAtPosition(4, 45);

		list3.printDoubly();

		System.out.println();

		list3.update(25, 35);

		list3.printDoubly();

		System.out.println();

		System.out.println(list3.searchV(10));

		System.out.println();

		System.out.println(list3.lengthD());

		System.out.println();

		list3.deletebyValue(60);

		list3.printDoubly();

		System.out.println();

		System.out.println(list3.findtheMiddle());

		list3.sortD();

		list3.printDoubly();

		System.out.println();

		list3.revrse();
		
		list3.printDoubly();
	}

}

class DoubleCircular extends Doubly {

	public void printDC() {
		
		Node curr = head;
		
		while(curr.next != head) {
			
			System.out.print(curr.data + "<->");
			
			curr = curr.next;
			
		}
		System.out.println("head");
	}
	
	
	public void insertAtBegin(int data) {
		
		Node newNode = new Node(data);
		
		Node curr = head;
		
		if(head == null) {
			
			head = tail = newNode;
			head.prev = head.next = head;
			return;
		}
		
		newNode.next = head;
		head = newNode;
		head.prev = tail;
		
	}

	public static void printDoubleCircular() {

		System.out.println("Double Circular Linked List");

		DoubleCircular list = new DoubleCircular();
		
		System.out.println();

		list.insertAtBegin(50);
		list.insertAtBegin(70);
		
		list.printDC();
		
	}

}