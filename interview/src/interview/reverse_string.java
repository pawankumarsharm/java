package interview;

public class reverse_string {

	public static void main(String[] args) {
		String st="hi i am pawan";
		char ch[]=st.toCharArray();
		String rst=" ";
		for(int i=ch.length-1;i>=0;i--)
		{
			int k=i;
			while(i>=0 && ch[i]!=' ')
			{
				i--;
			}
			int j=i+1;
			while(j<=k)
			{
				rst=rst+ch[j];
				j++;
			}
			rst=rst+" ";
		}
			System.out.println("the reverse string is : " +rst);
		}
	}


