package Array2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class newArray {

	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter the range of an array");//5
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("enter"+n+"values");//1 2 3 4 5
		int sum=0;
		for (int i = 0; i <n; i++) {
			ar[i]=sc.nextInt();
			sum=sum+ar[i];
		}
		System.out.println("sum is"+sum);//15
*/		
	/*	int ar[]=new int[10];
		for (int i = 0; i <10; i++) {
			ar[i]=9-i;
		}
		for (int i = 0; i < 10; i++) {
			ar[i]=ar[9-i];
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(ar[i]);//0 1 2 3 4 4 3 2 1 0//overlap
		}*/
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter the range of an array");//5
		int n=sc.nextInt();
		int ar[]=new int[n];
		
		 for(int i=0; i<n; i++)
		    {
		        ar[i] = sc.nextInt();
		    }
		 
		    for(int i=2; i<ar.length; i++){
		        boolean isPrime = true;	
		        
		        for (int j=2; j<i; j++){
		            if(i%j==0){
		                isPrime = false;
		                break;
		            }
		        }
		        
		        if(isPrime)

		            System.out.println(i + " are the prime numbers in the array ");
		        else
		        	System.out.println(i + " are the not prime numbers in the array ");
		}*/
		
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("enter the range of an array");//5
		int n=sc.nextInt();
		int ar[]=new int[n];
		int pro=1;
		System.out.println("enter"+n+"values");//1 2 3 4 5
		for (int i = 0; i < ar.length; i++) {
	        ar[i] = sc.nextInt();
			pro=pro*ar[i];
		}
		System.out.println(pro);*///120
		
		/*int a[]= {1,1,2,2,3,4,5};
		int b[]= {6,7,8};
		int c[]=new int[a.length+b.length];
		for (int i = 0; i < a.length; i++) {
			c[i]=a[i];
		}
		for (int i = a.length; i < c.length; i++) {
			c[i]=b[i-a.length];
		}
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);//1 2 3 4 5 6 7 8
		}*/
		
		/*int a[]= {1,2,3,45,6};
		for (int i = a.length-1; i>=0; i--) {
			System.out.println(a[i]);//6,45,3,2,1
		}*/
		
		/*int pos,x;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the range of an array");//6
		int n=sc.nextInt();
		int ar[]=new int[n+1];
		System.out.print("enter all the elements");//1 4 3 6 9 8
		for (int i = 0; i <n; i++) {
			ar[i]=sc.nextInt();
		}
		System.out.print("enter the position where you want to insert the element");//3
		pos=sc.nextInt();
		System.out.print("enter the element you want to insert");//7
		x=sc.nextInt();
		for (int i = (n-1); i>=(pos-1); i--) {
			ar[i+1]=ar[i];
		}
		ar[pos-1]=x;
		System.out.println("after inserting:");
		for (int i = 0; i < n; i++) {
			System.out.print(ar[i]+",");//1,4,7,3,6,9,8
		}
		System.out.print(ar[n]);*/

	/*int []ar={25,14,56,15,36,56,77,18,29,49};
	System.out.println("original arrays"+Arrays.toString(ar));
	int removeindex=5;
	for (int i = removeindex; i < ar.length-1; i++) {
		ar[i]=ar[i+1];
	}
	System.out.println("after removing the second element"+Arrays.toString(ar));*/
		
		/*Scanner sc=new Scanner(System.in);
		int ar[]= {10,20,30,40,50,60};
		System.out.print("enter array element to check whether it is present or not");
		int ele=sc.nextInt();
		int index=getIndexofArrayElement(ele,ar);
		System.out.println("index of given element is"+index);
	}
	static int getIndexofArrayElement(int ele,int ar[])
	{
	for (int i = 0; i < ar.length; i++) {
		if(ar[i]==ele)
			return i;
	}
	return -1;*/
		
		/*int ar[]= {1,25,35,65,98};
		int temp;
		for (int i = 0; i < ar.length; i++) {
			for (int j = i+1; j < ar.length; j++) {
				if(ar[i]<ar[j])
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
			for (int i = 0; i < ar.length; i++) {
			}
			System.out.println("the second largest element is:");
			System.out.println(ar[1]);*///second largest element
		
	/*	int ar[]={1,2,3,4,3,4,5,7,0,9};
		int count=0;
		int ele=4;
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]==ele)
				count++;
		}
		System.out.println(count);*///count occurance of element
		
		/*Integer[] ar1 = {0,2,4,6,8};
	      Integer[] ar2 = {1,3,5,7,9};
	       
	      HashSet<Integer> set = new HashSet<>();
	       
	      set.addAll(Arrays.asList(ar1));
	       
	      set.addAll(Arrays.asList(ar2));
	       
	      System.out.println(set);
	     
	    //convert to array
	      Integer[] union = {};
	    union = set.toArray(union);
	     
	    System.out.println(Arrays.toString(union));*///[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		
		 /* int ar1[] = {23, 36, 96, 78, 55};
	      int ar2[] = {78, 45, 19, 73, 55};
	      System.out.println("Intersection of the two arrays ::");
	     
	      for(int i = 0; i<ar1.length; i++ ) {
	         for(int j = 0; j<ar2.length; j++) {
	            if(ar1[i]==ar2[j]) {
	               System.out.print(ar2[j]+" ");//intersection of two arrays
	            }
	         }
	      }*/
		
					
		/*  int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};  
	         
	        int [] ar = new int [arr.length]; //Array ar will store frequencies of element  
	        int temp = -1;  
	        for(int i = 0; i < arr.length; i++){  
	            int count = 1;  
	            for(int j = i+1; j < arr.length; j++){  
	                if(arr[i] == arr[j]){  
	                    count++;  
	                    //To avoid counting same element again  
	                    ar[j] = temp;  
	                }  
	            }  
	            if(ar[i] != temp)  
	                ar[i] = count;  
	        }  
	  
	        //Displays the frequency of each element present in array  
	        System.out.println("---------------------------------------");  
	        System.out.println(" Element | Frequency");  
	        System.out.println("---------------------------------------");  
	        for(int i = 0; i < ar.length; i++){  
	            if(ar[i] != temp)  
	                System.out.println("    " + arr[i] + "    |    " + ar[i]);  
	        }  
	        System.out.println("----------------------------------------");  */
		
		/*int arrr[]= {1,5,2,1,3,6,7,4,3,2,2,6,7,9};
		 HashSet<Integer> hash_Set = new HashSet<Integer>();
		for(int i=0;i<arrr.length;i++) {
			hash_Set.add(arrr[i]);
		}
		System.out.println(hash_Set);///find unique element from given element
*/	
		int[] a= {1,-2,-3,-4,5,-6,7,8,-9};
		for (int i = 0; i < a.length; i++) {
			if(a[i]>0)
			{
				a[0]++;
			}
			else {
				a[1]++;
			}
		}
		System.out.println("the positive elements are" +a[1]);
		System.out.println("the negative elements are"+a[0]);
		}
}