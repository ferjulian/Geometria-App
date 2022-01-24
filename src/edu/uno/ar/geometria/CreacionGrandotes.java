package edu.uno.ar.geometria;
import java.io.*;

public class CreacionGrandotes {
	
	public static void main(String args[]) throws IOException{
		
		try{
			FileReader input = new FileReader("files/input.csv");
			BufferedReader bufInput = new BufferedReader(input);
			
			String line;
			Figura figura1 = null;
			Segmento segmento1 = null;
			MetodosGrandotes grandotes = new MetodosGrandotes();
			
			
			line = bufInput.readLine();
			
			while(line != null){
				String [] datos; 
				
				datos = line.split(",");
				
				
				if (datos[0].equals("SEGMENTO") && datos.length == 5) {
					
					segmento1 = grandotes.armarSegmento(datos);
					grandotes.procesarSegmento(segmento1);
					
				} else {
					
					figura1 = grandotes.armarFigura(datos);
					grandotes.procesarFigura(figura1);
				}
				
				
		
				
				
				
				line = bufInput.readLine();
								
			
			}
			
			
			bufInput.close();
			
			//Escribir Archivo Grandotes.out
			
			FileWriter archivo = new FileWriter("files/Grandotes.out");
			PrintWriter salida = new PrintWriter(archivo);  
			  
			for(Figura figura : grandotes.arrayFiguras()){
				salida.print(figura + "\n");
			}
			
			for(Segmento segmento : grandotes.arraySegmentos()){
				salida.print(segmento + "\n");
			}
			
				
			salida.close();
			
			
		} catch (IOException e){
			e.printStackTrace();
		}
		
		
		
	}

}
