package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Pair {
	int start;
	int end;
	
	public Pair(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return start + " " + end;
	}
}

public class ArrowsAndBallons {
  public static int minArrows(int coordinates[][]) {
	  
	Arrays.sort(coordinates, (a,b)-> Integer.compare(a[0], b[0]));
     
    int arrows = 0;
    int end = Integer.MIN_VALUE;
    
    for(int[] point: coordinates) {
    	
    	if (end < point[0]) {
    		end = point[1];
    		arrows++;
    	}
    }
    
    return arrows;
    
  }
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt(); // number of balloons
    int coordinates[][] = new int[n][2];
    for (int i = 0 ; i < n ; i++) {
      coordinates[i][0] = scn.nextInt();
      coordinates[i][1] = scn.nextInt();
    }

    System.out.println(minArrows(coordinates));
  }
}