import java.util.Scanner;
public class Armstrongmton {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int count=0,rem,sum=0,t,t1;
     System.out.println("enter the no. between m to n");
     int m=sc.nextInt();
     int n=sc.nextInt();
   
     for(int i=m;i<n;i++)
 	{
 	
		 t=i;
		 t1=i;
		while(t1!=0)
		{
			rem=i%10;
			sum=sum+(rem*rem*rem);
			i=i/10;
		}
		if(i==t)
		{
			if(count==0)
			{
				System.out.println("armstrong between the given range are:\n");
			}
			System.out.println(i+" ");
			count++;
		}
		sum=0;
	}
     if(count==0) {
    	 System.out.println("armstrong  number not found between given range");
     }
		}
}