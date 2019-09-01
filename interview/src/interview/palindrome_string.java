package interview;

public class palindrome_string {

	public static void main(String[] args) {
		String st="malayalam";
		char ch[]=st.toCharArray();
		String rst=" ";
		for(int i=0; i<ch.length/2;i++)
		{
			char t=ch[i];
			ch[i]=ch[ch.length-1-i];
			ch[ch.length-1-i]=t;
		}
		rst=new String(ch);
		if(rst.equalsIgnoreCase(st))
			System.out.println(st +" is palindrome");
		else
			System.out.println(st  +" is not palindrome");
	}

}
