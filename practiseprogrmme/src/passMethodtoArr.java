
import java.util.*;

class passMethodtoArr {

	public static void main(String[] args) {
		/*StringBuilder s1=new StringBuilder();
		StringBuilder s2=new StringBuilder("palle");
		System.out.println(s1);
		System.out.println(s2);//palle
		System.out.println(s1.length());//0
		System.out.println(s1.capacity());//16
		System.out.println(s2.length());//5
		System.out.println(s2.capacity());//21
*/	
		/*StringBuilder s=new StringBuilder();
		s.append("pawan kumar");
		System.out.println(s);//pawan kumar
		System.out.println(s.capacity());//16
		s.append("java android");
		System.out.println(s);//pawan kumarjava android
		System.out.println(s.length());//23
		System.out.println(s.capacity());//34*/
		
		/*StringBuilder s=new StringBuilder("star");
		s.deleteCharAt(1);
		s.append("t");
		s.insert(0, "s");
		s.insert(4, "le");
		s.setCharAt(1,'k');
		System.out.println(s);//skarlet
		System.out.println(s.length());//7
		System.out.println(s.capacity());//20
*/	
		/*StringBuilder s=new StringBuilder();	
		s.append("sahrukh");
		s.insert("sahrukh".length(), "khan");
		s.insert(0,"amir");
		s.delete("amir".length(),s.indexOf("khan"));
		System.out.println(s);//amirkhan
		System.out.println(s.length());//8
		System.out.println(s.capacity());//16
*/	
		/*StringBuilder s=new StringBuilder();	
		s.append("abc");
		s.append(10);
		s.append(true);
		s.append(3.14);
		System.out.println(s);//abc10true3.14
		System.out.println(s.length());//13
*/		
		/*StringBuilder s=new StringBuilder();
		s.append("star");
		s.insert(4,"let");
		System.out.println(s.indexOf("tar"));//1
		System.out.println(s.substring(2));//arlet
		System.out.println(s.substring(1,4));//tar
*/		
	/*	String s1="palle";
		String s2=new String("palle");
		StringBuilder s3=new StringBuilder("palle");
		StringBuilder s4=new StringBuilder("palle");
		System.out.println(s1==s2);//false
		//System.out.println(s2==s3);//error
		System.out.println(s1.equals(s2));//true
		System.out.println(s3==s4);//false
		System.out.println(s3.equals(s4));//false
	    System.out.println(s3.toString().equals(s4.toString()));//true
	    String s=s3.toString();
	    String st=s4.toString();
	  //  System.out.println(s1.reverse());//error
	   // System.out.println(s2.reverse());//error
	    System.out.println(s1);//palle
	    System.out.println(s2);//palle
*/		
		/*StringBuilder sb=new StringBuilder();
		sb.append("<html><title>Palle </title><body><h1>Java and Android</h1></body></html>");
		int first=sb.indexOf("<");
		int last=sb.indexOf(">");
		while(true) {
			if(first==-1) {
				break;
			}
			sb.delete(first, last+1);
			first=sb.indexOf("<");
			last=sb.indexOf(">");
		}
		System.out.println(sb);
		*/
	}
}
