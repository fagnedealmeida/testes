package teste3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContaTest {

	@Test
	public void testConta() {
		Conta c1 = new Conta("Fagne de almeida","2469-4", 10.0);
		assertTrue(c1.getNomeCorrentista()=="Fagne de almeida");
		assertTrue(c1.getNomeCorrentista()!="");
		assertTrue(c1.getNumero()=="2469-4");
		assertTrue(c1.getNumero()!="");
		assertTrue(c1.getSaldo()>=0.0);
		assertTrue(c1.getSaldo()==10.0);
		c1.setSaldo(100.0);
		c1.setNomeCorrentista("Fagne");
		c1.setNumero("003");
		assertTrue(c1.getSaldo()==100.0);
		assertTrue(c1.getNomeCorrentista()=="Fagne");
		assertTrue(c1.getNumero()=="003");
				
	}
	
	
	@Test
	public void testSacar() {
		Conta c2 = new Conta("Fagne de Almeida","2469-4", 150.0);
		c2.sacar(100.0);
		assertTrue(c2.getSaldo()==50.0);
		c2.sacar(50.0);
		double saque = c2.getSaldo();
		assertEquals(0.0, saque);
	}
	
	@Test
	public void testDepositar(){
		Conta c3 = new Conta("IFPB","0001",0.0);
		c3.depositar(1000.0);
		double saldo = c3.getSaldo();
		assertEquals(1000.0, saldo);
		c3.depositar(500.0);
		double s = c3.getSaldo();
		assertEquals(1500.0, s);
		
		
	}
	

}
