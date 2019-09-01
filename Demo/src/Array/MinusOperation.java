package Array;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
public class MinusOperation {

	static int[] Minus(int a[],int b[])
	{
		Set<Integer> ms=new LinkedHashSet<Integer>();
		int[] ar=new int[a.length+b.length]; 
		for (int i = 0; i < a.length; i++)
		{
		 int f=1; 
		 for(int j=0;j<b.length;j++) 
		 {
			 if(a[i]==b[j])
			 {
				 f=0;
				 break;
				 } 
			 }
		 if(f==1)
			 ms.add(a[i]);
		 }
		    int c[]=new int [ms.size()];
		    int i=0;
		    for(Integer in:ms)
		    {
		    	c[i]=in;
		    	i++;
		    	}
		    return c;
		    }
			public static void main(String[] args)
			{
				MinusOperation un=new MinusOperation();
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
		 int [] ar1=Minus(a,b);
		 System.out.println("the result array (a-b) is"); 
		 for (int i = 0; i < ar1.length; i++)
		 { 
			 if(ar1[i]!=0)
				 System.out.println(ar1[i]+" ");
		 }

		 
		 
        System.out.println("====================="); 
        int [] ar2=Minus(b,a); 
        System.out.println("the result array (b-a) is");
        for (int i = 0; i < ar2.length; i++)
        {
        	if(ar2[i]!=0)
        		System.out.print(ar2[i]+" ");
        	}
        sc.close();
        }
        }
