package teste4;

public class Pessoa {
	private int idade;
	private double peso;
	private double altura;
	
	public Pessoa(int idade, double peso, double altura ) {
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
		
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void emagrecer() {
		this.peso--;
	}
	
	public void engordar() {
		this.peso++;
	}
	
	public void aniversario() {
		this.idade++;
		if (this.idade < 21)
			this.altura +=0.015;
	}
	

}
