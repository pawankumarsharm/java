package Array;

import java.util.Scanner;

public class CountNoOfElementInArraywithoutArray {

	public static void main(String[] args) {
		 
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the size of array"); 
		 int n=sc.nextInt(); 
		 System.out.println("enter the elemts");
		 int arr[]=new int[n];
		 for (int i = 0; i < arr.length; i++) 
		 {
			 arr[i]=sc.nextInt();
			 }
		 countElement(arr);
		 }
	static void countElement(int arr[])
	{
		int big=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(big<arr[i])
		 
		 big=arr[i];
			} 
		int c[]=new int [big+1];
		for (int i = 0; i < arr.length; i++) 
		{
			c[arr[i]]++;
			}
		for(int i =0;i<c.length;i++)
		{
			if(c[i]>0)
				System.out.println(i+"-->"+c[i]);
			}
		}
	

	}


