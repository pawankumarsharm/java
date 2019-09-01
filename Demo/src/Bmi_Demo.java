import java.util.Scanner;

public class Bmi_Demo {
public static void main(String[] args) {
	Scanner kb=new Scanner(System.in);
	System.out.println("Enter your weight in kg");
	
	double w=kb.nextDouble();
	System.out.println("Enter your Height in feet");
	double h=kb.nextDouble();
	int feet=(int)h;
	int inch=(int)((h-feet)*100);
	double m=(feet*12+inch)*0.0254;
	double Bmi=w/(m*m);
	System.out.println("your BMI: " +Bmi);
}
}
