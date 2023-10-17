package teste1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class bolaTest {
	@Test
	public void testbola() {
		bola bola1 = new bola("vermelha");
		assertTrue(bola1.getCor()=="vermelha");
	}
	
	@Test
	public void testsetCor() {
		bola bola2 = new bola("vermelha");
		bola2.setCor("branca");
		assertTrue(bola2.getCor()=="branca");
	}
	
	@Test
	public void testgetCor() {
		bola bola1 = new bola("azul");
		assertTrue(bola1.getCor()=="azul");
		
	}
	

}
