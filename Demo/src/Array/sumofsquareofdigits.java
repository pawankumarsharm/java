package Array;

import java.util.Scanner;

public class sumofsquareofdigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");//123=14
		int n=sc.nextInt();
		int sum=0;
		while(n!=0)
		{
			int r=n%10;
			sum=sum+r*r;
			n=n/10;
			
		}
		System.out.println("sum of square of digits:"+sum);
	}

}
