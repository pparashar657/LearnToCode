package classes;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
	
	static int getPairsCount(int[] arr, int n, int k) {
        
        Arrays.sort(arr);
        for (int a:arr) {
        	System.out.println(a);
        }
        // 1 1 1 1 2
        int ans = 0;
        int start = 0;
        int end = n-1;
        while (start < end){
        	System.out.println("Working with start = "+start+" and end = "+end);
            int curSum = arr[start] + arr[end];
            if ( curSum < k){
                start++;
            }else if (curSum > k){
                end--;
            }else {
            	
                int startFreq = 1;
                while (start < end && arr[start] == arr[start+1]){
                    startFreq++;
                    start++;
                }
                System.out.println("Found start freq = "+startFreq+" and start = "+start);
                int endFreq = 1;
                while (start < end && arr[end] == arr[end-1]){
                    endFreq++;
                    end--;
                }
                System.out.println("Found end freq = "+endFreq+" and end = "+end);
                start++;
                end--;
                ans = ans + (startFreq*endFreq);
            }
        }
        return ans;
    }

	public static int helper(int x1,int y1,int x2,int y2){
        int ans = 0;
        Boolean isSlopeMoreThan1 = Math.abs(y2-y1) > Math.abs(x2-x1);
        if (isSlopeMoreThan1) {
            ans = Math.abs(x2-x1) + Math.abs(y2-y1)-(Math.abs(x2-x1));
        }else {
            ans = Math.abs(y2-y1) + Math.abs(x2-x1)-Math.abs(y2-y1);
        }
        return ans;
    }
    
    public static int minTimeToVisitAllPoints(int[][] points) {
        int ans = 0;
        for (int i=0;i<points.length-1;i++){
            ans += helper(points[i][0],points[i][1], points[i+1][0], points[i+1][1]);
        }
        return ans;
    }
    
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[][] = new int[n][2];
		for (int i=0;i<n;i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		System.out.println(minTimeToVisitAllPoints(arr));
		
	}
}
