import java.util.*;
public class guessgame {
	
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		int count=0;
		while(true)
		{
		System.out.println("enter the number between(0-9)");
		int no=sc.nextInt();
		count++;
		
		Random rd=new Random();
		int rno=rd.nextInt(10);
		if(no==rno)
			
		{
		 System.out.print("wow your guess is correct ");
		 break;
		}
		else
			System.out.println("sorry it was:"+rno);
		}
	      System.out.println("i have taken"+count+"chance");
	    

	}

}
