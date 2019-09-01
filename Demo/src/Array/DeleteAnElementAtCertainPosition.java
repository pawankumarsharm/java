package Array;

import java.util.Scanner;

public class DeleteAnElementAtCertainPosition {
	 
	 static int[] delete(int arr[],int index)
	 {
		 if(index<0||index>arr.length)
		 {
			 System.out.println("index not in range"); 
			 return arr;
			 }
		 int na[]=new int[arr.length-1];
		 for(int i=0;i<na.length;i++)
		 {
	 
	 if(i<index) na[i]=arr[i];
	 else 
		 na[i]=arr[i+1];
	 }
		 return na; 
		 }
	 public static void main(String[] args)
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the array size");
		 int n=sc.nextInt();
		 System.out.println("Enter the element");
		 int arr[]=new int[n];
		 for (int i = 0; i < arr.length; i++) 
		 {
			 arr[i]=sc.nextInt();
			 }
		 System.out.println("Enter the position");
		 int index=sc.nextInt();
		 arr=delete(arr,index);
		 sc.close();
	 
	 System.out.println("The new elemnts"); 
	 for (int i = 0; i < arr.length; i++) 
	 { System.out.print(arr[i]+" ");
	 }
	 }
	
}
