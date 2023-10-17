package Figuras;

public class Triangulo {
	private int altura;
	private int base;
	
	public Triangulo(int altura, int base) {
		super();
		this.altura = altura;
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}
	
	public int calcularArea() {
		int area = (this.altura*this.base)/2;
		return area;
	}
	
	
}


