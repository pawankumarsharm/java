import java.util.Scanner;
public class Armstrong {
	static int numberofdigits(int n)
	{
		int count=0;
		while(n!=0)
		{
			count++;
			n=n/10;
		}
		return count;
	}
	static int pow(int n,int p)
	{
		int pro=1;
				while(p>0)
				{
				pro=pro*n;
				p--;
				}
				return pro;
	}
 static boolean isarmstrong(int x) 
 {
	int dc=numberofdigits(x);
	int sum=0,t=x;
	while(x!=0)
	{
		int r=x%10;
		sum=sum+pow(r,dc);
		x=x/10;
		
	}
	return sum==t;
 }
	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		boolean rs=isarmstrong(no);
		if(rs)
			System.out.println(no+" is armstrong number");
		else
		System.out.println(no+" is not  armstrong number");
		

	}

}
