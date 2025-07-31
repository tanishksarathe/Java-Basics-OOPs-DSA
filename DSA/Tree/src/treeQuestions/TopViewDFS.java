package treeQuestions;

import java.util.ArrayList;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class TopViewDFS {
	
	public static class Node {
		
		int data;
		public Node left, right;
		
		public Node(int data) {
			
			this.data = data;
			left = right = null;
		}
		
	
	}
	
	static class ViewNode {
		
		int data, level;
		
		public ViewNode(int d, int l) {
			
			data = d;
			level = l;
					
		}
	}
	
	static ArrayList<ViewNode> leftView = new ArrayList<>();
	static ArrayList<ViewNode> rightView = new ArrayList<>();
	static ViewNode rootView = null;
	
	
	
	public static void dfs(Node root, int hd, int level)
	{
		if (root == null) return;
		
		if (hd == 0) {
			
			if (rootView == null || level < rootView.level) {
				
				rootView = new ViewNode( root.data, level);
				
			}
			
		}
		
		else if (hd < 0) {
			
			int index = -hd-1;
			
			if (index >= leftView.size())
			{
				
				leftView.add(new ViewNode(root.data, level));
				
			}
			
		}
		
		else {
			  // hd > 0
			int index = hd -1;
			
			if (index >= rightView.size()) 
			{
				rightView.add( new ViewNode(root.data, level));
			}
		}
		
		dfs(root.left, hd - 1, level+1);
		dfs(root.right, hd + 1, level+1);
		
	}
	
	
	public static void topView(Node root) {
		
		leftView.clear();
		rightView.clear();
		rootView = null;
			
		dfs(root, 0, 0);
		
		// print left
		
		for (int i = leftView.size()-1 ; i >= 0 ; i--)
		{
			System.out.print(leftView.get(i).data + " ");
		}
		
		// print root
		if (rootView != null) {
		System.out.print(rootView.data + " ");
		}
		// print right
		
		for(int i = 0; i <= rightView.size()-1 ; i++)
		{
			System.out.print(rightView.get(i).data + " ");
		}
		
	}
	
	public static int height(Node root) {
		
		if (root == null) {
			return 0;
		}
		
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		
		return Math.max(leftHeight, rightHeight)+1;
		
	}
	
	
	public static int diameter(Node root) {
		
		if (root == null) {
			return 0;
		}
		
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		
		int totalHeight = (leftHeight+rightHeight+1);
		
		return Math.max( totalHeight, Math.max(totalHeight, totalHeight));
		
	}
	
	

	public static void main(String[] args) 
	{
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.right = new Node(4);
		root.right.left = new Node(5);
		root.right.right = new Node(6);
		
		System.out.println("Top View");
		
		topView(root);
		

	}

}
