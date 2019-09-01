package Array;

import java.util.Scanner;

public class ArrayEvenOddCount {

	 
	int[] readArr()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter How many integer value you want"); 
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the values");
		for(int i=0;i<arr.length;i++)
	 
	 { 
			arr[i]=sc.nextInt();
			}
		return arr;
		}
	void dispArr(int ele[])
	{
		for(int i=0;i<ele.length;i++)
		{
			System.out.print(ele[i]); 
			if(i<ele.length-1)
				System.out.print(",");
			}
		}
	int[] countEvOd(int a[])
	{
		int count[]=new int[2];
		System.out.println("even and odd values are ");
		for(int i=0;i<a.length;i++)
	 
	 { 
			count[a[i]%2]++;
			}
		return count;
		}
	public static void main(String[] args)
	{
		ArrayEvenOddCount eo=new ArrayEvenOddCount();
		int arr[]=eo.readArr();
		int[] evod=eo.countEvOd(arr);
		eo.dispArr(evod); 
		}
	}
	
