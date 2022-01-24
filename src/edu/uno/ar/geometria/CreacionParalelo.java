package edu.uno.ar.geometria;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CreacionParalelo {

	public static void main(String[] args) throws IOException {
		
		try {
			 
			FileReader input = new FileReader("files/input.csv");
			BufferedReader bInput = new BufferedReader(input);
			String linea;
			
			Triangulo triangulo1 = null;
			Segmento segmento1 = null;
			MetodoParalelo paralelos = new MetodoParalelo();
			
			linea = bInput.readLine();
			
			while(linea != null) {
				
				String[] datos;
				datos = linea.split(",");
				
				if(datos[0].equals("TRIANGULO") && datos.length == 7) {
					
					triangulo1 = paralelos.armarTriangulo(datos);
					paralelos.procesarTriangulo(triangulo1);
					
				}
				
				if(datos[0].equals("SEGMENTO") && datos.length == 5) {
					
					segmento1 = paralelos.armarSegmento(datos);
					paralelos.procesarSegmento(segmento1);
				}
					
				linea = bInput.readLine();
			}
			
			bInput.close();
			
			
			FileWriter archivo = new FileWriter("files/paralelos.out");
			PrintWriter salida = new PrintWriter(archivo);
			
			for(Triangulo triangulo : paralelos.arrayTriangulos()) {
				salida.println(triangulo);
				}
			
			for(Segmento segmento : paralelos.arraySegmentos()) {
				salida.println(segmento);
			}
			
			salida.close();
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
