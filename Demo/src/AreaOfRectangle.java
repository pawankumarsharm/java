import java.util.Scanner;

public class AreaOfRectangle {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the length size ");
	double l=sc.nextDouble();
	System.out.println("Enter breath size ");
	double b=sc.nextDouble();
	double area=l*b;
	double p=2*(l+b);
	System.out.println("area of rectangle "+area);
	System.out.println("Parameter of rectengle "+p);
}
}
