package introductionToJava;

import java.util.Scanner;

public class Top2Marks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = Integer.MIN_VALUE;
		int second_max = Integer.MIN_VALUE;
		int curr;
		for (int i=0;i<n;i++) {
			curr = sc.nextInt();
			
			if (curr > max) {
				second_max = max;
				max = curr;
			} else if(curr > second_max){
				second_max = curr;
			} 
		}
		
		double ans = (max + second_max)/ 2.0;
		
		System.out.println(ans);
	}

}
