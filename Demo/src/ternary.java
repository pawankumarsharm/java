
public class ternary {

	public static void main(String[] args) {
		int i=5,j=7,k=22,m=10,l=36,c;
		c=((i>j)&&(i>k)&&(i>l)&&(i>m))?i:((j>k)&&(j>l))&&(j>m)?j:((k>l)&&(k>m))?k:((l>m)?l:m);
System.out.println("gerater no. is"+c);
	}

}
