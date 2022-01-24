package junit_test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.uno.ar.geometria.*;

public class RectanguloTest {

	@Test
	
	public void creandoRectangulo() {
		Rectangulo rectangulo = new Rectangulo( new Punto (7.0 , 7.0) , new Punto(2.0 , 3.0));
		assertNotNull(rectangulo);
	}

	public void calculandoAreaRectangulo() {
		Rectangulo rectangulo = new Rectangulo (new Punto (7.0 , 7.0), new Punto(2.0 , 3.0));
		double espero = 20;
		double obtengo = rectangulo.calcularArea();
		assertEquals(espero,obtengo, 20.0);
	}
}
