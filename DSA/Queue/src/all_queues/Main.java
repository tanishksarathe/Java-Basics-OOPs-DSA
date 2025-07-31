package all_queues;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayQueue.printQueueusingArray();
		
//		System.out.println();
		
//		QueueAL.printQueueusingAL();
		
//		System.out.println();
		
//		CircularQueue.printCircularQueue();
		
//		System.out.println();
		
//		QueueLL.printQueueusingLL();

	}

}

class ArrayQueue{
	
	int front = 0;
	int rear = -1;
	int size = 0;
	int capacity;
	int[]arr;
	
	public ArrayQueue(int c) {
		
		capacity = c;
		arr = new int[capacity];
		
	}

	
	//isempty
	
	public boolean isEmpty() {
		return size==0;
	}
	
	
	//isFull	
	
	public boolean isFull() {
		return size==capacity;
	}
	
	//enqueue
	
	public void enqueue(int data) {
		
		if(isFull()) System.out.println("Queue is Full");
		
		rear++;
		arr[rear] = data;
		size++;
		
		System.out.println(data + " Enqueued");
	}
	
	//dequeue
	
	public int dequeue() {
		
		if(isEmpty()) return -1;
		
		int x = arr[front];
		front++;
		size--;
		return x;
	}
	
	// front
	
	public int front() {
		
		System.out.println("Element in front is : ");
		
		return arr[front];
	}
	
	//rear
	
	public int rear() {
		
		System.out.println("Element in rear is : ");
		
		return arr[rear];
	}
	
	
	//size

	public int size() {
		return size;
	}
	
	//print
	
	
	public void printQueue() {
		
		System.out.print("Front -> | ");
		
		int i = front;
		while (i <= rear) {
			System.out.print(arr[i] + " | ");
			i++;
		}
		
		System.out.println("<- Rear");
	}
	
	
	public static void printQueueusingArray() {
		
		System.out.println("Queue using Array");
		
		ArrayQueue q = new ArrayQueue(5);
		
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		
		System.out.println();
		
		q.printQueue();
		
		System.out.println(q.dequeue());
		
		System.out.println(q.dequeue());
		
		q.printQueue();
		
//		q.enqueue(60);
		
		q.printQueue();
		
		System.out.println();
		
		System.out.println(q.size());
		
		System.out.println();
		
		System.out.println(q.front());
		
		System.out.println();
		
		System.out.println(q.rear());
	}
	
}

class QueueAL{
	
	ArrayList<Integer> list = new ArrayList<Integer>();
	
	int front = 0;
	int rear = -1;
	int size = 0;
	
	public boolean isEmpty() {
		return size==0;
	}
	
	
	// enqueue
	
	public void enqueue(int data) {
		
		System.out.println("Enqueued : " + data);

		list.add(data);
		size++;
	}
	
	
	//dequeue
	
	public int dequeue() {
		
		if(isEmpty()) return -1;
		
		int x = list.get(front);
	
		size--;
		
		list.remove(front);
		
		System.out.print("Dequeued : ");
		
		return x;
		
	}

	//size
	
	public int size() {
		return size;
	}
	
	// print
	
	public void printQ() {
		
		int i = front;
		while(i < size) {
			
			System.out.print(list.get(i) + " ");
			i++;
		}
		
	}
	
	//front
	
	public int front() {
		
		System.out.print("Element at Front is : ");
		
		return list.get(front);
	}
		
	
	// rear 
	
	public int rear() {
		
		System.out.print("Element at rear : ");
		return list.get(size-1);
	}
	
	public static void printQueueusingAL() {
		
		System.out.println("Queue using ArrayList");
		
		QueueAL list = new QueueAL();
		
		list.enqueue(10);
		list.enqueue(20);
		list.enqueue(30);
		list.enqueue(40);
		
		System.out.println();
		
		System.out.println(list.dequeue());
		
		System.out.println();
		
		list.printQ();
		
		System.out.println();
		
		System.out.println(list.dequeue());
		
		System.out.println();
		
		list.printQ();
		
		System.out.println();
		
		list.enqueue(100);
		
		System.out.println();
		
		list.printQ();
		
		System.out.println();
//		
		System.out.println(list.front());
//		
		System.out.println();
		
		System.out.println(list.rear());
		
		System.out.println();
		
		System.out.println(list.size());
	
		
	
	
	}
	
}

