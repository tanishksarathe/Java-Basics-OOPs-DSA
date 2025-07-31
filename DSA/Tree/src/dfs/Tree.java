package dfs;

public class Tree {	

	public static void main(String[] args)
	{
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.right.right = new Node(6);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		
		System.out.println("Post Order Traversal");
		
		root.postOrderTraversal(root);
		
		System.out.println();
		
		
		System.out.println("In Order Traversal");
		
		root.inOrderTraversal(root);
		
		System.out.println();
		
		
		System.out.println("Pre Order Traversal");
		
		root.preOrderTraversal(root);

	}

}


class Node {
	
	int data;
	Node left, right;

	public Node (int item) {
		data = item;
		left = right = null;
	}
	
	
	public void inOrderTraversal(Node node) {
		
		if(node == null) {
			return;
		}
		
		inOrderTraversal(node.left);
		
		System.out.print(" " + node.data);
		
		inOrderTraversal(node.right);
		
	}
	
	
	public void preOrderTraversal(Node node) {
		
		if(node == null) {
			return;
		}
		
		System.out.print(" " + node.data);
		
		preOrderTraversal(node.left);
		
		preOrderTraversal(node.right);
		
	}
	

	public void postOrderTraversal(Node node) {
		
		if(node == null) {
			return;
		}
		
		
		preOrderTraversal(node.left);
		
		preOrderTraversal(node.right);
		
		System.out.print(" " + node.data);
		
		
	}
	
	
}