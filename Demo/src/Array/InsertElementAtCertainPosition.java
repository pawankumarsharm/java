package Array;

import java.util.Scanner;

public class InsertElementAtCertainPosition {

	static int[] insert(int arr[],int ele,int index)
	{
		if(index<0||index>arr.length)
		{
			System.out.println("index not in range");
			return arr;
			}
		int na[]=new int[arr.length+1]; 
		na[index]=ele;
		for(int i=0;i<arr.length;i++)
		{
			if(i<index)
				na[i]=arr[i];
			else
				na[i+1]=arr[i];
			}
		return na;
		}
	public static void main(String[] args) 
	{
		InsertElementAtCertainPosition ins=new InsertElementAtCertainPosition();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=sc.nextInt();
		System.out.println("Enter the element");
	 
	 int arr[]=new int[n]; 
	 for (int i = 0; i < arr.length; i++) 
	 { 
		 arr[i]=sc.nextInt(); 
		 }
	 System.out.println("enter element");
	 int ele=sc.nextInt();
	 System.out.println("enter position");
	 int index=sc.nextInt();
	 arr=insert(arr,ele,index);
	 sc.close();
	 System.out.println("The new elemnts");
	 for (int i = 0; i < arr.length; i++)
	 {
		 System.out.print(arr[i]+" ");
		 }
	 }
	
		

	}


