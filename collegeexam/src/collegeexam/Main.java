package collegeexam;

import java.security.PublicKey;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Main {
	
	static class Node {
		int data;
		Node left, right;
		
		public Node(int data) {
			
			this.data = data;
			left = right = null;
			
		}
		
	}
	
	public static Node tree() {
		
		Node root = new Node(1);
		
		root.left = new Node(2);
		
		root.left.left = new Node(3);
		
		root.left.right = new Node(4);
		
		root.right = new Node(5);
		
		root.right.right = new Node(6);
		
		root.right.left = new Node(7);
		
		return root;
		
	}
	
	static class ViewNode{
		int data, level;
		
		public ViewNode(int data, int level) {
			this.data = data;
			this.level = level;
		}
	}
	
	public static ArrayList<ViewNode> leftView = new ArrayList<ViewNode>();
	
	public static ArrayList<ViewNode> rightView = new ArrayList<ViewNode>();
	
	public static ArrayList<ViewNode> rootView = null;
	
	
	
	public static void printBoundary(Node root) {
	
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<ArrayList<>>();
		
		if (root == null) {
			return;
		}
		
		printtop(root, 0, 0);
		printLeaves(root);
		
		result.add(rootView);
		result.add(leftView);
		result.add()
		
	}
	
	
	
	public static void printLeaves(Node root){
		
		if (root == null) {
			return;
		}
		
		if (root.left == null && root.right == null) {
			
			System.out.print(root.data + " ");
		
			
		}
		printLeaves(root.left);
		printLeaves(root.right);
		
	}
	
	
	public static void printtop(Node root, int level, int hd)
	{
		if(root == null) {
			return;
		}
		
		if (hd < 0) {
		
		int index = -hd-1;
		
		if (index >= leftView.size()) {
			System.out.println(root.data);
		}
		else {
			if (level < leftView.get(index).level) {
				leftView.set(index, new ViewNode(root.data, level));
			}
		}
		
		}
		
		else if (hd == 0 && rootView == null) 
		{	
			rootView.add(new ViewNode(root.data, level));
		}
		
		else {
			int index = hd -1;
			
			if (index >= rightView.size()) {
				System.out.println(root.data);
			}
			else {
				if (level < rightView.get(index).level) {
					rightView.set(index, new ViewNode(root.data, level));
				}
			}
			
			
		}
		
		printtop(root.left, level+1, hd-1);
		printtop(root.right, level+1, hd+1);
		
	}
	
	
	

	public static void main(String[] args) 
	{
		Node treee = tree();
		
		printBoundary(treee);
		
	}

}
