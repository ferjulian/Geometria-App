package edu.uno.ar.geometria;
import java.util.ArrayList;


public class MetodosGrandotes {
	
	ArrayList<Figura> arrGrandotes = new ArrayList<Figura>();
	ArrayList<Segmento> arrSegmentos = new ArrayList<Segmento>();
	int aux = 0;
	int aux2 = 0;

	
public Figura armarFigura(String[] datos ) {
	
	Figura figura1 = null;
	

	try {
		
		
		//Paso los datos a variables para armar las figuras
		
		double double1 = Double.parseDouble(datos[1]);
		double double2 = Double.parseDouble(datos[2]);
		double double3 = Double.parseDouble(datos[3]);
		
		
		
		//Armo las figuras
		
		if ( "CIRCULO".equals(datos[0]) && datos.length == 4 ) {	
			
			figura1 = new Circulo(double1, double1, new Punto(double2,double3));
			
		}
		
		if ( "ELIPSE".equals(datos[0]) && datos.length == 5 ) {
			
			double double4 = Double.parseDouble(datos[4]);
			
			figura1 = new Elipse(double1, double2, new Punto(double3,double4));
			
			
		}
		
		
		if ( "RECTANGULO".equals(datos[0]) && datos.length == 5 ) {
			
			double double4 = Double.parseDouble(datos[4]);
			
			figura1 = new Rectangulo(new Punto(double1,double2), new Punto(double3,double4));
			
		}
		
		
		if ( "CUADRADO".equals(datos[0]) && datos.length == 4 ) {
			
			
			figura1 = new Cuadrado(double1,new Punto(double2,double3));
			
			
			}
		
		
		if ( "TRIANGULO".equals(datos[0]) && datos.length == 7 ) {
			
			double double4 = Double.parseDouble(datos[4]);
			double double5 = Double.parseDouble(datos[5]);
			double double6 = Double.parseDouble(datos[6]);
			
			
			
			figura1 = new Triangulo(new Punto(double1,double2), new Punto(double3,double4), new Punto(double5,double6));
			
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
	
	
	return figura1;
}	
	

public Segmento armarSegmento(String[] datos ) {
	
	Segmento segmento1 = null;
	
	
	try {
		
		double double1 = Double.parseDouble(datos[1]);
		double double2 = Double.parseDouble(datos[2]);
		double double3 = Double.parseDouble(datos[3]);
		double double4 = Double.parseDouble(datos[4]);
		
		segmento1 = new Segmento(new Punto(double1, double2), new Punto(double3, double4));
	}
	catch(InvalidSegmentoException ex) {
		System.out.println(ex.getMessage());
		
	}
	catch(NumberFormatException ex) {
		System.out.println("Error: " + "Formato de numero invalido");
		
		
	}
	
	
	
	return segmento1;
}



public void procesarFigura(Figura figuraEntrante) {
	
	if(figuraEntrante != null){
		
		if (aux == 0 ) {
			
			arrGrandotes.add(figuraEntrante);
			aux = 1;
			
		} else {
			
			if(arrGrandotes.get(0).calcularArea() < figuraEntrante.calcularArea()) {
				
				arrGrandotes.clear();
				arrGrandotes.add(figuraEntrante);
				
			} else if (arrGrandotes.get(0).calcularArea() == figuraEntrante.calcularArea()){
				
				arrGrandotes.add(figuraEntrante);
			}
			
		}
		
	}
	
	

}



public void procesarSegmento(Segmento segmentoEntrante) {
	
	if(segmentoEntrante != null) {
		
		if (aux2 == 0 ) {
			
			arrSegmentos.add(segmentoEntrante);
			aux2 = 1;
			
		} else {
			
			if(arrSegmentos.get(0).Longitud() < segmentoEntrante.Longitud()) {
				
				arrSegmentos.clear();
				arrSegmentos.add(segmentoEntrante);
				
			} else if (arrSegmentos.get(0).Longitud() == segmentoEntrante.Longitud()){
				
				arrSegmentos.add(segmentoEntrante);
			}
			
		}
		
	}
	
	
}


public ArrayList<Figura> arrayFiguras(){
	
	return arrGrandotes;
}


public ArrayList<Segmento> arraySegmentos(){
	
	return arrSegmentos;
}
	
}
