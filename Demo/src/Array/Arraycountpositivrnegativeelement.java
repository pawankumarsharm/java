package Array;

import java.util.Scanner;

public class Arraycountpositivrnegativeelement {

	public int getpositive(int[]ar)
	{
		int count=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>0)
				count++;
	 
	 }
		return count;
		}
	public int getnegative(int[]arr)
	{
		int count1=0; 
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
				count1++;
			}
		return count1; 
		}
	public static void main(String[] args)
	{
		Arraycountpositivrnegativeelement ao=new Arraycountpositivrnegativeelement();
		Scanner sc=new Scanner(System.in); 
		System.out.print("enter the no of elements of array");
		int n=sc.nextInt();
		System.out.println("Enter the elements");
		int ar[]=new int [n];
		for (int i = 0; i < ar.length; i++)
		{
			ar[i]=sc.nextInt();
	 
	 } 
		int count=ao.getpositive(ar);
		System.out.println("Positive element is "+count);
		int count1=ao.getnegative(ar); 
		System.out.println("Negative element is "+count1);
		}
	

	}


