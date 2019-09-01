import java.util.Scanner;

public class practiseprogforinterview {

	public static void main(String[] args) {
		/*int a[]= {70,80,20,90,70,50,90,70,90};//take an array as input
		int temp[]=new int[a.length];//take a new array of equal length of old array
		int j=0;
		for (int i = 0; i < a.length-1; i++) { //retrive the element of given array upto last index
			if(a[i]==a[i+1])//compare each element with its adjacent element
			{
		}
			temp[j]=a[a.length-1];//store the highest eccourance  element int temp
	}
			System.out.println(temp[j]);*///print the highest eccourance  element
		
		
		/*int a[]= {121,41,45,91,8,91,13};//take a new array
		int l=0,r=a.length-1;// l and r are first and last position of array
		while(l<r)//it check till the left index element is smaller than right index element
		{
			while(a[l]%2==0 && l<r)//it check for first even 
				l++;
			while(a[r]%2==1 && l<r)//it check for odd
				r--;
			
			if(l<r)
			{
				int temp=a[l];// after getting even odd store that element swap it and sort it according to even odd
				a[l]=a[r];
				a[r]=temp;
			}
			}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");//print all sorted element
*/			
		/*int a[]= {1,2,2,3,4,4,4,5,5};//take input as array
		int temp[]=new int[a.length];//take a new array as same length of old array
		int j=0;
		for (int i = 0; i < a.length-1; i++)//retrive the element of array 
			{
				if(a[i]!=a[i+1])// check the adjacent element is equal or not
				{
					temp[j]=a[i];// if it is not equal then store the element into new array
					j++;
				}
			}
			temp[j]=a[a.length-1];//after comparing store all element in the order
			
		for (int i = 0; i < a.length; i++) {
			if(temp[i]!=0)// for removing the empty spaces after removing duplicate elements
				System.out.print(temp[i]+" ");// print all non repeated element 
		}*/
		
		/*int a[]= {1,2,3,9,5,6,1,4,6,9};//take input as array
		for (int i = 0; i < a.length; i++) {//retrive the element of array 
			for (int j = i+1; j < a.length; j++) {//retrive next elemnt 
				if(a[i]==a[j])// compare the array element with its adjacent element
				{
					System.out.print(a[j]+" ");//print all duplicate element
				}
			}
		}*/
		
		/*int a[]= {1,2,3,4,5};//take first array
		int b[]= {6,7,8};//take second array
		int c[]=new int[a.length+b.length];// take new array with adding length of both array 
		for (int i = 0; i < a.length; i++) {//retrive element from first array
			c[i]=a[i];//store first array element into new array
		}
		for (int i = a.length; i < c.length; i++) {//retrive element of second array for new array
			c[i]=b[i-a.length];//storing second array element into new array after first array element
		}
		for (int i = 0; i < c.length; i++) {//retrive all the stored elemnt in new array
			System.out.print(c[i]+" ");// print all the merged element
		}*/
		
		/*int a[]= {55,678,8,99,100};//take an array
		int temp;
		for (int i = 0; i < a.length; i++) {//retrive element from array
			for (int j = i+1; j < a.length; j++) {//retrive next element
				if(a[i]<a[j])//compare each element to its adjacent element
				{
					temp=a[i];//swap and sort the elemnet
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {//retrive the sorted element
			System.out.print(a[1]+" ");//print the second largest element
			break;
		}		*/
		
		/*int a[]= {1,2,3,4,5,0,7,8,9};//take an array
		int missing,miss=0,sum=0;
		for (int i = 0; i <= a.length; i++) {//retrive the position
			sum=sum+i;//sum of length of elements position
		}
		for (int j = 0; j < a.length; j++) {//retrive the element
			miss=miss+a[j];//add all the element
		}
		missing=sum-miss;//find missing element by substracting sum of position-sum of element
		System.out.println(missing);//print missing element
			*/
		
		/*int a[]= {12,34,11,120,444,5};//take an array
		int temp=0;
		for (int i = 0; i < a.length; i++) {//retrive element
			for (int j = i+1; j < a.length; j++) {//retrive next element
				if(a[i]<a[j])//compare each element to its adjacent element
				{
					temp=a[i];//swapping and sorting
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {//retrive sorted elements
			System.out.print(a[i]+" ");*///print sorted array
			
	/*String s1="pawan";
	String s2="";
	for (int i = s1.length()-1; i >=0; i--) {
		s2=s2+s1.charAt(i);
	}
	System.out.println(s2);*/
		
		/*String s1="malayalam";
		String s2="";
		String temp="";
		temp=s1;
		for (int i = s1.length()-1;i>=0; i--) {
			s2=s2+s1.charAt(i);
		}
		if(s2.equals(temp))
		{
			System.out.println("string is aplindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
*/	
	/*String s="pawan kumar";
	int a[]=new int[26];
	for (int i = 0; i <s.length(); i++) {
		if(s.charAt(i)>=65&&s.charAt(i)<=90) {
		a[s.charAt(i)-65]++;//0
		}
		else if(s.charAt(i)>=97&&s.charAt(i)<=122) {
			a[s.charAt(i)-97]++;
	}
	}
		for(int i=0;i<26;i++)
		{
			if(a[i]!=0)
				System.out.println((char)(i+65)+" "+a[i]);
	}*/
	
		/*String s="this is pawan and you";
		int[] vowels=new int[128];
		
		String s1=s.toLowerCase();
		char[] ch=s1.toCharArray(); 
		for (int i = 0; i <ch.length; i++) {
		
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				vowels[ch[i]]++;
			}
		
		}
		for (int i = 0; i < vowels.length; i++) {
			if(vowels[i]!=0)
				System.out.println((char)i+" "+vowels[i]);
		}*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range");
		int n=sc.nextInt();
		System.out.println("enter the elements of an array");
		int[] a=new int[n];
		int[] e=new int[n];
		int[] o=new int[n];
		for (int i = 0; i <n; i++) {
			a[i]=sc.nextInt();//5
		}
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2==0) {
				e[i]=e[i]+a[i];//even number
			}
			else if(a[i]%2==1) {
				o[i]=o[i]+a[i];//odd number
			}
		}
		for (int i = 0; i < e.length; i++) {
			if(e[i]!=0)
				System.out.print(e[i]+" ");
		}
		for (int i = 0; i < o.length; i++) {
			if(o[i]!=0)
				System.out.print(o[i]+" ");
		}
	}
	}		
		
		

