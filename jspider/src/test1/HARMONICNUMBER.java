package test1;

public class HARMONICNUMBER {
	static double nthHarmonic(int N) 
	{ 
	    float harmonic = 1; //H1
	    for (int i = 2; i <= N; i++) { // Hn = H1 + H2 + H3 ... + Hn-1 + Hn-1 + 1/n 
	        harmonic += (float)1 / i; 
	    } 
	    return harmonic; 
	} 
	    public static void main (String[] args) { 
	            int N = 8; 
	    System.out.print(nthHarmonic(N)); 
	      
	    } 
	} 

