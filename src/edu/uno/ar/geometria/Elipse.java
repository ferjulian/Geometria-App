package edu.uno.ar.geometria;
import java.lang.Math; 

public class Elipse extends Figura{
	
	public Punto centro;
	protected double radio1;
	protected double radio2;
	
	public Elipse(double radio1, double radio2, Punto centro){
		
		if(radio1 <= 0 || radio2 <=0) {
			
			throw new InvalidRadioException("El radio no puede ser igual o menor a 0");
		}
		
		this.centro = centro;
		this.radio1 = radio1;
		this.radio2 = radio2;
	}
	
	
	public double calcularArea() {
		double area;
		
		area = radio1 * radio2 * Math.PI; 
		
		return area;
	}
	
	
	
	public void desplazarFigura(double x, double y) {
		
		centro.setPunto(x,y);
	}
	
	@Override
	  public String toString() {
	    return "ELIPSE,"+ radio1 + "," + radio2 + ","+ centro.getPuntoX() + "," + centro.getPuntoY();
	  }


	@Override
	public int compareTo(Figura o) {
		// TODO Auto-generated method stub
		return Double.compare(o.calcularArea(), this.calcularArea());
	}


}
