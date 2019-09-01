import java.util.Scanner;
public class venodd
{
	
	public static void main(String[] args) {
		int j;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		j=sc.nextInt();
		switch(j%2)
		{
		case 0:
			System.out.println("even");
			break;
		case 1:
			System.out.println("odd");
			break;
		
		}		

	}

}
