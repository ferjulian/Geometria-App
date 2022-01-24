package edu.uno.ar.geometria;

public class Cuadrado extends Figura{
 
	private double lado;
	private double areaCuadrado;
	private Punto izq;

	
	/////constructor/////////////////////////
	public Cuadrado( double lado, Punto izq ) { 
		
		if (lado==0 || lado <0) { 
			
			throw new InvalidCuadradoException("La figura CUADRADO no puede tener un lado igual a 0 o negativo");
		
		} else {
		 
			this.lado = lado;
			this.izq = izq;
		}
		
		
	}
	
	////getters///////////////////////////////
	public double getLado() {
		return lado;
	}

	public double getAreaCuadrado() {
		return areaCuadrado;
	}

	public Punto getIzq() {
		return izq;
	}

	
	//////metodo area////////////////////////////////
	public double calcularArea() {
		
		 return areaCuadrado = (lado*lado);
	
	}
	
	
	
	
	///////desplazo con un solo punto///////////////////////////
	public void desplazarFigura(double x, double y) {
		
		izq.setPunto(x,y);

	}
	

	////para imprimir en el archivo//////
	@Override
	public String toString() {
		return "CUADRADO," + lado + "," + izq.getPuntoX() + "," + izq.getPuntoY();
	}

	
	/////comparo distintas areas usando interface////////////////
	@Override
	public int compareTo(Figura areas) {
		return Double.compare(areas.calcularArea(), this.calcularArea());
	}

	
	
	
	

	
	
	

	

	

	
}


