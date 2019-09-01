package Array2;

import java.util.Scanner;

public class biggestamongthose {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int n=sc.nextInt();//5
		int arr[]=new int[n];
		System.out.println("enter the"+n+ "elements");
		int max=arr[0];//initialize maximum element
		for (int i = 0; i < arr.length; i++) { // Traverse array elements from second
			arr[i]=sc.nextInt();
			if(arr[i]>max) // compare every element with current max 
				max=arr[i];
		}
			System.out.println("the largest element is"+max);
	}

}
