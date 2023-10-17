package teste3;

public class Conta {
	private String nomeCorrentista;
	private String numero;
	private double saldo;

	public Conta(String nomeCorrentista, String numero, double saldo) {
		this.nomeCorrentista = nomeCorrentista;
		this.numero = numero;
		this.saldo = saldo;
		
	}
	
	public String nomeCorrentista() {
		return nomeCorrentista;
	}
	
	public String numero() {
		return numero;
	}
	
	public double saldo() {
		return saldo;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void sacar (double valor) {
		if (this.saldo - valor < 0)
			throw new RuntimeException();
		this.saldo -= valor;
	}

	public String getNomeCorrentista() {
		return nomeCorrentista;
	}

	public void setNomeCorrentista(String nomeCorrentista) {
		this.nomeCorrentista = nomeCorrentista;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
