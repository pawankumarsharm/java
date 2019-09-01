package Recursion;

public class palindrome {
	static boolean ispalindrome(String st,int i,int l)
	{
		if(i>=l)
			return true;
		
		if(st.charAt(i)!=st.charAt(l)) 
		return false;
		
		return ispalindrome(st,i+1,l-1);
	}
	public static void main(String[] args) {
		
		//palindrome pl=new palindrome();
		String st="malayalam";
		boolean rs=ispalindrome(st, 0, st.length()-1);
		
				
			if(rs)
				System.out.println("String is palindrome");
			else
				System.out.println("String is not palindrome");
				
	}

}
