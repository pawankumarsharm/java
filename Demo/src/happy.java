
import java.util.Scanner;
public class happy {

		

		    public static boolean isHappynumber(int n)
		    {
		        
		            int sum = 0;
		            while (n > 0)
		            {
		                sum +=Math.pow(n % 10, 2);
		                n=n/10;
		            }
		            n = sum;
		        
		        return (n == 1||n==7);
		    }

		    public static void main(String[] args)
		    {
		        System.out.print("Input a number: ");
		        int no = new Scanner(System.in).nextInt();
		        boolean rs=isHappynumber(no);
		        if(rs)
		        	System.out.println(no+"is a happy number");
		        else
		        	System.out.println(no+"is not  a happy number");
		    }

	}


