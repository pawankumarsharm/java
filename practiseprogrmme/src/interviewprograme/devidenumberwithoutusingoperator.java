package interviewprograme;

public class devidenumberwithoutusingoperator {

	public static void main(String[] args) {
		int a=13,b=4,q=0;
		while(a>=b)
		{
			a=a-b;
			q++;
		}
		System.out.println("quotient is"+q);
		System.out.println("remainder is"+a);

	}

}
