import java.lang.*;
import java.util.Scanner;
import java.io.*;
	
public class patternnn {

	public static void main(String[] args) {
		int t=0,n,i,j,a=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter N value:");
		n=sc.nextInt();
		/*for(i=1;i<=n;i++)
		{
		for(j=1;j<i;j++)
		{
		System.out.print((i)+"*");
		}
		System.out.println(i);
		}
		for(i=n;i>=1;i--)
		{
		for(j=1;j<i;j++)
		{
		System.out.print((i)+"*");
		}
		System.out.println(i);*/
		
		for(i=1;i<=n;i++)
		{
		for(j=1;j<i;j++)
		{
		System.out.print((a++)+"*");
		}
		System.out.println(a++);
		
		/*for(i=n;i>=1;i--)
		{
		a=(i*(i-1))/2+1;
		for(j=1;j<i;j++)
		{
		System.out.print((a++)+"*");
		}
		System.out.println(a++);*/
		
		/*for(i=a;i<=n;i++)
		{
		for(j=a;j<i;j++)
		{
		System.out.print(i+"*");
		}
		System.out.println(i);
		}
		for(i=(n-1);i>=a;i--)
		{
		for(j=1;j<(i-1);j++)
		{
		System.out.print(i+"*");
		}
		System.out.println(i);*/
		
		/*for(i=n;i>=1;i--)
		{
		a=a+i-1;
		for(j=1;j<i;j++)
		{
		System.out.print(a+"*");
		}
		System.out.println(a);
		a=t;
		}
		a=t;
		for(i=1;i<=n;i++)
		{
		a=a+i-1;
		for(j=1;j<i;j++)
		{
		System.out.print(a+"*");
		}
		System.out.println(a);
		a=t;
		}*/
		}
	}
}
