package edu.uno.ar.geometria;

public class Punto {

	private double x;
	private double y;
	
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public void setPunto(double valor1, double valor2){
		x = valor1;
		y = valor2;
	}
	
	public double getPuntoX(){
		return  x;
	}
	
	public double getPuntoY(){
		return  y;
	}
}
