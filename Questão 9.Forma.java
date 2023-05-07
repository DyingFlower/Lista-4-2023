package Questão9;

abstract class Forma implements Area {
	protected double base;
	protected double altura;
	
	public Forma(int base) {
		this.base=base;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double calcularArea() {
		return 0;
	}
	public void imprimirNome() {
		System.out.println(getClass().getSimpleName());
	}
	
}
