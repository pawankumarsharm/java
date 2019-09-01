import java.util.Scanner;

public class middlenumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the three distinct integer number");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		
		if(x>y&&x<z||x>z&&x<y)
		{
			System.out.println(x+"the middle element is");
		}
		else if(y>x&&y<z || y>z && y<x)
			System.out.println(y+"the midlle number is");
		else
			System.out.println(z+" is middle numbrer");
	}

}
