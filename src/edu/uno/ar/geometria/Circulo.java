package edu.uno.ar.geometria;

public class Circulo extends Elipse{

	public Circulo(double radio1, double radio2, Punto centro) {
		super(radio1, radio2,centro);
		
	}
	
	@Override
	  public String toString() {
	    return "CIRCULO,"+ radio1 + "," + radio2 + ","+ centro.getPuntoX() + "," + centro.getPuntoY();
	  }

}
