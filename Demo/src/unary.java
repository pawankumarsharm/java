
public class unary {

	public static void main(String[] args) {
		int i=10,j=10,k=10,l=10;
		System.out.println(++i);
		System.out.println(i);
		System.out.println(j++);
		System.out.println(j);
		System.out.println(--k);
		System.out.println(k);
		System.out.println(l--);
		System.out.println(l);
		int m=(++j)+(--i);
		System.out.println(m);
		int n=(k--)+(j++);
		System.out.println(n);
	}

}
