import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=kb.nextLine();
		System.out.println("Enter your age");
		byte age=kb.nextByte();
		System.out.println("Your name is "+name);
		System.out.println(name+" age was "+(age-5)+" five year back");
		System.out.println(name+" age will be "+(age+5)+" after five year");
	}
}
