package Questão9;

public class Quadrado extends Forma{

	public Quadrado(int base) {
		super(base);
		
	}

	public double calcularArea() {
		double area = base*base;
		System.out.println( area);
		return area;
	}

	public void imprimirNome() {
		super.imprimirNome();
	}
	
}
