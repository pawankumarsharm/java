import java.util.Scanner;

public class marksresult {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the marks of the student");
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		int m3=sc.nextInt();
		int m4=sc.nextInt();
		if(m1<35||m2<35||m3<35||m4<35)
			System.out.println("fail");
		else
		{
		int total=m1+m2+m3+m4;
		double per=total/4.0;
		if(per>=85)
		System.out.println("distinction");
		else if(per>=60)
			System.out.println("1st");
		else if(per>=50)
			System.out.println("2nd");
		else 
			System.out.println("pass");
		}
	}

}
