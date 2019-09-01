package String;

public class CountSubString {
	static int countSubStr(String s1,String s2)
	{
		int count=0;
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
			count++;
			i=k;
		}
		return count;
		
	}
	public static void main(String[] args) {
		String s1="ChitraDurga is a fort city";
		String s2="Durga";
		int rs=countSubStr(s1,s2);
			System.out.println(s2+" is present in the string "+s1+" "+rs+"no. of times");
	}
}
