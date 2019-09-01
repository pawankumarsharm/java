package Array;
import java.util.Scanner;
public class ProductPriceAverage {

	static boolean isprime(int n)
	{
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				return false;
				
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many values");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter"+n+"values");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("after increament of 5% for prime values");
		for(int i=0;i<n;i++)
		{
			if(isprime(arr[i])) {
				arr[i]=(int)(arr[i]+arr[i]*0.05);
			
			}
			for(int j=0;j<n;j++)
			{
				
				System.out.println(arr[j]);
			}
			
		}
	}

}
