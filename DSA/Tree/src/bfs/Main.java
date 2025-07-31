package bfs;

import java.util.ArrayList;

public class Main {
	
	

	public static void main(String[] args)
	{
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.right.right = new Node(6);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		
		ArrayList<ArrayList<Integer>> res = Node.levelOrder(root);
		
		System.out.println(res);
		

	}

}

class Node {
	
	int data;
	Node left, right;

	public Node (int item) {
		data = item;
		left = right = null;
	}
	
	
	static ArrayList<ArrayList<Integer>> levelOrder(Node root)
	{
		
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		levelOrderRec(root, 0, res);
		
		return res;
	}
	
	static void levelOrderRec(Node root, int level, ArrayList<ArrayList<Integer>> res)
	{
		if (root == null) return;
		
		if (res.size() <= level) res.add(new ArrayList<>());
			
		res.get(level).add(root.data);
		
		levelOrderRec(root.left, level + 1, res);
		
		levelOrderRec(root.right, level +1, res);
		
	}
	
		
	
}










