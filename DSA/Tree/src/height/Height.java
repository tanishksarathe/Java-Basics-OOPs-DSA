package height;

import treeQuestions.TopViewDFS;

public class Height {
	
	public static void tree2() {
		
		TopViewDFS.Node root = new TopViewDFS.Node(1);
		
		root.left = new TopViewDFS.Node(2);
		
		root.left.left = new TopViewDFS.Node(7);
		
		root.left.right = new TopViewDFS.Node(8);
		
		root.left.right.right = new TopViewDFS.Node(9);
		
		root.right = new TopViewDFS.Node(3);
		
		root.right.left.left = new TopViewDFS.Node(4);
		
		root.right.right = new TopViewDFS.Node(5);
		
		root.right.left = new TopViewDFS.Node(6);
		
		root.right.right.right = new TopViewDFS.Node(10);
		
		
		
		
		
		
	}
		

	public static void main(String[] args) 
	{
		TopViewDFS.Node root = new TopViewDFS.Node(7);
		
		root.left = new TopViewDFS.Node(5);
		root.left.left = new TopViewDFS.Node(3);
		root.left.left.right = new TopViewDFS.Node(4);
		root.left.left.left = new TopViewDFS.Node(1);
		
		root.left.right = new TopViewDFS.Node(6);
		
		root.right = new TopViewDFS.Node(12);
		root.right.right = new TopViewDFS.Node(15);
		
		root.right.right.left = new TopViewDFS.Node(13);
		root.right.right.right = new TopViewDFS.Node(17);
		
		root.right.left = new TopViewDFS.Node(9);
		root.right.left.right = new TopViewDFS.Node(10);
		root.right.left.left = new TopViewDFS.Node(8);
		
		

		System.out.println(TopViewDFS.height(root));
		
		System.out.println(TopViewDFS.diameter(root));
		
		System.out.println();
		

		
		
		

	}

}
