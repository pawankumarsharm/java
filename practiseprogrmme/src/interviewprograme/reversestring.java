package interviewprograme;

public class reversestring {

	public static void main(String[] args) {
	String s="pawan";
	String s1="";
	for (int i = s.length()-1; i >=0; i--) {
		s1=s1+s.charAt(i);
		
	}
	System.out.print(s1);
	}

}
