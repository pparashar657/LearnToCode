package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralPrint {

	public static void main(String[] args) {
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		for (int a: spiralOrder(arr)) {
			System.out.println(a);
		}
		int println = 10;
		System.out.println(println);
	}
	
	public static List<Integer> spiralOrder(int[][] matrix) {
        int count = 0;
        int maxCount = matrix.length * matrix[0].length;
        List<Integer> ans = new ArrayList<>();
        
        int lr = 0, lc = 0, ur = matrix.length, uc = matrix[0].length;
        
        while(count < maxCount) {
            for (int i=lc; count < maxCount && i<uc;i++) {
                ans.add(matrix[lr][i]);
                System.out.println(ans);
                count++;
            }
            lr++;
            for (int i=lr; count < maxCount && i<ur;i++) {
                ans.add(matrix[i][uc]);
                System.out.println(ans);
                count++;
            }
            uc--;
            for (int i=uc-1; count < maxCount && i>=lc;i--) {
                ans.add(matrix[ur][i]);
                System.out.println(ans);
                count++;
            }
            ur--;
            for (int i=ur-1; count < maxCount && i>=lr;i--) {
                ans.add(matrix[i][lc]);
                System.out.println(ans);
                count++;
            }
            lc++;
        }
        return ans;
        
    }

}
