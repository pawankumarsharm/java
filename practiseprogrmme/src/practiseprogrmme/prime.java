package practiseprogrmme;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int c=0;
		for(int i=2;i<=n/2;i++)
		{
			
				if(n%i==0) 
					c=1;
					break;
				
			}
			if(c==0) 
				System.out.println("the number is prime"+n);
			else
				System.out.println("the number is not prime");
		
	}

}

