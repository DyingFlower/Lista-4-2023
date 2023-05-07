package Questão9;

public class Retângulo extends Forma {

	public Retângulo(int base, int altura) {
		super(base);
		this.altura=altura;
	}

	public double calcularArea() {
		double area = base*altura;
		System.out.println( area);
		return area;
	}

	public void imprimirNome() {
		super.imprimirNome();
	}
	
}
