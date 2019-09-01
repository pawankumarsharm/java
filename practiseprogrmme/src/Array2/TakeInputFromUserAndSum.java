package Array2;

import java.util.Scanner;

public class TakeInputFromUserAndSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");//5
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("enter "+n+" elements:");//enter 5 elements
		for (int i = 0; i < ar.length; i++) {
			ar[i]=sc.nextInt();
		}
		System.out.println("user enterd Array elements are:");
		for (int i = 0; i < ar.length; i++) {
			System.out.println(i+"-->"+ar[i]);//1 2 3 4 5
		}
		System.out.println("the sum of array elements:");
		int sum=0;
		for (int i = 0; i < ar.length; i++) {
			sum=sum+ar[i];
		}
		System.out.println(sum);//15
		}
	}


