package test1;

import java.util.Random;
import java.util.Scanner;

public class Coin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of times coin flipped");
		int count=0,head=0,tail=1;
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			int n1=(int) (Math.random()*1);
			if(head==n1)
			{
				count++;
			}
		}
		System.out.println((count*100)/n);
		System.out.println(((n-count)*100)/n);
		/*if(Math.random()<0.5) {
			System.out.println("heads");
			System.out.println(Math.random()*100);
		}
			else
			{
				System.out.println("tails");
			*/
		
		}
	}


