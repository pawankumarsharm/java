import java.util.Scanner;
public class lovestori {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		
		if(n%3==0&&n%5==0)
			System.out.println("sanju weds geeta");
		else if(n%5==0)
			System.out.println("geeta");
		else if(n%3==0)
			System.out.println("sanju");
		else
			System.out.println("break up...");

	}

}
