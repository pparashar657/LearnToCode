package helper;

import java.util.ArrayList;

public class ListArray {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(6);
		arr.add(1);
		arr.add(61);
		arr.add(12);
		arr.add(61);
		arr.add(51);
		arr.add(26);
		arr.add(61);
		
//		for (int i=0;i<arr.size(); i++) {
//			System.out.println(arr.get(i));
//		}
		
		arr.add(3, 13);
		
		arr.remove(1);
		
//		for (int i=0;i<arr.size(); i++) {
//			System.out.println(arr.get(i));
//		}
		
		for (int a: arr) {
			System.out.println(a);
		}
		
		if (arr.contains(61)) {
			System.out.println("Hiiiii");
		}
		
		if (arr.contains(2)) {
			System.out.println("Byeeeee");
		} else {
			System.out.println("Ioopojkh");
		}
		
		System.out.println(arr.indexOf(61));
		
		
		System.out.println(arr.lastIndexOf(61));
		
	}

}
