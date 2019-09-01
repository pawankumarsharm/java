package interviewprograme;

import java.util.Scanner;

public class armstrongornot {

	public static void main(String[] args) {
		int arm=0,r;
		Scanner sc=new Scanner(System.in);
		System.out.println("entrer the number");
		int n=sc.nextInt();
		int t=n;
		while(n!=0)
		{
			r=n%10;
			arm=arm+(r*r*r);
			n=n/10;
		}
		if(t==arm)
		{
			System.out.println("armstrong");
		}
		else
		{
			System.out.println("not armstrong");
		}
	}

}
