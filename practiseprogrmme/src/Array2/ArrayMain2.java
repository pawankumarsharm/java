package Array2;

public class ArrayMain2 {

	public static void main(String[] args) {
		arrayoperation ao=new arrayoperation();
		System.out.println("read array");
		int x[]=ao.readArr();
		int a=ao.sumofArray(x);
		System.out.println(a);
		
		int h[]=ao.countEO(x);
		
		ao.display(h);
	}

}
