package Array;

import java.util.Scanner;

public class MergeTwoArray {

	public static int[]merge(int[]x,int[]y)
	{
		int rs[]=new int[x.length+y.length];
		for(int i=0;i<x.length;i++)
		{
			rs[i]=x[i];
			}
		for(int i=0;i<y.length;i++)
		{
			rs[x.length+i]=y[i]; 
			}
		return rs; 
		}
	int[]readArr()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
	 
	 int n=sc.nextInt();
	 int ar[]=new int[n];
	 System.out.println("enter Elements of Array ");
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
	 
	 public static void main(String[] args)
	 {
		 MergeTwoArray ma=new MergeTwoArray();
		 int a[]=ma.readArr();
		 System.out.print("Entered elements are :");
		 ma.dispArr(a);
		 int b[]=ma.readArr();
		 System.out.print("Entered elements are :");
		 ma.dispArr(b);
		 System.out.println("Merged values are :"); 
		 int c[]=ma.merge(a, b); 
		 ma.dispArr(c);
		 }
	 }