
public class patternmatching {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
	    for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
		}
		System.out.println("-------------------------------");
		
		for(int i=1;i<=5;i++)
		{
	    for(int j=5;j>=i;j--)
		{
			System.out.print("*");
		}
		System.out.println();	
		}
		
	for(int i=1;i<=5;i++)
		{
	    for(int j=1;j<=i;j++)
		{
			System.out.print(j);
		}
		System.out.println();			
		}
		
int k;
for(int i=1;i<=5;i++)
{
	k=i;

for(int j=1;j<=i;j++)
{
	System.out.print(k);
	k=k-1;
}
System.out.println();	
}
		
		/*for(int i=1;i<=5;i++)
		{
	    for(int j=1;j<=i;j++)
		{
			System.out.print(i);
		}
		System.out.println();	
		}*/
		
	    
		/*int counter=1;
		for(int i=1;i<=5;i++)
		{
	    for(int j=1;j<=i;j+=1)
		{
			System.out.print(counter);
			counter++;
		}
		System.out.println();	
		}*/
		
		for(char i='a';i<='d';i++)
		{
	    for(char j='a';j<=i;j++)
		{
			System.out.print(j);
		}
		System.out.println();			
	}
		
		/*for(int i=1;i<=5;i++)
		{
	    for(int j=1;j<=i;j++)
		{
	    	if(i+j>4) 
	    	{
			System.out.print("*");
		    }
	    	else
	    	{
	    		System.out.println(" ");
	    	}
		System.out.println();	
	}}*/
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+ "my name is pawan");
		
		 
		}
		{
			System.out.println();
		}
		
		for(int i=5;i>=1;i--)
		{
	    for(int j=1;j<=i;j++)
		{
	    	System.out.println(" *");
	    	
			System.out.print(" ");
		}
		System.out.println();	
		}
		
		for(int i=1;i<=5;i++)
		{
	    for(int j=1;j<=i;j++)
	    	for(int l=5;l>=j;l--)
		{
			System.out.print("*");
		}
		System.out.println();
		}
		


for(int i=1;i<=5;i++)
{
for(int j=1;j<=5;j++)
{
	System.out.print(j);
}
System.out.println();	
}
}
}