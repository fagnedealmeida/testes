package teste4;

public class Principal {

	public static void main(String[] args) {
		Pessoa fagne = new Pessoa(10, 70.0, 1.80);
		System.out.println(fagne.getPeso());
		System.out.println(fagne.getIdade());
		System.out.println(fagne.getAltura());
		fagne.emagrecer();
		System.out.println(fagne.getPeso());
		fagne.engordar();
		fagne.engordar();
		fagne.engordar();
		fagne.engordar();
		fagne.engordar();
		fagne.engordar();
		fagne.engordar();
		fagne.engordar();
		System.out.println(fagne.getPeso());
		fagne.aniversario();
		fagne.aniversario();
		fagne.aniversario();
		
		System.out.println(fagne.getIdade());
		System.out.println(fagne.getAltura());
		

	}

}
