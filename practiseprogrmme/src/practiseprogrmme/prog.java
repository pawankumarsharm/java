package practiseprogrmme;

import java.util.Scanner;

public class prog {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		/*boolean c=false;//check the number is prime or not//
		 for(int i = 2; i <= num/2; ++i)
	        {
	            if(num % i == 0)
	            {
	                c = true;
	                break;
	            }
	        }
	        if (!c)
	            System.out.println(num + " is a prime number.");
	        else
	            System.out.println(num + " is not a prime number.");*/
	
		/*for (int i = 2; i < num; i++) {// prime number between 1 to n
			  int count = 0;
			   for (int j = 2; j<=i / 2; j++) {
			    if (i % j == 0) {
			     count++;
			     break;
			    }
			   }

			   if (count == 0) {
			    System.out.print(i+ " ");
			}
		}*/
		
		
		
		/*int t=num,rev=0;//reverse of number 
		while(num!=0)
		{
			int r=num%10;
			rev=rev*10+r;
			num=num/10;
		}
		System.out.println("the reverse of number is"+rev);*/
		
		/*int t=num,rev=0;//palindrome or not 
		while(num!=0)
		{
			int r=num%10;
			rev=rev*10+r;
			num=num/10;
		}
		if(rev==t)
		{
			System.out.println(rev +"is palindrome number");
		}
		else
		{
		System.out.println(rev+"is not a palindrome number");
		}*/
		
		
		/*int fact=1;// factorial of number
		for(int i=1;i<=num;i++)
		{
		fact=fact*i;	
		}
		System.out.println("the factorial of the number is"+fact);*/
		
		/*int c=0,a,t=num;//armstrong number
		while(num!=0)
		{
			a=num%10;
			c=c+a*a*a;
			num=num/10;
		}
		if(t==c)
		{
			System.out.println(c + "the is armstrong");//1,153,370,371,410
		}
			else
			{
				System.out.println(c + "is not armstrong");
		}*/

		/*int f1=0,f2=1,f3;//fibonacci series
		for(int i=1;i<=num;i++)
		{
			System.out.print(f1+" ");
			f3=f1+f2;
			f1=f2;
			f2=f3;
		}*/
		
		/*int i=10,j=20;//swap without using 3rd variable
		i=i+j;
		j=i-j;
		i=i-j;
		System.out.println("i=" +i+ "j="+j);i=20,j=10*/
		
		/*int i=10,j=20,temp;
		temp=i;
		i=j;
		j=temp;
		System.out.println("i=" +i+ "j="+j);*/
		
		/*int i=10,j=20;//swap without using 3rd variable
		i=i*j;
		j=i/j;
		i=i/j;
		System.out.println("i=" +i+ "j="+j);*/
		
		/*int i=10,j=20;//swap without using 3rd variable
		i=i^j;
		j=i^j;
		i=i^j;
		System.out.println("i=" +i+ "j="+j);*/
		
		/*String bin=" ";//decimal to  binary
		while(num>0)
		{
			int r=num%2;
			bin=r+bin;
			num=num/2;
		}
		System.out.println("decimal to binary"+bin);*/
		
		/* int decimal=0,p=0;//binary to decimal
         while(num!=0)
         {
        	 decimal+=((num%10)*Math.pow(2,p));
             num=num/10;
             p++;
         }
         
         System.out.println(decimal);*/
	}
	    }
		
	


