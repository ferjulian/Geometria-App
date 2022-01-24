package edu.uno.ar.geometria;

import java.util.ArrayList;

public class MetodoParalelo {
	
	ArrayList<Triangulo> arrayT = new ArrayList<Triangulo>();
	ArrayList<Segmento> arrayS = new ArrayList<Segmento>();
	
	public Triangulo armarTriangulo(String[] datos) {
		Triangulo triangulo1 = null;
		
		try {
			
			double v1 = Double.parseDouble(datos[1]);
			double v2 = Double.parseDouble(datos[2]);
			double v3 = Double.parseDouble(datos[3]);
			double v4 = Double.parseDouble(datos[4]);
			double v5 = Double.parseDouble(datos[5]);
			double v6 = Double.parseDouble(datos[6]);
			
			
			triangulo1 = new Triangulo(new Punto (v1,v2), new Punto(v3,v4), new Punto(v5,v6));
			
			
		}
		catch(NumberFormatException ex) {
			System.out.println("Error: " + "Formato de numero invalido");
		}
		
		return triangulo1;
	}
	
	public Segmento armarSegmento(String[] datos) {
		Segmento segmento1 = null;
		
		try {
			double s1 = Double.parseDouble(datos[1]);
			double s2 = Double.parseDouble(datos[2]);
			double s3 = Double.parseDouble(datos[3]);
			double s4 = Double.parseDouble(datos[4]);
			
			segmento1 = new Segmento(new Punto(s1,s2), new Punto(s3,s4));
			
			
		}
		catch(InvalidSegmentoException ex) {
			System.out.println(ex.getMessage());
		}
		catch(NumberFormatException ex) {
			System.out.println("Error " + "Formato de numero invalido");
		}
		
		return segmento1;
	}
	
	public void procesarTriangulo(Triangulo Tentrada) {
		
		if(Tentrada != null ) {
			
			if(Tentrada.TparaleloX() || Tentrada.TparaleloY()){
				arrayT.add(Tentrada);
			}
			
		}
		
	}
	
	public void procesarSegmento(Segmento Sentrada) {
		
		if(Sentrada != null) {
			
			if(Sentrada.paraleloEjeX() || Sentrada.paraleloEjeY()) {
				
				arrayS.add(Sentrada);
			}
			
			
		}
	}
	
	public ArrayList<Triangulo> arrayTriangulos(){
		
		return arrayT;
	}
	
	public ArrayList<Segmento> arraySegmentos(){
		
		return arrayS;
	}
}
