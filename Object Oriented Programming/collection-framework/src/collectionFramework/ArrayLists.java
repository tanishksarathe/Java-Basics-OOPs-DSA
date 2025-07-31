package collectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class ArrayLists {
	
	


	public static void main(String[] args) {
		
		ArrayList<Integer> obj = new ArrayList<Integer>(Arrays.asList(50,5,78,97,1,2));
		
		Collections.reverse(obj);
		
		System.out.println(obj);
		
		System.out.println();
		
		Collections.sort(obj);
		
		System.out.println(obj);
		
		System.out.println();
		
		System.out.println(Collections.binarySearch(obj, 78));
		
		System.out.println();
		
		System.out.println(Collections.min(obj));
		
		System.out.println();
		
		System.out.println(Collections.max(obj));
		
		
		ArrayList<String> color = new ArrayList<String>();
		
		color.add("Blue");
		
		color.add("Black");
		
		System.out.println(color);
		
		System.out.println();
		
		System.out.println(color.get(1));
		
		System.out.println();
		
		System.out.println();
		
		for(int i = 0; i < color.size(); i++) {
			
			System.out.println(color.get(i));
		
		}
		
		System.out.println();
		
		color.add(0, "Red");
		
		
		for (String val : color) {
			System.out.println(val);
		}
		
		System.out.println();
		
		color.set(0, "Yellow");
		
		System.out.println(color);
		
		color.remove(0);
		
		System.out.println(color);
		
		
		
		ArrayList<String> copyco = new ArrayList<String>(color);
		
		System.out.println(copyco);
		
		Collections.shuffle(obj);
		
		System.out.println();
		
		System.out.println(obj);
		
		System.out.println();
		
		System.out.println(obj.subList(0, 3));
		
		
		System.out.println(color.equals(copyco));
		
		System.out.println();
		
		Collections.swap(copyco, 0, 1);
		
		System.out.println(copyco);
		
		color.addAll(copyco);
		
		System.out.println(color);
		
		color.clear();
		
		System.out.println(color);
		
		System.out.println(color.isEmpty());
	}

}
