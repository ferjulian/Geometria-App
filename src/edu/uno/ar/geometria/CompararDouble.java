package edu.uno.ar.geometria;

public class CompararDouble {

	public static boolean sonIguales(double n1, double n2) {
		
		final double THRESHOLD = .0001;
		 
		 boolean result = Math.abs(n1 - n2) < THRESHOLD;
   	
   		return result;
		
	}
	

}
