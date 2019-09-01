package Array;

import java.util.Scanner;

public class CountEO {
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many values");
		int n=sc.nextInt();
		
		System.out.println("enter "+n+" values");
		System.out.println(counteo(n));
		
	}
	
	
	
	
static	public int counteo(int n){
		
		
		int count=0,count1=0;
		for(int i=1;i<n;i++)
		{
			if(i%2==0) 
			
			 count++;
			else 
				count1++;
		
	
		}	
		System.out.println(count1);
		return count;	
}
}