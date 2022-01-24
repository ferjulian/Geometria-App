package edu.uno.ar.geometria;

public class Rectangulo extends Figura{
	private Punto izq;
	private Punto der;
	private double areaRectangulo;

	
	///constructor///////////////////////
	public Rectangulo( Punto izq, Punto der ) {
		this.izq = izq;
		this.der = der;
		
	}

	
	///getters//////////////////////////////
	public double getAreaRectangulo() {
		return areaRectangulo;
	}
	
	public Punto getIzq() { 
		return izq;
	}

	public Punto getDer() {
		return der;
	}

	
	////metodo utilizando calse Punto////////////////////////////
	public double calcularArea() {
		return areaRectangulo = ( (izq.getPuntoX() - der.getPuntoX()) * (izq.getPuntoY() - der.getPuntoY()) );
	
	}

	
	
	///////////desplazo utilizando dos pares de Puntos/////////////
	public void desplazarFigura(double x, double y) {
		izq.setPunto(izq.getPuntoX() + x,izq.getPuntoY() + y);
		der.setPunto(der.getPuntoX() + x,der.getPuntoY() + y);
	}
	
	
	////para imprimir en archivo//////
	@Override
	public String toString() {
		return "RECTANGULO," + izq.getPuntoX() + "," + izq.getPuntoY() + "," + der.getPuntoX() + ',' + der.getPuntoY();
	}

	
	/////comparo areas usando interface////////////////////
	@Override
	public int compareTo(Figura areas) {
		return Double.compare(areas.calcularArea(), this.calcularArea());
	}



	
}
