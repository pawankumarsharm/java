package Array;

import java.util.Scanner;

public class reversetheelementinarray {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println ("enter the size"); 
		int length= sc.nextInt (); 
		int arr [ ] =new int [length];
		System.out.println ("enter the "+length+" elements");
		for (int i = 0; i < arr.length; i++) 
		{ 
			arr[i] =sc.nextInt ();
		}
		
		System.out.println("Before Reverse of an Array");
		 for (int i = 0; i < arr.length; i++)
		 {
			 System.out.println ("arr ["+i+"] ---->"+arr[i]); 
			 }
		 for (int i = 0; i < arr.length/2; i++)
		 {
			 int t=arr[i];
			 arr[i] =arr [arr.length-1-i];
			 arr [arr.length-1-i] =t;
			 }
		 
		System.out.println("After Reverse of an Array");
		
		 for (int i = 0; i < arr.length; i++)
		 {
			 System.out.println ("arr ["+i+"] ---->"+arr[i]);

	}

	}
}
/*
write a program to reverse array element using method
package onedimensionarry; import java.util.Scanner; public class ReverseArray { void reversearray(int ar[]){ for(int i=0;i<=ar.length/2;i++){ int t=ar[i]; ar[i]=ar[ar.length-1-i];
 
 ar[ar.length-1-i]=t; } System.out.println("reverse elements"); for (int i = 0; i < ar.length; i++) { System.out.print(ar[i]+" "); } } public static void main(String[] args) { ReverseArray rc=new ReverseArray(); Scanner sc=new Scanner(System.in); System.out.print("Entered elemnts are "); int n=sc.nextInt(); System.out.println("Enter the elements"); int ar[]=new int [n]; for (int i = 0; i < ar.length; i++) { ar[i]=sc.nextInt(); } rc.reversearray(ar); }
 
}
o/p:- Entered elemnts are 4 Enter the elements 2 4 6 7 reverse elements 7 4 6 2
 */
