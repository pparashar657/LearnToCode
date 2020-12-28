package helper;

import java.util.ArrayList;
import java.util.Scanner;

public class MergeIntervals {
	
	static class Interval {
		int start;
		int end;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size");
		int n = sc.nextInt();
		ArrayList<Interval> input = new ArrayList<>();
		for (int i=0;i<n;i++) {
			System.out.println("Enter "+ (i+1) +" Interval");
			Interval it = new Interval();
			it.start = sc.nextInt();
			it.end = sc.nextInt();
			input.add(it);
		}
		
		ArrayList<Interval> output = mergeInterval(input);
		
		for (Interval it: output) {
			System.out.println(it.start +" "+ it.end);
		}
	}

	private static ArrayList<Interval> mergeInterval(ArrayList<Interval> input) {
		for (int index = 0; index < input.size() - 1; index++) {
			Interval currentInterval = input.get(index);
			Interval nextInterval = input.get(index+1);
			if (isOverlapping(currentInterval, nextInterval)) {
				System.out.println("Working on index = "+index);
				Interval mergedInterval = new Interval();
				mergedInterval.start = currentInterval.start;
				mergedInterval.end = Math.max(currentInterval.end, nextInterval.end);
				
				input.remove(index);
				input.remove(index);
				input.add(index, mergedInterval);
				index--;
			}
		}
		
		return input;
	}

	private static boolean isOverlapping(Interval currentInterval, Interval nextInterval) {
		if (currentInterval.end >= nextInterval.start) {
			return true;
		}else {
			return false;
		}
	}

}
