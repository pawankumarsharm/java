package Array;

import java.util.Scanner;

public class primeornot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();//7
		int i=1,count=1;
		while(i<=n/2)//1<3//2<3
		{
			if(n%i==0)//7%1==0//7%2==1 it is false condition
				count++;//2
			i++;//2
		}
		if(count==2) {//2==2
		System.out.println(n + " is prime");}
		else {
			System.out.println(n + " is not prime");}
	}

}
