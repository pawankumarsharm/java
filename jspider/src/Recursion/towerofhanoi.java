package Recursion;

public class towerofhanoi {
	static int towerhanoi(int n,char s,char t,char d)
	{
		if(n==1)
		{
			System.out.println(n+"move from "+s+" to "+d);
			return 0;
		}
			towerhanoi(n-1,s,d,t);
			System.out.println(n+"move from " +s+ " to "+d);
			towerhanoi(n-1,t,s,d);
			return 0;
		}
	
	public static void main(String[] args) {
		int i=towerhanoi(3,'s','t','d');
		System.out.println(i);
	}

}
