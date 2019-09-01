package test1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		int yr;
	       Scanner scan = new Scanner(System.in);
		   
	       System.out.print("Enter Year : ");
	       yr = scan.nextInt();
		   
	       if((yr%4 == 0) && (yr%100!=0))
	       {
	           System.out.print("This is a Leap Year");
	       }
	       else if((yr%100 == 0) && (yr%400 == 0))
	       {
	           System.out.print("This is a Leap Year");
	       }
	       else if(yr%400 == 0)
	       {
	           System.out.print("This is a Leap Year");
	       }
	       else
	       {
	           System.out.print("This is not a Leap Year");
	       }
	}

}
/*int year = 2000;
boolean leap = false;

if(year % 4 == 0)
{
    if( year % 100 == 0)
    {
        // year is divisible by 400, hence the year is a leap year
        if ( year % 400 == 0)
            leap = true;
        else
            leap = false;
    }
    else
        leap = true;
}
else
    leap = false;

if(leap)
    System.out.println(year + " is a leap year.");
else
    System.out.println(year + " is not a leap year.");*/