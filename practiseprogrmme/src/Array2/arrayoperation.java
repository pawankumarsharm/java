package Array2;

import java.util.Scanner;

public class arrayoperation {
	int[] readArr()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");//5
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("enter "+n+" elements:");//enter 5 elements
		for (int i = 0; i < ar.length; i++) {
			ar[i]=sc.nextInt();
	}
		return ar;
	}
	
	
	void display(int[] ar)
	{
		for (int i = 0; i < ar.length; i++) {
			if(i<ar.length-1)
			System.out.println(ar[i]+",");
			else
				System.out.println(ar[i]);
		}
}
	int [] merge(int[] x,int[] y)
	{
		int z[]=new int[x.length+y.length];
		for (int i = 0; i < x.length; i++) {
			z[i]=x[i];
		}
		for (int i = 0; i < y.length; i++) {
			z[i+x.length]=y[i];
		}
		return z;
		}
	
	
			int sumofArray(int a[])
			{
				int sum=0;
				for (int i = 0; i < a.length; i++) {
					sum=sum+a[i];
				}
				return sum;
		}
			
			
			int biggestArr(int[] ar)
			{
				int big=ar[0];
				for (int i = 0; i < ar.length; i++) {
					if(ar[i]>big)
						big=ar[i];
				}
				return big;
			}
			
			
			int[] countEO(int ar[])
			{
				int count[]= {0,0};
				for (int i = 0; i < ar.length; i++) {
					count[ar[i]%2]++;
				}
				return count;
				}
			
			
			public void countPN(int ar[])
			{
				int count[]= {0,0};
				int p=0,n=0;
				for (int i = 0; i < ar.length; i++) {
					if(ar[i]>=0)
						p++;
					else
						n++;
				}
				}
			
			
			public int[] sumofEvenOdd(int[] x)
			{
				int sum[]= {0,0};
				for (int i = 0; i < x.length; i++) {
					if(x[i]%2==0)
						sum[0]=sum[0]+x[i];
					else
						sum[1]=sum[1]+x[i];
				}
				return sum;
				}
			
			
			public int[] mergeSort(int a[], int b[])
			{
				int c[]=new int[a.length+b.length];
				int i=0,j=0,k=0;
				while (i<a.length&&j<b.length) {
					if(a[i]<b[j])
						c[k++]=a[i++];
					else
						c[k++]=b[j++];
				}
				while(i<a.length)
				{
					c[k++]=a[i++];
				}
				while(j<b.length)
				{
					c[k++]=b[j++];
				}
				return c;
			}
			
			
			int i;
			public int reverse(int a[]) {
				for (int i = 0; i < a.length/2; i++) {
					int t=a[i];
					a[i]=a[a.length-1-i];
					a[a.length-1-i]=t;
				}
				return a[i];
			}
	}
