package Array;

import java.util.Scanner;

public class occuranceofelementinarray {
	 
	 
static void countEle(int[]ar)
{ 
	int n=ar.length; 
	for (int i = 0; i < n; i++) 
	{
		int count=1;
		for (int j = i+1; j < n; j++) 
		{
			if(ar[i]==ar[j])
			{
				count++;
				ar[j]=ar[n-1]; 
				n--;
				j--; 
				} 
			}
		System.out.println("no of occurence of "+ar[i]+"->"+count);
		}
	}
public static void main(String[] args)
{
	 
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the size of array");
	 int n=sc.nextInt(); 
	 System.out.println("enter the elemts");
	 int arr[]=new int[n];
	 for (int i = 0; i < arr.length; i++) 
	 { 
		 arr[i]=sc.nextInt(); 
		 } 
	 countEle(arr); 
	 }

	
		

	}


