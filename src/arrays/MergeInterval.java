package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MergeInterval {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the length");
		int len = sc.nextInt();

		int[][] arr = new int[len][2];

		System.out.println("Enetr the elemnts");
		for (int i = 0; i < arr.length; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
			
		}
		
		for(int[] a: merge(arr)) {
			System.out.println(Arrays.toString(a));
		}
		
	}
	
	public static int[][] merge(int[][] intervals) {
		
		Arrays.sort(intervals, (obj1, obj2) -> Integer.compare(obj1[0], obj2[0]));
		
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
		ArrayList<Integer> curr = new ArrayList<>();
        for (int[] interval: intervals) {
        	
            if (curr.size() == 0) {
                curr.add(interval[0]);
                curr.add(interval[1]);
                continue;
            }
            
            if (curr.get(1) >= interval[0]) {
                curr.set(1, interval[1]);
            } else {
                ans.add(curr);
                
                curr = new ArrayList<>();
                curr.add(interval[0]);
                curr.add(interval[1]);
                
            } 
           
        }
        
        ans.add(curr);
        int[][] res = new int[ans.size()][2];
        
        for(int i=0;i<ans.size();i++) {
        	res[i][0] = ans.get(i).get(0);
        	res[i][1] = ans.get(i).get(1);
        }
        
        return res;
        
    }

}
