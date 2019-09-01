package Array;

import java.util.Scanner;

public class countdigitinnnumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");//76890=5//0=1//0123=3...left 0 is not valuable.
		int n=sc.nextInt();
		int count=0;
		do
		{
			count++;
			n=n/10;
		}
		while(n!=0);
		System.out.println("number of digits:"+count);
	}

}
