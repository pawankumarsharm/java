package test1;

import java.util.Scanner;

public class Replace_name {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("hello<<userNAme>>,how are you");
		String str="hello<userNAme>,how are you";
		int FirstStr=str.indexOf('<');
		int SecondStr=str.lastIndexOf('>');
		String s=sc.next();
		if(s.length()>3) {
			System.out.println(str.substring(0,FirstStr)+' '+s+str.substring((SecondStr+1),str.length()));
		}
		else
			System.out.println("the name size is less than 3");
			
		}

}
