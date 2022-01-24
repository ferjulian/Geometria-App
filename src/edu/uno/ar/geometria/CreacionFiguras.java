package edu.uno.ar.geometria;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;


public class CreacionFiguras {

public static void main(String args[]) throws IOException{
		
		try{
			FileReader input = new FileReader("files/input.csv");
			BufferedReader bufInput = new BufferedReader(input);
			
			String line;
			
			MetodosFiguraOut figuraOut = new MetodosFiguraOut();
			
			line = bufInput.readLine();
			
			while(line != null){
				String [] datos; 
				
				datos = line.split(",");
				
				figuraOut.agruparFiguras(datos);			
					
				
				line = bufInput.readLine();
								
			
			}
			
			
			bufInput.close();
			
			
			Collections.sort(figuraOut.arrCirculos);
			Collections.sort(figuraOut.arrElipses);
			Collections.sort(figuraOut.arrCuadrados);
			Collections.sort(figuraOut.arrRectangulos);
			Collections.sort(figuraOut.arrTriangulos);
			
			FileWriter archivo = new FileWriter("files/figuras.out");
			PrintWriter salida = new PrintWriter(archivo);  
			  
			salida.print("\n" + "Circulos" + "\n" + "\n");
			
			for(Circulo circulo : figuraOut.arrCirculos ){
				
				salida.print(circulo + "\n");
			}
			
			 salida.print( "\n" + "Elipses" + "\n" + "\n");
			
			for(Elipse Elipse : figuraOut.arrElipses ){
				
			   
			    salida.print(Elipse + "\n");
			}

			
			 salida.print("\n" + "Rectangulos" + "\n" + "\n");
			
			for(Rectangulo Rectangulo : figuraOut.arrRectangulos ){
							
			   
			    salida.print(Rectangulo + "\n");
			}
			
			 salida.print( "\n" + "Cuadrados" + "\n" + "\n");

			for(Cuadrado Cuadrado : figuraOut.arrCuadrados ){
							
			   
			    salida.print(Cuadrado + "\n");
			}
			
			salida.print("\n" + "Triangulos" + "\n" + "\n");

			for(Triangulo Triangulo : figuraOut.arrTriangulos ){
							
			    
			    salida.print(Triangulo + "\n");
			}
		
			
				
			salida.close();
			
			
		} catch (IOException e){
			e.printStackTrace();
		}
		
		
		
	}
	
}
