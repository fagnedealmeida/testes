package atividade1;

import junit.framework.*;

public class calculadoratest extends TestCase{
	
	public void testsomar() {
		calculadora c1 = new calculadora ();
		assertTrue(c1.somar(10,10)==20);
		
	}
	
	public void testsubtrair() {
		calculadora c1 = new calculadora ();
		assertTrue(c1.subtrair(10,10)==0);
		
	}
	
	public void testmultiplicar() {
		calculadora c1 = new calculadora ();
		assertTrue(c1.multiplicar(10,10)==100);
		
	}
	
	public void testdividir() {
		calculadora c1 = new calculadora ();
		assertTrue(c1.dividir(10,10)==1);
		
	}

}
