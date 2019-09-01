
public class MyName {

	public static void main(String[] args) {
		int n=13;
	    for(int i=1;i<n;i++)
	    {
	    	for(int j=1;j<=n/2;j++)
	    	
	    		if((j==0||i>=0||i==n/2||j==n/2&&i<=n/2))
	    		
	    			if(i==0 && j!=0 && j!=n/2||j==0 && i!=0 || j==n/2 && i!=0 || i==n/2)
                System.out.print("*");
	    			else
	    				System.out.println(" ");
	    		
	    		
	    	
	    
	    }	System.out.println();

	}

}
