package Questão9;

public class Círculo extends Forma{

	public Círculo(int base) {
		super(base);
	}
	public void imprimirNome() {
		super.imprimirNome();
	}
	public double calcularArea() {
		double area = 3.14 * base*base;
		System.out.println(area);
		return area;
	}
	
	

}
