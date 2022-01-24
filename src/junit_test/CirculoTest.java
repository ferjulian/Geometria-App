package junit_test;

import static org.junit.Assert.*;
import edu.uno.ar.geometria.*;

import org.junit.Before;
import org.junit.Test;

public class CirculoTest {

	Circulo circulo1;
	Punto punto1 = new Punto(7.0,9.0);
	
	@Before
	public void setUp() throws Exception {
		
		circulo1 = new Circulo(3.0,3.0,punto1);
	}

	@Test
	public void creandoCirculo() {
		assertNotNull(circulo1);
	}
	
	@Test (expected = InvalidRadioException.class)
	public void exceptionRadioTest() {
		circulo1 = new Circulo(0.0, 0.0, punto1);
	}
	
	@Test
	public void calcularAreaTest() {
		double esperado = 28.27;
		double obtenido = circulo1.calcularArea();
		
		assertEquals(esperado,obtenido, 0.01);
	}
	
	

}
