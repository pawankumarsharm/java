package Array;

import java.util.Scanner;

public class BiggestElementfromAnArray {
	 
	 
	 static int nthBiggest(int a[])
	 {
		 int big=a[0];
		 for (int i = 1; i < a.length; i++)
		 {
			 if( a[i]>big)
			 {
				 return big=a[i]; 
				 }
			 }
		 return big; 
		 }
	 public static void main(String[] args)
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the no of array");
		 int n=sc.nextInt();
	 
	 System.out.println("Enter the elements");
	 int ar[]=new int [n];
	 for (int i = 0; i <ar.length; i++)
	 {
		 ar[i]=sc.nextInt();
		 }
	 int value=nthBiggest(ar);
	 System.out.println("biggest "+value); 
	 }
	 }