package jspider;

public class P28 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==4||(i==1&&j==3)||(i==2&&j==2)||(i==2&&j==4)||(i==3&&j==1)||(i==3&&j==5)||(i==5&&j==1)||(i==5&&j==5))
				
					System.out.print("*");
				
				
			}
		
			System.out.println();
		
		}
	}

}