package Array;

import java.util.Scanner;

public class happyno {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int no=sc.nextInt();
		boolean b=isHappy(no);
		if(b)
			System.out.println("is happy number");
		else
			System.out.println("is not a happy number");
	}

	static boolean isHappy(int n)
	{
		while(n>9)
		{
			int sum=0;
			while(n!=0)
			{
				int r=n%10;
				sum=sum+r*r;
				n=n/10;
			}
			n=sum;
		}
		if(n==1||n==7)
			return true;
		else
			return false;
	}
		
	}

