package Matrix;

import String.Add__two_matrix_element;

public class revdigonal {
	
	static int revdiagonal(int mat[][])
	{
		int t = 0;
		int db[]=new int[mat.length];
		
		for(int i=0;i<mat.length;i++)
		{
		
			for(int j=0;j<mat[i].length/2;j++)
			{
				if(i==j)
				{
				 t=mat[i][j];
				mat[i][j]=mat[mat.length-1-i][mat.length-1-j];
				mat[mat.length-1-i][mat.length-1-j]=t;
			    }
				if(i+j==mat.length-1)
				{
					 t=mat[i][j];
					mat[i][j]=mat[i][j];
					mat[i][j]=t;
					
					
				}
		}
			
		}
		return t;
	}
	public static void main(String[] args) {
		Add__two_matrix_element mt=new Add__two_matrix_element();
		int ar[][]= {{1,2,3},{4,5,6},{7,8,9}};
		mt.dispmat(ar);
		//revdigonal rev=new revdigonal();
		
		//int r=revdiagonal(ar);
		
			//System.out.println(r);
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++) {
				System.out.print(ar[j][i]);	
			}
			System.out.println();
		}
	}

}
