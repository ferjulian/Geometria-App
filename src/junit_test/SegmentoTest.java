package junit_test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import edu.uno.ar.geometria.*;

public class SegmentoTest {
 
	Segmento segmento1;
	Punto punto1 = new Punto(7.0,9.0);
	Punto punto2 = new Punto(3.0,6.0);
	
	@Before
	public void setUp() throws Exception {
	
		segmento1 = new Segmento(punto1, punto2);
	
	}

	@Test
	public void creandoSegmento() {
		assertNotNull(segmento1);
	}
	
	@Test (expected = InvalidSegmentoException.class)
	public void exceptionRadioTest() {
		
		Punto punto1 = new Punto(7.0,9.0);
		Punto punto2 = new Punto(7.0,9.0);
		
		segmento1 = new Segmento(punto1, punto2);
	}
	
	@Test
	public void LongitudTest() {
		double esperado = 5.0;
		double obtenido = segmento1.Longitud();
		
		assertEquals(esperado,obtenido, 0.01);
	}
	
	@Test
	public void segmentosParalelosTest() {
		
		Punto punto1 = new Punto(2.0,1.0);
		Punto punto2 = new Punto(4.0,5.0);
		Punto punto3 = new Punto(6.0, 2.0);
		Punto punto4 = new Punto(7.0, 4.0);
		
		segmento1 = new Segmento(punto1, punto2);
		Segmento segmento2 = new Segmento(punto3, punto4);
		
		boolean obtenido = segmento1.segmentosParalelos(segmento1, segmento2);
		
		assertTrue(obtenido);
	}
	
	
	@Test
	public void paraleloEjeXTest() {
		
		Punto punto1 = new Punto(2.0,3.0);
		Punto punto2 = new Punto(4.0,3.0);
		
		Segmento segmentoA = new Segmento(punto1, punto2);
	
		boolean obtenido = segmentoA.paraleloEjeX();
		
		assertTrue(obtenido);
	}
	
	
	@Test
	public void paraleloEjeYTest() {
		
		Punto punto1 = new Punto(2.0,3.0);
		Punto punto2 = new Punto(2.0,6.0);
		
		Segmento segmentoA = new Segmento(punto1, punto2);
	
		boolean obtenido = segmentoA.paraleloEjeY();
		
		assertTrue(obtenido);
	}
	
	

}
