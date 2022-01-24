package edu.uno.ar.geometria;



public class Segmento implements Comparable<Segmento> {

	private Punto punto1, punto2;

//Constructor
	public Segmento(Punto punto1, Punto punto2) {
		
		if(CompararDouble.sonIguales(punto1.getPuntoX(),punto2.getPuntoX()) && CompararDouble.sonIguales(punto1.getPuntoY(),punto2.getPuntoY())){
			
			throw new InvalidSegmentoException("Error: El segmento no puede tener los mismos puntos de extremos");
		}{
			
			this.punto1 = punto1;
			this.punto2 = punto2;
			
		}
		
		
	}

//Metodos

	public double Longitud() {
		double ct1 = punto2.getPuntoX() - punto1.getPuntoX();
		double ct2 = punto2.getPuntoY() - punto1.getPuntoY();
		double hip = Math.sqrt(ct1 * ct1 + ct2 * ct2);
		return hip;
	}

	@Override
	public String toString() {
		return "SEGMENTO," + punto1.getPuntoX() + "," + punto1.getPuntoY() + "," + punto2.getPuntoX() + "," + punto2.getPuntoY();
	}
	

	@Override
	public int compareTo(Segmento o) {
		return Double.compare(o.Longitud(), this.Longitud());
	}
	
	
	public boolean segmentosParalelos(Segmento seg1, Segmento seg2) {
		
		Punto segA = new Punto(seg1.punto2.getPuntoX() - seg1.punto1.getPuntoX(), seg1.punto2.getPuntoY() - seg1.punto1.getPuntoY());
		Punto segB = new Punto(seg2.punto2.getPuntoX() - seg2.punto1.getPuntoX(), seg2.punto2.getPuntoY() - seg2.punto1.getPuntoY());
		
		Double cta1 = segA.getPuntoX() / segB.getPuntoX();
		Double cta2 = segA.getPuntoY() / segB.getPuntoY();
		
		
		 return CompararDouble.sonIguales(cta1, cta2);
	}

	
    public boolean paraleloEjeX(){
    	
    	return CompararDouble.sonIguales(punto1.getPuntoY(),punto2.getPuntoY());
    }
    
    
    public boolean paraleloEjeY(){
    	
    	return CompararDouble.sonIguales(punto1.getPuntoX(),punto2.getPuntoX());
    }
}
