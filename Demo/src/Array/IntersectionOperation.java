package Array;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
public class IntersectionOperation {
	static int[] interSection(int a[],int b[])
	{
		int[] ar=new int[a.length+b.length]; 
		for (int i = 0; i < a.length; i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
					ar[i]=a[i];
	 
	 }
			}
		return ar; 
		}
	static int[] interSection2(int a[],int b[])
	{
		Set<Integer> is=new LinkedHashSet<Integer>();
		int[] ar=new int[a.length+b.length]; 
		for (int i = 0; i < a.length; i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
					is.add(a[i]); 
				}
			}
		int c[]=new int [is.size()]; 
		int i=0;
		for(Integer in:is)
		{
			c[i]=in; i++; 
			}
		return c;
	 
	 }
	public static void main(String[] args)
	{
		IntersectionOperation un=new IntersectionOperation();
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter the no of value for 1st array"); 
		int n1=sc.nextInt();
		int a[]=new int[n1];
		System.out.println("enter the value");
		for (int i = 0; i < a.length; i++)
		{ 
			a[i]=sc.nextInt(); 
			}
		System.out.println("enter the no of value for 2nd array"); 
		int n2=sc.nextInt();
		int b[]=new int[n2]; 
		System.out.println("enter the value");
		for (int i = 0; i < b.length; i++)
		{
			b[i]=sc.nextInt(); 
			}
		int [] ar1=interSection2(a,b);
	 
	 System.out.println("the result array is");
	 for (int i = 0; i < ar1.length; i++)
	 {
		 if(ar1[i]!=0) 
			 System.out.print(ar1[i]+" "); 
		 }
	 sc.close(); 
	 }
	} 