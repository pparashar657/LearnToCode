package arrays;

import java.math.BigInteger;
import java.util.Scanner;

public class MaxSumPath {
	
	static int[] takeInputArray() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the length");
		int len = sc.nextInt();

		int arr[] = new int[len];

		System.out.println("Enetr the elemnts");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	public static void main(String[] args) {
		
		int ar1[] = takeInputArray();
		int ar2[] = takeInputArray();
		
		System.out.println(maxSum(ar1, ar2));
		
		
	}

	public static int maxSum(int[] ar1, int[] ar2) {
	    
	    
		BigInteger sum1 = BigInteger.valueOf(0);
		BigInteger sum2 = BigInteger.valueOf(0);
		BigInteger ans = BigInteger.valueOf(0);
        
       
       
        int i = 0, j = 0;
       
       while(i < ar1.length && j < ar2.length) {
           if (ar1[i] < ar2[j]) 
                sum1 = sum1.add(BigInteger.valueOf(ar1[i++]));
            else if (ar2[j] < ar1[i])
            	sum2 = sum2.add(BigInteger.valueOf(ar2[j++]));
            else {
                ans = ans.add(sum1.max(sum2).add(BigInteger.valueOf(ar1[i])));
                sum1 = BigInteger.valueOf(0);
                sum2 = BigInteger.valueOf(0);
                i++;
                j++;
            }
       }
       
       while(i < ar1.length) {
    	   sum1 = sum1.add(BigInteger.valueOf(ar1[i++]));
       }
       
       while(j < ar2.length) {
    	   sum2 = sum2.add(BigInteger.valueOf(ar2[j++]));
       }
       
       ans = ans.add(sum1.max(sum2));
       
       return ans.intValue();
    }
}
