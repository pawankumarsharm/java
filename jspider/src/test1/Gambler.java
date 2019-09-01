package test1;

import java.util.Scanner;

public class Gambler {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the stack");
        int stake  = sc.nextInt(); 
        System.out.println("Enter gole");
        int goal  = sc.nextInt();
        System.out.println("enter trials");
        int trials  = sc.nextInt();// gambler's stating bankroll

        int bets = 0;        // total number of bets made
        int wins = 0;        // total number of games won

                for (int t = 0; t < trials; t++) {// repeat trials times
            int cash = stake;// do one gambler's ruin simulation
            while (cash > 0 && cash < goal) {
                bets++;
                if (Math.random() < 0.5)
                	cash++;     // win $1
                else             
                	cash--;     // lose $1
            }
            if (cash == goal) 
            	wins++;                // did gambler go achieve desired goal?
        }

        System.out.println(wins + " wins of " + trials); // print results
        System.out.println("Percent of games won = " + 100.0 * wins / trials);
        System.out.println("Avg # bets           = " + 1.0 * bets / trials);
 
	}

}
