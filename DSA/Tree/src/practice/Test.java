package practice;
import java.util.ArrayList;

public class Test {

	static class Node 
	{
		int data;
		Node left, right;
		
		public Node(int data) {
			this.data = data;
			left = right = null;
		}
	}
	
	public static Node tree1() {
		
		Node root = new Node(1);
		
		root.left = new Node(2);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.left.right.left = new Node(6);
		root.left.right.right = new Node(7);
		
		root.right = new Node(3);
		root.right.right = new Node(8);
		root.right.right.left = new Node(9);
	
		return root;
	}
	
	// DFS
	
	static ArrayList<Integer> list1 = new ArrayList<Integer>();
	
	static ArrayList<Integer> list2 = new ArrayList<Integer>();
	
	static ArrayList<Integer> list3 = new ArrayList<Integer>();
	
	
	
	public static ArrayList<Integer> inOrdertraversal(Node root) {
		
		if(root == null) {
			return list1;
		}
		
		inOrdertraversal(root.left);
		
		list1.add(root.data);
		
		inOrdertraversal(root.right);
		
		return list1;
	}
	
	public static ArrayList<Integer> preOrdertraversal(Node root){
		
		if (root == null) {
			return list2;
		}
		
		list2.add(root.data);
		
		preOrdertraversal(root.left);
		
		preOrdertraversal(root.right);
		
		return list2;
		
	}
	
	
	public static ArrayList<Integer> postOrdertraversal(Node root){
		
		if (root == null) {
			return list3;
		}
		
		postOrdertraversal(root.left);
		
		postOrdertraversal(root.right);
		
		list3.add(root.data);
		
		return list3;
		
	}
	
	
	public static void dfstravsersal() {
		
		Node root1 = Test.tree1();   // First Tree
		
		System.out.println("In Order Traversal");
		
		System.out.println();
		
		System.out.println(inOrdertraversal(root1));
		
		System.out.println();
		
		System.out.println("Pre Order Traversal");
		
		System.out.println();
		
		System.out.println(preOrdertraversal(root1));
	
		System.out.println();
		
		System.out.println("Post Order Traversal");
		
		System.out.println();
		
		System.out.println(postOrdertraversal(root1));
				
	}
	
	// BFS
	
	public static ArrayList<ArrayList<Integer>> LevelOrder(Node root) {
		
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>(); // Main ArrayList
		
		 bfs(root, 0, result);
		
		return result;	
		
	}
	
	
	public static void bfs(Node root, int level, ArrayList<ArrayList<Integer>> result) {
		
		if (root == null) {
			return;
		}
		
		if (result.size() <= level) {
			
			result.add(new ArrayList<Integer>());
		}
		
			result.get(level).add(root.data);
		
		
		bfs(root.left, level + 1, result);
		
		bfs(root.right, level + 1, result);
		
	}
	
	public static void bfstraversal() {
		
		Node root = Test.tree1();
		
		System.out.println("Level Order Traversal");
		
		System.out.println();
		
		System.out.println(LevelOrder(root));
		
	}
	
	
	// Height Of the Tree
	
	public static int height(Node root) {
		
		if(root == null) {
			return 0;
		}
		
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		
		return Math.max(leftHeight, rightHeight)+1;
	}
	
	public static void heightprint() {
		
		Node root = Test.tree1();
		
		System.out.print("Height of the Tree is : ");
		
		System.out.println(height(root));
		
	}
	
	
	// Top View
	

	static class ViewNode {
		int data, level;
		
		public ViewNode(int data, int level) {
			
			this.data = data;
			this.level = level;
			
		}
	}
	
	public static ArrayList<ViewNode> leftView = new ArrayList<ViewNode>();
	public static ArrayList<ViewNode> rightView = new ArrayList<ViewNode>();
	public static ViewNode rootView = null;
	
	public static void topview(Node root) {
		
		leftView.clear();
		rightView.clear();
		rootView = null;
		
		topViewRec(root, 0, 0);
		
		// printing
		
		// left nodes
		
		for (int i = leftView.size()-1; i >=0; i--)
		{
			System.out.print(leftView.get(i).data + " ");
		}
		
		// root node 
		
		System.out.print(rootView.data + " ");
		
		// right nodes
		
		for(int i=0; i <= rightView.size()-1; i++)
		{
			System.out.print(rightView.get(i).data + " ");
		}
		
		
	}
	
	
	public static void topViewRec(Node root, int hd, int level) {
		
		if (root == null) 
		{
			return;
		}
		
		if (hd == 0)
		{
			// root level
			if (rootView == null || level < rootView.level) 
			{
				
				rootView = new ViewNode(root.data, level);
				
			}
		}
		
		else if (hd < 0) 
		{
		    int index = -hd - 1;
		    
		    if (index >= leftView.size()) 
		    {
		        leftView.add(new ViewNode(root.data, level)); 
		    } 
		    else 
		    {
		        // compare level
		        if (level < leftView.get(index).level)
		        {
		            leftView.set(index, new ViewNode(root.data, level));
		        }
		    }
		} 
		else { 
			// hd > 0
		    int index = hd - 1;
		    
		    if (index >= rightView.size()) 
		    {
		        rightView.add(new ViewNode(root.data, level));
		    }
		    else
		    {
		        if (level < rightView.get(index).level) 
		        {
		            rightView.set(index, new ViewNode(root.data, level));
		        }
		    }
		}

		
		topViewRec(root.left, hd-1, level+1);
		topViewRec(root.right, hd+1, level+1);
			
	}
	
	public static void topViewprint() {
		
		Node root2 = Test.tree1();
		
		System.out.println("Top View Print");
		
		System.out.println();
		
		topview(root2);
		
	}
	
	
	
	// main method
	
	public static void main(String[] args)
	{
		
		Test.dfstravsersal();
		
		System.out.println();
		
		Test.bfstraversal();
		
		System.out.println();
		
		Test.heightprint();
		
		System.out.println();
		
		topViewprint();
	}

}
