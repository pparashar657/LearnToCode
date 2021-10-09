package introductionToJava;

import java.util.Scanner;

public class FibonacciNumber {

	public static void main(String[] args) {
		int num, first=0, second =1, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number"); 
        
        num = sc.nextInt();
        while(second<=num)
        {
            System.out.println(second);
            temp = first;
            first = second;
            second += temp;
        }

	}

}
