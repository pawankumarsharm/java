package jspider;

public class amcatpattern5 {

	public static void main(String[] args) {
int n=5,a=0;
for(int i=n;i>=1;i--)
{
a=(i*(i-1))/2+1;
for(int j=1;j<i;j++)
{
System.out.print((a++)+"*");
}
System.out.println(a++);
}
	}

}
