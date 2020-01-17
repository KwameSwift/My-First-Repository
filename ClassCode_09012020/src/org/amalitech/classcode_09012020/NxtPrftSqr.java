package org.amalitech.classcode_09012020;

public class NxtPrftSqr {
	  
	//Main program
	public static void main(String args[]) 
	{		
		System.out.printf ("findNextSquare(%d) --> returns %d%n", 121, nextPerfectSquare(121) );
		System.out.printf ("findNextSquare(%d) --> returns %d%n", 625, nextPerfectSquare(625) );
    	System.out.printf ("findNextSquare(%d) --> returns %d since  %d is not a perfect", 114,nextPerfectSquare(114), 114 );
    }
	
		// Function to find the next perfect square 
		public static int nextPerfectSquare(int num)
		{ 	
		       double sqr = Math.sqrt(num);
		    
		        int y = (int) sqr;
		    
		    if(sqr== y) {
		    	
		        int z = (int) (sqr+1);
		        int w = z*z;
		        
		        return w;
		    }
		        else {
		        	
		        	return -1;
		        	}
		        }
		   
	} 