package Array;
import java.util.*;
public class SumofnElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("enter " +n+" values");
        int sum=0;
        for(int i=0;i<n;i++)
        {
        	ar[i]=sc.nextInt();
        	sum+=ar[i];
        }
       
        System.out.println("sum is:"+sum);
        System.out.println("entered elements:");
        for(int i=0;i<ar.length;i++)
        {
        	System.out.println(i+"-->"+ar[i]);
        }
	}

}
