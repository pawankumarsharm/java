package Array2;

import java.util.Scanner;

public class readNfloatingpointvaluefromuserandprintandcalculatetheSumandAverage {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int sum=0;
		float avg;
		System.out.println("enter the"+n+ "elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		 System.out.println("Sum:"+sum);
	        avg = (float)sum / n;
	        System.out.println("Average:"+avg);
		
		
	}

}
