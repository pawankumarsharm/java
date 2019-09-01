import java.util.Scanner;

public class check {

	public static void main(String[] args) {
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the character");
		ch=sc.next().charAt(0);
		if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' ')
		{
			System.out.println("given charcter is vowel");
			
		}
		else
		{
			System.out.println("given character is consonent");
		}

	}

}
