package interviewprograme;

import java.util.Scanner;

public class checkprimeornot {

	public static void main(String[] args) {
		int i=1,count=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		while(i<=n/2)
		{
			if(n%i==0)
				count++;
			i++;
		}
		if(count==2)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}
		
		
	}}


