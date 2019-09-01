package Array;

import java.util.Scanner;

public class ArrayLeastValue {
	
	 
	 
	 int[]readArr()
	 {
		 Scanner sc=new Scanner(System.in); 
		 System.out.println("Enter the size of array");
		 int n=sc.nextInt();
		 int ar[]=new int[n];
		 System.out.println("enter "+n+" Elements of Array ");
		 for(int i=0;i<ar.length;i++)
		 {
			 ar[i]=sc.nextInt(); 
			 }
		 return ar;
		 } 
	 void dispArr(int ele[])
	 { 
		 for(int i=0;i<ele.length;i++)
		 {
	 
	 System.out.print(ele[i]);
	 if(i<ele.length-1)
	 { 
		 System.out.print(",");
		 }
	 }
		 System.out.println(); 
		 }
	 public int getsmallest(int[]ar)
	 {
		 int small=ar[0];
		 for(int i=1;i<ar.length;i++)
		 {
			 if(ar[i]<small)
				 small=ar[i];
			 }
		 return small;
		 }
	 public static void main(String[] args)
	 {
		 ArrayLeastValue ao=new ArrayLeastValue();
		 int ar[]=ao.readArr(); 
		 System.out.print("Entered elemnts are ");
		 ao.dispArr(ar); 
		 int k=ao.getsmallest(ar);
	 
	 System.out.println("Smallest element is "+k); 
	 }
	 }