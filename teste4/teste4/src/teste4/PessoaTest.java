package teste4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class PessoaTest {

	@Test
	public void testPessoa() {
		Pessoa fagne = new Pessoa(18, 70.0, 1.80);
		assertTrue(fagne.getPeso()==70.0);
		assertTrue(fagne.getIdade()==18);
		assertTrue(fagne.getAltura()==1.80);
		assertTrue(fagne.getPeso()>0);
		assertTrue(fagne.getIdade()>0);
		assertTrue(fagne.getAltura()<=2.30);
		fagne.setIdade(27);
		int idadeFagne = fagne.getIdade();
		assertEquals(27, idadeFagne);
	
	}
	
	@Test
	public void testeEmagrecer() {
		Pessoa fagne = new Pessoa(26, 70.0, 1.80);
		fagne.emagrecer();
		double pesoFagne = fagne.getPeso();		
		assertEquals(69.0, pesoFagne);
		fagne.emagrecer();
		fagne.emagrecer();
		fagne.emagrecer();
		assertTrue(fagne.getPeso()==66.0);
		
	}
	@Test
	public void testeEngordar() {
		Pessoa fagne = new Pessoa(26, 70.0, 1.80);
		fagne.engordar();
		fagne.engordar();
		fagne.engordar();
		fagne.engordar();
		fagne.engordar();
		fagne.engordar();
		fagne.engordar();
		fagne.engordar();
		double peso = fagne.getPeso();
		assertEquals(78.0, peso);
	}
	
	@Test
	public void testeAniversario() {
		Pessoa fagne = new Pessoa(17, 70.0, 1.80);
		fagne.aniversario();
		fagne.aniversario();
		fagne.aniversario();
		int idade = fagne.getIdade();
		assertEquals(20, idade);
		assertTrue(fagne.getAltura()==1.8449999999999998);
		
		fagne.aniversario();
		int idadeFagne = fagne.getIdade();
		assertEquals(21, idadeFagne);
		
	}

}
