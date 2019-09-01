	import java.util.HashSet;

public class StriingProgrames {

	private static final int MAX_CHAR = 0;

	public static void main(String[] args) {
		/*String s="pawan kumar";
		String n=" ";
		for (int i = s.length()-1; i>=0; i--) {
			System.out.print(s.charAt(i));*///ramuk nawap
		
		
		/*String s="pawan kumar";
		String s1[]=s.split(" ");
		for(int i=s1[0].length()-1;i>=0;i--)
		{
			System.out.print(s1[0].charAt(i));//nawap
		}*/
		
		/*String s="pawan kumar";
		String s1[]=s.split(" ");
		for(int i=s1[1].length()-1;i>=0;i--)
		{
			System.out.print(s1[1].charAt(i));//ramuk
		}*/
		
		/*String s="pawan kumar";
		String str;
		str=s;
		System.out.println(str);*copy one string into another string*/
			
	
	/*String s="pawqabdnbcbvui";
	int count=0;
	String st[]=s.split(" ");
	for(int i=0;i<s.length();i++) {
	if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
	{
		count++;
	}
	}
	System.out.println(count);//count no. of vowels in this string
	}*/
		
		/*String s="hello i am pawan";
		int count=1;
		//String str[]=s.split(" ");
		for(int i=0;i<s.length();i++) {
				if(s.charAt(i)==' ') {
					count++;
			}
		}
		System.out.println(count);//count word in the string//4
			}*/
	//}
	String s1="palle";
	String s2=new String("palle");
	String s3="PALLE";
	System.out.println(s1==s2);//false
	System.out.println(s1==s3);//false
	System.out.println(s1.equals(s2));//true
	System.out.println(s1.equals(s3));//false
	System.out.println(s1.equalsIgnoreCase(s3));//true
	System.out.println(s2.equalsIgnoreCase(s3));//true
	
	System.out.println("------------------------------------------------");
	String s="skill gun";
	System.out.println(s.contains("kill"));//true
	System.out.println(s.contains("llg"));//false
	System.out.println(s.indexOf('i'));//2
	System.out.println(s.indexOf('z'));//-1
	//System.out.println(s.charAt(10));//indexoutofboundexception
	System.out.println(s.indexOf('u'));//7
	System.out.println(s.lastIndexOf('i'));//2
	System.out.println(s.lastIndexOf('k',5));//1
	
	System.out.println("---------------------------------------------------");
	String st="palle tech";
	System.out.println(st.indexOf('p'));//0
	System.out.println(st.indexOf("p"));//0
	System.out.println(st.indexOf("all"));//1
	System.out.println(st.lastIndexOf("tech"));//6
	System.out.println(st.indexOf("te",2));//6
	System.out.println(st.lastIndexOf("le",8));//3
	
	System.out.println("-----------------------------------------------------");
	String s4="pawan tech java android";
	int first=s4.indexOf("java");
	System.out.println(first);//11
	int last=s4.indexOf("a and");
	System.out.println(last);//14
	String ja="";
	for(int i=last;i>=first;i--) {
		ja+=s4.charAt(i);
	}
	System.out.println(s4.substring(0, first)+ja+s4.substring(last+1,s4.length()));//reverse java//avaj
	
	System.out.println("------------------------------------------------------");
	int f=s4.indexOf("tech");
	int l=s4.indexOf("h jav");
	String te="";
	for (int i = l; i >=f; i--) {
		te+=s4.charAt(i);
	}
	System.out.println(s4.substring(0,f)+te+s4.substring(l+1,s4.length()));//reverse tech//hcet
		
	System.out.println("---------------------------------------------------------");
	String si="palle tech java";
	String n=" ";
	String str[]=si.split(" ");
	for(int j=0;j<str.length;j++) {
	for (int i = str[j].length()-1; i>=0; i--) {
		n+=str[j].charAt(i);
	}
	n+=" ";
	}
	System.out.println(n);//reverse the string //ellap hcet avaj
	
	System.out.println("---------------------------------------------------------");
	String su="madam";
	String sp=" ";
	char ch[]=su.toCharArray();
	for (int i = 0; i < ch.length/2; i++) {
	char t=ch[i];
	ch[i]=ch[ch.length-1-i];
	ch[ch.length-1-i]=t;
	}
		sp=new String(ch);
		if(sp.equalsIgnoreCase(su))
			System.out.println(su+"is palindrome");
			else 
				System.out.println(su+"is not palindrome");
		
	System.out.println("--------------------------------------------------------------");
	
	 String str5="malayalam",str6="";
	 String temp="";
	 temp=str5;
	 for(int i=str5.length()-1;i>=0;i--) {
		 str6+=str5.charAt(i);
	 }
		if(str6.equals(temp)) {
			System.out.println("is palindrome");
		}
		else {
			System.out.println("is not palindrome");
		}
		
		System.out.println("--------------------------------------------------------------");
		String xtr="subhash kumar";
		HashSet<String> hash_Set = new HashSet<String>();
		
		for (int i = 0; i < xtr.length(); i++) {
			int c=0;
			for(int j=0;j<xtr.length();j++) {
				
				if(xtr.charAt(i)==xtr.charAt(j)) {
					c++;
				}
			}
		
			hash_Set.add(xtr.charAt(i)+" = "+c);
			
		}
		System.out.println(hash_Set);//no. of occurance of unique character
	}
		}
			
