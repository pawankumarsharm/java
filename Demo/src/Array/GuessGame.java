package Array;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter guess the number(0-9)");
		int rn=sc.nextInt();
		Random rd=new Random();
		int un=rd.nextInt(10);
		if(rn==un)
			System.out.println("you won the game");
		else
			System.out.println("sorry! you loss the game ,the number was"+un);
	}

}
