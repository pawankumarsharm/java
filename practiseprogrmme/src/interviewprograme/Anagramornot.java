package interviewprograme;

import java.util.Arrays;

public class Anagramornot {

	public static void main(String[] args) {
		String s1="dormitory";
		String s2="dirtyroom";
		if(s1.length()==s2.length()){
			 
			char ar1[]=s1.toCharArray();
			Arrays.sort(ar1);
			System.out.println(Arrays.toString(ar1));
			
			char ar2[]=s2.toCharArray();
			Arrays.sort(ar2);
			System.out.println(Arrays.toString(ar2));
			System.out.println(Arrays.equals(ar1, ar2));
			
			if(ar1.equals(ar2))
			{
				System.out.println("anagram");
			}
			else
			{
				System.out.println("not anagram");
			}
			
		}
		
	}

}
