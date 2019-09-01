package Array2;

public class ArrayMain4 {

	public static void main(String[] args) {
		arrayoperation ao=new arrayoperation();
		System.out.println("read array");
		int x[]=ao.readArr();
		int rs=(int) ao.reverse(x);
		System.out.println(rs);
	}

}
