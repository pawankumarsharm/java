package jspider;

public class amcatpattern4 {

	public static void main(String[] args) {
		int n=5,a=1;
		for(int i=1;i<=n;i++)
		{
		for(int j=1;j<i;j++)
		{
		System.out.print((a++)+"*");
		}
		System.out.println(a++);
		}

	}

}
