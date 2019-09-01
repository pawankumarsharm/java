package Array;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
public class UnionOperation {
	 
 static int[] union(int a[],int b[])
 {
	 Set<Integer> us=new LinkedHashSet<Integer>();
	 for (int i = 0; i < a.length; i++) 
	 {
		 us.add(a[i]);
		 }
	 for(int i=0;i<b.length;i++)
	 {
		 us.add(b[i]);
		 }
	 int ar[]=new int[us.size()];
	 int i=0; 
	 for(Integer ele:us)
	 {
	 
	 ar[i]=ele;
	 i++;
	 } 
 return ar; 
	 }
public static void main(String[] args)
{
	UnionOperation un=new UnionOperation();
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
	 //int ar[]=new int[a.length+b.length];
	 int [] ar=union(a,b);
	 System.out.println("the result array is"); 
	 for (int i = 0; i < ar.length; i++) 
	 {
		 System.out.print(ar[i]+" "); 
		 }
	 }
}


