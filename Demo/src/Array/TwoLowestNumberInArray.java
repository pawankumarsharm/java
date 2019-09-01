package Array;

import java.util.Scanner;

public class TwoLowestNumberInArray {
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
	 int l1=arr[0];
	 int l2=arr[1];
	 for (int i = 0; i < arr.length; i++)
	 {
		 if(l1>arr[i])
		 {
			 l2=l1;
			 l1=arr[i];
			 }

else if(arr[i]<l2&&l1!=arr[i])
{
	 l2=arr[i]; 
	 }
		 }
	 System.out.println("1st lowest = "+l1);
	 System.out.println("2nd lowest = "+l2); 
}
}