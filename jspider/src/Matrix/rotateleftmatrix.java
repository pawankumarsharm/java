package Matrix;

public class rotateleftmatrix {
	static void rotatematrixanticlkwise(int n,int mat[][])
	{
		for (int i = 0; i < n/2; i++)
		{
			for (int j = 1; j <n-i-1; j++)
			{
				 int t=mat[i][j];
				 mat[i][j]=mat[j][n-1-j];
				 mat[j][n-1-i]=mat[n-1-i][n-1-j];
				 mat[n-1-i][n-1-j]=mat[n-1-j][i];
				 mat[n-1-j][i]=t;
			}
		}
	}
	static void displayMatrix(int n,int mat[][])
	{
		for(int i=0;i<n;i++)
		{
			for (int j = 0; j < n; j++) {
				System.out.println(""+mat[i][j]);
				//System.out.println("\n");
				//System.out.println("\n");
				
			}
		}
	}
	public static void main(String[] args) {
		int n=3;
		int mat[][]= {{2,3,5},{7,8,9},{1,4,6}};
		rotatematrixanticlkwise(n,mat);
		displayMatrix(n,mat);
	}

}
