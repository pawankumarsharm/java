package Array;

import java.util.Scanner;

public class mergesorted {
public int[] mergesorted1(int[] x,int[] y)
{
	int z[]=new int[x.length+y.length];
	int i=0,j=0,k=0;
	while(i<x.length + y.length)
	{
		if(x[i]<y[j])
			z[k++]=x[i++];
		else
			z[k++]=y[j++];
	
	while(i<x.length)
	
			z[k++]=x[i++];

			while(j<y.length)

			z[k++]=y[j++];
	}
	return z;
}
	public int[] readArray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many values");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter"+n+"values");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
		
		}
		return arr;
	
}
	public static void main(String[] args) {
	
		mergesorted ao=new mergesorted();
		
		System.out.println("read the first array elements");

		System.out.println("read first array");
		int x[]=ao.readArray();
		System.out.println("first array elements");
	
		System.out.println("second array elements");
		int y[]=ao.readArray();
		System.out.println("merged array elements");
		int z[]=ao.readArray();
		ao.mergesorted1(x, y);
	}

}
