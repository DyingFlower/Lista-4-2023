package Questão9;

public class Triângulo extends Forma {
	
	public Triângulo(int base, int altura) {
		super(base);
		this.altura=altura;
	}
	public double calcularArea() {
		double valor=base*altura;
		double area= valor/2;
		System.out.println(area);
		return area;
	}

	public void imprimirNome() {
		super.imprimirNome();
	}
	

}
