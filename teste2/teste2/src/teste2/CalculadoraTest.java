package teste2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class CalculadoraTest {
	
	@Test
	public void testsomar() {
		Calculadora c1 = new Calculadora ();
		assertTrue(c1.somar(10,10)==20);
		
	}
	@Test
	public void testsubtrair() {
		Calculadora c1 = new Calculadora ();
		assertTrue(c1.subtrair(10,10)==0);
		
	}
	@Test
	public void testmultiplicar() {
		Calculadora c1 = new Calculadora ();
		assertTrue(c1.multiplicar(10,10)==100);
		
	}
	@Test
	public void testdividir() {
		Calculadora c1 = new Calculadora ();
		assertTrue(c1.dividir(10,10)==1);
		
	}
}
