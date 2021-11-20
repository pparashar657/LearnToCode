package arrays;

import java.math.BigInteger;
import java.util.*;

public class MissingAndRepeating {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the length");
		int len = sc.nextInt();

		int arr[] = new int[len];

		System.out.println("Enetr the elemnts");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(findTwoElement(arr, len));
	}

	static ArrayList<Integer> findTwoElement(int arr[], int n) {
        BigInteger originalSum = BigInteger.valueOf(0);
        BigInteger originalSquareSum = BigInteger.valueOf(0);
        
        for(int num: arr) {
        	originalSum = originalSum.add(BigInteger.valueOf(num));
        	originalSquareSum = originalSquareSum.add(BigInteger.valueOf(num).multiply(BigInteger.valueOf(num)));
        }
        
        BigInteger expectedSum = BigInteger.valueOf(n).multiply(BigInteger.valueOf(n + 1))
        		.divide(BigInteger.valueOf(2));
        
        BigInteger expectedSquareSum = expectedSum.multiply(BigInteger.valueOf(2).multiply(BigInteger.valueOf(n)).add(BigInteger.valueOf(1)))
        		.divide(BigInteger.valueOf(3));
        
        BigInteger diff1 = expectedSum.subtract(originalSum);
        BigInteger diff2 = expectedSquareSum.subtract(originalSquareSum);
        
        int yPlusX = diff2.divide(diff1).intValue();
        int yMinusX = diff1.intValue();
        
        int y = (yPlusX + yMinusX)/2;
        int x = (yPlusX - yMinusX)/2;
        
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(x);
        ans.add(y);
        
        return ans;
    }
	
//	static ArrayList<Integer> findTwoElement(int arr[], int n) { 
//		
//		
//		int originalSum = 0;
//		int originalSquareSum = 0;
//		
//		for (int a : arr) {
//			originalSum += a;
//			originalSquareSum += (a*a);
//		}
//		
//		int expectedSum = n*(n+1)/2;
//		int expectedSquareSum = n*(n+1)*(2*n + 1)/ 6;
//		  
//		int diff1 = expectedSum - originalSum;
//        int diff2 = expectedSquareSum - originalSquareSum;
//        
//        int yPlusX = diff2/diff1;
//        int yMinusX = diff1;
//        
//        int y = (yPlusX + yMinusX)/2;
//        int x = (yPlusX - yMinusX)/2;
//        
//        ArrayList<Integer> ans = new ArrayList<>();
//        ans.add(x);
//        ans.add(y);
//        
//        return ans;
//		
//	}
}
























