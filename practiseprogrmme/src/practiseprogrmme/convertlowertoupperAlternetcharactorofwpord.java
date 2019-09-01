package practiseprogrmme;

public class convertlowertoupperAlternetcharactorofwpord {

	public static void main(String[] args) {
		 String s="We are the worLD";
		    System.out.println(s);
		    int j=0;
		    String otherstring=null;
		    int length=s.length();
		    for (int i=0;i<length;i++){
		        j++;
		        char ch=s.charAt(i);
		        if(!Character.isAlphabetic(ch)){
		            j--;
		            otherstring+=ch;
		        }
		        if(j%2==0){
		            ch=Character.toLowerCase(ch);
		            otherstring+=ch;                
		        }else{
		            ch=Character.toUpperCase(ch);
		            otherstring+=ch;
		        }
		    }
		    System.out.println(otherstring.substring(4));
		}
	}


