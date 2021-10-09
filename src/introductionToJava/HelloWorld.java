package introductionToJava;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
	int bs,bh,ts,da,ta,pf;
	Scanner sc = new Scanner(System.in);
	System.out.println(" Enter base salary");
    bs = sc.nextInt();
	
	boolean cond1 = (bs<50000);
	boolean cond2 = ((bs>=50000)&&(bs<70000));
	boolean cond3 = ((bs>=70000)&&(bs<100000));
	boolean cond4 = (bs>=100000);
	
	if(cond1)
	{
		bh = bs + (33*bs)/100;
	}
	else if(cond2)
	{
		bh = bs + (30*bs)/100;
	
	}
	else if(cond3)
	{
		bh = bs + (25*bs)/100;
        
	}   
	
	else
	{
		bh = bs + (22*bs)/100;
	}   
	
	da = (5*bh)/100;
    ta = (10*bh)/100;
    pf = (12*bh)/100;
     
    ts = bh + da + ta - pf;
    System.out.println("Total salar is:"+ts);
	}

}
