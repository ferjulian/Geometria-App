package junit_test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.uno.ar.geometria.*;

public class TrianguloTest {

	@Test
	public void creoFiguraTriangulo() {
		Triangulo t1 = new Triangulo(new Punto(3,4),new Punto(4,6),new Punto(2,2));
		assertNotNull(t1);
	}
	
	public void consultarAreaTriangulo() {
		Triangulo t1 = new Triangulo(new Punto(-1,0), new Punto(-1,-3), new Punto(0,-7));
		double esperado = 0;
		double obtenido = t1.calcularArea();
		assertEquals(esperado,obtenido, 0.0);
	}
	
	
	@Test
	public void TparaleloXTest() {
		Triangulo t1 = new Triangulo(new Punto(3,6),new Punto(4,6),new Punto(2,2));
		assertTrue(t1.TparaleloX());
	}
	
	
	@Test
	public void TparaleloTYTest() {
		Triangulo t1 = new Triangulo(new Punto(4,4),new Punto(4,6),new Punto(2,2));
		assertTrue(t1.TparaleloY());
	}
	

}