class QueueLL{
	
	int size=0;
	
	static class Node {

		int data;
		Node next;
		

		public Node(int data) {

			this.data = data;
			next = null;
		}

	}
	
	Node head = null;
	Node tail = null;
	
	// enqueue
	
	public void enqueue(int data) {
		
		Node newNode = new Node(data);
		
		if(head == null) {
			head = tail = newNode;
			size++;
			return;
		}
		
		tail.next = newNode;
		tail = newNode;
		size++;
		
		System.out.println("Enqueued : "+ data);
	}
	
	
	//dequeue
	
	public int dequeue() {
		
		if(head == null) return -1;
		
		int x = head.data;
		
		head = head.next;
		if(head.next == null) tail = head = null;
		
		System.out.print("Dequeued : ");
		
		size--;
		
		return x;
	}
	
	// front
	
	public int front() {
		return head.data;
	}
	
	//rear
	
	public int rear() {
		return tail.data;
	}
	
	// print
	
	public void printQ() {
		
		Node i = head;
		while(i != null) {
			System.out.print(i.data + " ");
			i = i.next;
		}
		
	}
	
	//size
	
	public int size() {
		return size;
	}
	
	public static void printQueueusingLL() {
		
		System.out.println("Queue using LinkedList");
		
		QueueLL listL = new QueueLL(); 
		
		listL.enqueue(10);
		listL.enqueue(20);
		listL.enqueue(30);
		
		listL.printQ();
		
		System.out.println();
		
		System.out.println(listL.front());
		
		System.out.println();
		
		System.out.println(listL.rear());
		
		System.out.println();
		
		System.out.println(listL.dequeue());
		
		System.out.println();
		
		listL.printQ();
		
		System.out.println();
		
		listL.enqueue(50);
		
		System.out.println();
		
		listL.printQ();
		
		System.out.println();
		
		System.out.println(listL.size());
		
		
		
	}
	
}

class CircularQueue{
	
	int front = 0;
	int rear = -1;
	int size = 0;
	int capacity = 0;
	int[]arr;
	
	public CircularQueue(int data) {
		capacity = data;
		arr = new int[data];
		
	}
	
	// isEmpty
	
	public boolean isEmpty() {
		return size == 0; 
	}
	
	//isFull
	
	public boolean isFull() {
		return size == capacity;
	}
	
	// enqueue
	
	public void enqueue(int data) {
	
		if(isFull()) System.out.println("Cannot be Enqueued");
		
		rear = (rear+1)%capacity;
		
		arr[rear] = data;
		
		size++;
		
		System.out.println("Enqueued : "+ data);
	}
	
	//dequeue
	
	public int dequeue() {
		
		if(isEmpty()) return -1;
		
		int x = arr[front];
		
		front++;
		
		System.out.print("Dequeued : ");
		
		size--;
		
		return x;
	}
	
	//print
	
	public void printQ() {
		
		int index = front;
		int i = 0;
		while (i < size) {
			
			System.out.print(arr[index]+" ");
			index = (index+1)%capacity;
			i++;
		
		}
	}
	
	//size
	
	public int size() {
		return size;
	}
	
	
	//front
	
	public int front() {
		
		return arr[front];
		
	}
	
	
	//rear
	
	public int rear() {
		
		return arr[rear];
		
	}
	
	public static void printCircularQueue() {
		
		CircularQueue q = new CircularQueue(5);
		
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		
		System.out.println();
		
		q.printQ();
		
		System.out.println();
		
		System.out.println(q.dequeue());
		
		System.out.println(q.dequeue());
		
		System.out.println();
		
		q.enqueue(60);
		
		System.out.println();
		
		q.printQ();
		
		System.out.println();
		
		System.out.println(q.dequeue());
		
		System.out.println();

		q.printQ();
		
		System.out.println();
		
		System.out.println(q.size);
		
		System.out.println();
		
		System.out.println(q.front());
		
		System.out.println();
		
		System.out.println(q.rear());
		
	}
	
}