
public class Power {

	public static void main(String[] args) {
		int pw=pow(3,5);
		System.out.println(pw);
	}
		static int pow(int n,int p)
		{
			int pro=1;
					while(p>0)
					{
					pro=pro*n;
					p--;
					}
					return pro;
		}
		

	}


