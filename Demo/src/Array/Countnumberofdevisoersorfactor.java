package Array;

import java.util.Scanner;

public class Countnumberofdevisoersorfactor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int i=1,count=1;
		while(i<=n/2)
		{
			if(n%i==0)
				count++;
			i++;	
			
			
		}
		System.out.println("number of devisors:"+count);
	}

}
