import java.util.*;
public class Array_Demo {

	public static void main(String[] args) {
		/*int []a= {10,20,30,40};
		int sum=0;
		System.out.println("the length of array is"+a.length);
		for (int i = 0; i < a.length; i++) {
			sum=sum+a[i];
		}
		System.out.println("the sum of array elements are"+sum);*///the sum of elements is 100
		
		/*int []a= {10,20,30,40};
		System.out.println("the length of array is"+a.length);
		for (int i = a.length-1; i >=0; i--) {
			System.out.println("the reverse order of the array are:"+a[i]);*/// reverse order are 40,30,20,10
		
		/*int []a= {10,20,30,40,50,60,70,80,90,100};
		for (int i =1; i <=9; i+=2) {
			System.out.print(a[i]+" ");*///elements in alternative order from position first 20 40 60 80 100
			
	/*int arr[]= {11,7,10,13,21,18,15,2,22,25};
		int e=0,o=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0)
			{
			e++;
			}
			else
			{
				o++;
		}
	}
		System.out.println("the total even elements in this array are:"+e);

		System.out.println("the total odd elements in this array are:"+o);*///total odd and even element
		
		/*int c=0;
		int ar[]=new int[10];
		for (int i = 0; i <10; i++) {
			int ran=(int)(Math.random()*30);
			ar[i]=ran;
		}
		for (int i = 0; i <10; i++) {
			System.out.print(ar[i]+"  ");
		}
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]==20)
				c++;
		}
		System.out.println("the 20 is"+c+"timess in the random array");*///count the 20 in random array
		
		/*int a[]={1,2,3,4,5,9,11,10,15,6,2,8,5,1};
		int m=a.length;
		int p;
		if(m%2==0)
		{
		 p=1;
		}
		else
		{
			 p=0;
		}
		for (int i = p; i < a.length; i+=2) {
			System.out.println(a[i]);
			
		}*///print the element according to size of the array(even size then even position element)
		
		/*int a[]= {1,2,3,4,5,9};
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum=sum+a[i];
		}
		System.out.println("the sum of the array elememts are " + sum);*/
		
		/*int a[]= {1,2,3,45,5,7,8,9};
		int a1[]=new int[a.length];
		int i,j;
		for (i = 0; i < a.length; ++i) {
			a1[i]=a[i];}
		for (j = 0; j < a1.length; ++j)
		{
			
					System.out.print(a1[j]+" ");//copy the element of array into another array
		}*/

	/*	int a[]= {1,2,3,45,5,7,8,9};
		int a1[]=new int[a.length];
		
		for (int i = a1.length-1; i>=0; i--) {
			a1[i]=a[i];
		
		System.out.println(a1[i]);//reverse the element of given array
		}*/
	
		/*int a[]= {1,2,3,45,5,7,8,9,0};
		int a1[]= {3,7,9,5,7};
		int a2[]=new int[(a.length)+(a1.length)];
		int c=0;
	System.out.println(a2.length);
	for (int j = 0; j < a.length; j++) {
		a2[j]=a[j];
		c++;
	}
	for(int i=c;i<a2.length;i++) {
		a2[i]=a1[i-a.length];
	}
	for(int k=0;k<a2.length;k++) {
		
		System.out.print(a2[k]);
	}
		for (int k = 0; k < a2.length; k++) {
			for (int i = 0; i < a2.length; i++) {
				
			}
			if(a2[k]<=a[k+1]) {
				int temp=a[k];
				a[k]=a[k+1];
				a[k+1]=temp;
			}
			else {
				System.out.println("not sorted");
			}
		
//	}for (int i = 0; i < a2.length; i++) {
//		System.out.print(a2[i]+" ");//merge two  unsorted array
	}
		
	
		int ar[]=new int[10];
		int a[]=new int[10];
		int b[]=new int[10];
		for (int i = 0; i<ar.length; i++) {
			int ran=(int)(Math.random()*30);
			ar[i]=ran;
			System.out.print(ar[i]+" ");
		}
		System.out.println();
			for(int i=0;i<ar.length;i++)
			{
				if(ar[i]%2==0)
				{
					a[i]=ar[i];
				}
				else
				{
					b[i]=ar[i];
				}
			
			}
			System.out.println("Even");
			for(int i=0;i<a.length;i++) {
				System.out.print(a[i]+"  ");
			}
			System.out.println();
			System.out.println("odd");
			for(int i=0;i<b.length;i++) {
				System.out.print(b[i]+"  ");
			}
		/*int ar[]=new int[10];
		for (int j = 0; j < ar.length; j++) {
			int ran=(int)(Math.random()*30);
			ar[j]=ran;
			System.out.print(ar[j]+" ");
		}
		System.out.println();
		//Arrays.sort(ar);
		int temp;
		for (int i = 0; i < ar.length; i++) 
		for(int j=i+1;j<ar.length;j++) 
			if(ar[i]<ar[j]) {
				temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
			}
		System.out.println(ar[1]);
		
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}*/
		
		
		
		/*int arrr[]= {1,5,2,1,3,6,7,4,3,2,2,6,7,9};
		 HashSet<Integer> hash_Set = new HashSet<Integer>();
		for(int i=0;i<arrr.length;i++) {
			hash_Set.add(arrr[i]);
		}
		System.out.println(hash_Set);///find unique element from given element
		*/
		
		}	
	}