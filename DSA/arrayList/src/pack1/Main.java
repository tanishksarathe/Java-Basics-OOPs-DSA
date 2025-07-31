package pack1;

import java.util.ArrayList;

public class Main {
	

	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		list1.add(1);
		list1.add(2);
		
		list1.get(1);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		list2.add(3);
		list2.add(4);
		
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		
		list.add(list1);
		list.add(list2);
		
		System.out.println(list);

	}

}
