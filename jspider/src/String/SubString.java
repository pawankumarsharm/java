package String;

public class SubString {
	static boolean isSubStr(String s1,String s2)
	{
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		for(int i=0;i<c1.length;i++)
		{
			int j=0,k=1;
			while(k<c1.length&&j<c2.length&&c1[k]==c2[j])
			{
				k++;
				j++;
			}
			if(j==c2.length)
				return true;
		}
		return false;
		
	}
	public static void main(String[] args) {
		String s1="ChitraDurga is a fort city";
		String s2="Durga";
		boolean rs=isSubStr(s1,s2);
		if(rs)
			System.out.println("yes it is present");
		else
			System.out.println("it is not present");
	}

}
