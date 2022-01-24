package junit_test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.uno.ar.geometria.*;

public class CuadradoTest {

	@Test
	
	public void creandoCuadrado() {
		Cuadrado cuadrado = new Cuadrado( 6.0 , new Punto(2.0 , 3.0));
		assertNotNull(cuadrado);
	}
	public void testCalcularArea() {
		Cuadrado cuadrado = new Cuadrado ( 6.0 , new Punto(2.0 , 3.0));
		double espero = 36.0;
		double obtengo = cuadrado.calcularArea();
		assertEquals(espero,obtengo, 36.0);
	}
	
	@Test (expected = InvalidCuadradoException.class)
	public void exceptionCuadradoTest() {
		
		Punto punto1 = new Punto(7.0,9.0);
		
		Cuadrado cuadradoA = new Cuadrado(-10.0, punto1);
		
		cuadradoA.calcularArea();
	}

}
