package Array2;

public class ArrayMain {

	public static void main(String[] args) {
		arrayoperation ao=new arrayoperation();
		System.out.println("first array");
		int x[]=ao.readArr();
		System.out.println("second array");
		int y[]=ao.readArr();
		System.out.println("display first array");
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i]);
		}
		System.out.println();
		System.out.println("display second array");
		for (int i = 0; i < y.length; i++) {
			System.out.print(y[i]);
		}
		System.out.println();
		int c[]=ao.merge(x, y);
		System.out.println("after merge: ");
		ao.display(c);
	}

}
