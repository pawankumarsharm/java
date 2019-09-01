package practiseprogrmme;

import java.util.Scanner;

public class pattern1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		/*for(int i=1;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i+j>n-1)
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}*/
		
		/*for(int i=1;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i<=j)
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();*/
		
		/*for(int i=1;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				
				System.out.print("*");
			}
			System.out.println();*/
		
		/*for(int i=1;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i+j<=n-1)
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();*/
		
		/*for(int i=1;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print("*");
					System.out.print(" ");
			}
			System.out.println();*/
		
		/*for(int i=0;i<n;i++)
		{
		for(int j=0;j<n;j++)
			{
				if(i==0||j==0||i==n-1||j==n-1)
				System.out.print("*");
				else
					System.out.print(" ");
		}
			System.out.println();*/
		
		/*for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
			}
				for(int k=0;k<=(2*i);k++)
				{
					System.out.print("*");
				}
			System.out.println();*/
	
	
	/*for(int i=0;i<n;i++)
	{
		for(int j=0;j<i;j++)
		{
			System.out.print(" ");
		}
			for(int k=1;k<=(2*(n-i)-1);k++)
			{
				System.out.print("*");
			}
		System.out.println();*/
		
		int spaces=n/2;
		int star=1;
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<=spaces;j++)
			{
				System.out.print(" ");
			}
				for(int k=1;k<=star;k++)
				{
					System.out.print("*");
				}
			System.out.println();
			if(i<n/2)
			{
				spaces--;
				star+=2;
			}
			else
			{
				spaces++;
				star-=2;
			}
			
		

}}
}