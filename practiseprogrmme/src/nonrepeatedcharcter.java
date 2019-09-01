
public class nonrepeatedcharcter {

	public static void main(String[] args) {
		 String s = "rishavavr";
	      for (char c : s.toCharArray()) {
	          if (s.indexOf(c) == s.lastIndexOf(c)) {
	              System.out.print(c+" ");
	              
	              
	          }
	      }
	}

}
