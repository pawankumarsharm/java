package Array2;

import java.util.Scanner;

public class readnintegervaluefromuserandprinthowmanyevenoddvalue {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int ec=0,oc=0;
		System.out.println("enter the"+n+ "elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
			if(arr[i]%2==0)
				ec++;
			else
				oc++;
		}
		System.out.println("the total number of even number is:"+ec);
		System.out.println("the total number of odd number is:"+oc);
}
}