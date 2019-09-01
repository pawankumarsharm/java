package jspider;

public class amcatpattern6 {

	public static void main(String[] args) {
int n=5,a=1,t=4,k=3;
	
	for(int i=1;i<=t;i++)
	{
	if(i%2!=0)
	{
	for(int j=1;j<(i-1);j++)
	{
	System.out.print((a++)+"*");
	}
	System.out.println(a++);
	}
	else
	{
	for(int j=1;j<k;j++)
	{
	System.out.print((t++)+"*");
	}
	System.out.println(t++);
	k++;
	}
	}
	}
}
