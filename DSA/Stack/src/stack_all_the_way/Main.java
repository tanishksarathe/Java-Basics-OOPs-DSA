package stack_all_the_way;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {

		/*
		 * Stack<Integer> stack = new Stack<Integer>();
		 * 
		 * stack.push(10); stack.push(20); stack.push(50);
		 * 
		 * System.out.println("Size of stack is : " + stack.size());
		 * System.out.println(); System.out.println("Top element is "+ stack.peek());
		 * 
		 * System.out.println();
		 * 
		 * System.out.println("Position of 10 is :"+ stack.search(10));
		 * 
		 * System.out.println();
		 * 
		 * System.out.println("Is stack empty? "+stack.empty());
		 * 
		 * System.out.println();
		 * 
		 * while(!stack.isEmpty()) { System.out.println("Popped out :"+stack.pop()); }
		 * 
		 * System.out.println();
		 * 
		 * System.out.println("Is stack empty? "+stack.empty());
		 * 
		 */
//		ArrayStack.printStackUsingArray();

//		ALStack.printStackUsingAL();

		LLStack.printStackUsingLlinkedList();
	}

}

class ArrayStack {

	private int size;
	private int[] arr;
	private int pos;

	public ArrayStack(int size) {
		this.size = size;
		arr = new int[size];
		pos = -1;
	}

	public boolean isFull() {

		if (pos == size - 1)
			return true;
		return false;

	}

	public boolean isEmpty() {

		if (pos == -1)
			return true;
		return false;

	}

	public void push(int data) {

		if (isFull()) {
			System.out.println("Stack Overflow!!!");
			return;
		}
		arr[++pos] = data;
		System.out.println("Pushed : " + data);
	}

	public int pop() {

		if (isEmpty())
			return -1;

		int x = arr[pos];
		System.out.print("Popped : ");
		pos--;
		return x;

	}

//	top
	public int peek() {

		if (isEmpty())
			return -1;

		return arr[pos];

	}

	// size

	public int size() {

		if (isEmpty())
			return 0;

		return pos + 1;

	}

//search

	public static void printStackUsingArray() {

		ArrayStack stack1 = new ArrayStack(5);

		System.out.println("Stack using Array");

		System.out.println();

		stack1.push(100);
		stack1.push(200);
		stack1.push(400);
		stack1.push(500);
		stack1.push(700);
		stack1.push(800);

		System.out.println();

		System.out.println(stack1.pop());

		System.out.println();

		System.out.println(stack1.peek());

		System.out.println();

		System.out.println(stack1.size());

		System.out.println();

	}

}

class ALStack {

	ArrayList<Integer> list = new ArrayList<Integer>();

	// empty

	public boolean isEmpty() {
		System.out.print("Is Stack Empty? ");
		return (list.size() == 0);
	}

	// pop

	public int pop() {

		if (isEmpty()) return -1;

		System.out.print("Popped : ");

		int x = list.get(list.size() - 1);
		list.removeLast();

		return x;

	}

	// push

	public void push(int data) {

		list.add(data);
		System.out.println("Inserted : " + data);
	}

	// search

	// peek

	public int peek() {

		System.out.print("Element at peek is : ");
		return list.get(list.size() - 1);

	}

	public static void printStackUsingAL() {

		ALStack staclAl = new ALStack();

		System.out.println("Stack using ArrayList");

		System.out.println();

		staclAl.push(10);
		staclAl.push(20);
		staclAl.push(30);
		staclAl.push(40);
		staclAl.push(50);
		staclAl.push(70);

		System.out.println();

		System.out.println(staclAl.peek());

		System.out.println();

		System.out.println(staclAl.isEmpty());

		System.out.println();

		System.out.println(staclAl.pop());

		System.out.println();

		System.out.println(staclAl.pop());

		System.out.println();

		System.out.println(staclAl.peek());
	}

}

class LLStack {

	static class Node {

		int data;
		Node next;

		public Node(int data) {

			this.data = data;
			next = null;

		}

	}
	
	Node head = null;

	// isEmpty

	public boolean isEmpty() {

		return (head == null);
	}

	// push

	public void push(int data) {

		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
		System.out.println("Pushed : " + data);
	}

	// pop
	
	public int pop() {
		
		if(head==null) return -1;
		
		int x = head.data;
		head = head.next;
		
		System.out.print("Popped : ");
		
		return x;
		
	}

	// peek
	
	public int peek() {
		
		if(isEmpty()) return -1;
		
		System.out.print("Element at peek is : ");
		
		return head.data;
	}

	// search
	
	// size
	
	

	public static void printStackUsingLlinkedList() {

		LLStack lls = new LLStack();

		System.out.println("Stack using Linked List");
		
		System.out.println();
		
		lls.push(2);
		lls.push(4);
		lls.push(6);
		lls.push(8);
		lls.push(10);
		
		System.out.println();
		
		System.out.println(lls.peek());
		
		System.out.println();
		
		System.out.println(lls.pop());
		
		System.out.println();
		
		System.out.println(lls.pop());
		
		System.out.println();
		
		System.out.println(lls.peek());
	}

}
