package Recursion;

public class lcm {
 static int lcm(int a,int b)
{
	int ma=a,mb=b;
	while(ma!=mb)
	{
		if(ma<mb)
		{
			ma=ma+a;
		}
		else {
			mb=mb+b;
		}
		return ma;
	}
	return mb;
		
}
	public static void main(String[] args) {
		int p=lcm(6,9);
		System.out.println(p);
	}

}
