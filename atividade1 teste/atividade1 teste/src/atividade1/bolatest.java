package atividade1;

import junit.framework.TestCase;

public class bolatest extends TestCase{
	
	public void testbola() {
		bola bola1 = new bola("vermelha");
		assertTrue(bola1.getCor()=="vermelha");
		
	
		
	}
	
	public void testsetCor() {
		bola bola2 = new bola("vermelha");
		bola2.setCor("branca");
		assertTrue(bola2.getCor()=="branca");
	}
	
	public void testgetCor() {
		bola bola1 = new bola("azul");
		assertTrue(bola1.getCor()=="azul");
		
	}
	
	

}
