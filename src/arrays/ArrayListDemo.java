package arrays;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		System.out.println(list);
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println(list);
		
		
		list.add(0, 100);
		
		list.add(3, 90);
		
		System.out.println(list);
		
		
		System.out.println(list.get(6));
		

		list.set(0, 200);
		System.out.println(list);
		
		list.remove(0);
		System.out.println(list);
		
//		System.out.println(list.size());
		
		
//		for (int i=0;i<list.size(); i++) {
//			System.out.print(list.get(i) +" ");
//		}
//		
//		for (int a: list) {
//			System.out.print(a +" ");
//		}
//		
		
//		ArrayList<ArrayList<Integer>> list2D = new ArrayList<>();
//		
//		list2D.add(new ArrayList<>());
//
//		list2D.get(0).add(10);
//
//		list2D.get(0).add(20);
//		
//		System.out.println(list2D.get(0).get(0));
		
		ArrayList<ArrayList<String>> list2D = new ArrayList<>();
		
		list2D.add(new ArrayList<>());

		list2D.get(0).add("Pawan");

		list2D.get(0).add("Chirag");
		
		System.out.println(list2D.get(0).get(0).length());
		
		
	}

}
