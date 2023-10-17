package Figuras;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testeFiguras {

	@Test
	public void testTriangulo() {
		Triangulo t = new Triangulo(10, 10);
		assertFalse(t.getBase()<0);
		assertFalse(t.getAltura()<0);
		int tt = t.calcularArea();
		assertEquals(50,tt);
		t.setAltura(20);
		int tnew = t.calcularArea();
		assertEquals(100, tnew);
		
		
	}
	
	@Test
	public void testQuadrado() {
		Quadrado q = new Quadrado(14);
		assertTrue(q.calculaArea()==196);
		
		q.setLado(30);
		assertTrue(q.calculaArea()==900);
		
		assertTrue(q.getLado()!=0);
		
	}
	
	@Test
	public void testRetangulo() {
		Retangulo r = new Retangulo(15,15);
		assertTrue(r.calcularArea()==225);
		
		r.setBase(-60);
		assertTrue(r.getBase()<0);
		
		assertTrue(r.calcularArea()==-900);
		
		
	}

}
