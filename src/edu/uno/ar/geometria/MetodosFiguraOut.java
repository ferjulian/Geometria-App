package edu.uno.ar.geometria;

import java.util.ArrayList;

public class MetodosFiguraOut {
	
	ArrayList<Elipse> arrElipses = new ArrayList<Elipse>();
	ArrayList<Circulo> arrCirculos = new ArrayList<Circulo>();
	ArrayList<Cuadrado> arrCuadrados = new ArrayList<Cuadrado>();
	ArrayList<Rectangulo> arrRectangulos = new ArrayList<Rectangulo>();
	ArrayList<Triangulo> arrTriangulos = new ArrayList<Triangulo>();
	
	public void agruparFiguras(String[] datos) {
		
		
		
		try {
			
			
			//Paso los datos a variables para armar las figuras
			
			double double1 = Double.parseDouble(datos[1]);
			double double2 = Double.parseDouble(datos[2]);
			double double3 = Double.parseDouble(datos[3]);
			
			
			
			
			if ( "CIRCULO".equals(datos[0]) && datos.length == 4 ) {	
				
				Circulo circulo1 = new Circulo(double1, double1, new Punto(double2,double3));
				
				arrCirculos.add(circulo1);
				
			}
			
			if ( "ELIPSE".equals(datos[0]) && datos.length == 5 ) {
				
				double double4 = Double.parseDouble(datos[4]);
				
				Elipse elipse1 = new Elipse(double1, double2, new Punto(double3,double4));
				
				arrElipses.add(elipse1);
			}
			
			
			if ( "RECTANGULO".equals(datos[0]) && datos.length == 5 ) {
				
				double double4 = Double.parseDouble(datos[4]);
				
				Rectangulo rectangulo1 = new Rectangulo(new Punto(double1,double2), new Punto(double3,double4));
				
				arrRectangulos.add(rectangulo1);
			}
			
			
			if ( "CUADRADO".equals(datos[0]) && datos.length == 4 ) {
				
				
				Cuadrado cuadrado1 = new Cuadrado(double1,new Punto(double2,double3));
				
				arrCuadrados.add(cuadrado1);
				
				}
			
			
			if ( "TRIANGULO".equals(datos[0]) && datos.length == 7 ) {
				
				double double4 = Double.parseDouble(datos[4]);
				double double5 = Double.parseDouble(datos[5]);
				double double6 = Double.parseDouble(datos[6]);
				
				
				
				Triangulo triangulo1 = new Triangulo(new Punto(double1,double2), new Punto(double3,double4), new Punto(double5,double6));
				
				arrTriangulos.add(triangulo1);
				
				}
			
		}
		
		catch(InvalidCuadradoException ex) {
			System.out.println(ex.getMessage());
		
		}
		catch(InvalidRadioException ex) {
			System.out.println(ex.getMessage());
		
		}
		catch(NumberFormatException ex) {
			System.out.println("Error: " + "Formato de numero invalido");
		
		}
		
		

		
	}

}
