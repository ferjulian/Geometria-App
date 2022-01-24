package junit_test;

import static org.junit.Assert.*;
import edu.uno.ar.geometria.*;

import org.junit.Before;
import org.junit.Test;

public class ElipseTest {

	Elipse elipse1;
	Punto punto1 = new Punto(7.0,9.0);
	
	@Before
	public void setUp() throws Exception {
		
		
		elipse1 = new Elipse(5.0, 4.0, punto1);
	}

	@Test
	public void creandoElipse() {
		assertNotNull(elipse1);
	}
	
	@Test (expected = InvalidRadioException.class)
	public void exceptionRadioTest() {
		elipse1 = new Elipse(-5.0, -4.0, punto1);
	}
	
	
	@Test
	public void calcularAreaTest() {
		double esperado = 62.83;
		double obtenido = elipse1.calcularArea();
		
		assertEquals(esperado,obtenido, 0.01);
	}
	
	

}
