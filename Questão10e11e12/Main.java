package Questão10e11e12;

public class Main {

	public static void main(String[] args) {
		Empregado pessoa1 = new Empregado("Chico",1322);// questão 10
		pessoa1.setSalarioBase(5000.0);
		pessoa1.setImposto(20);
		pessoa1.calcularSalario();
		Operario pessoa2 = new Operario("Arthur",4521,5000,20);// questão 11
		pessoa2.setSalarioBase(5000);
		pessoa2.setImposto(20);
		pessoa2.calcularSalario();
		Vendedor pessoa3 = new Vendedor("Fisher",6789,5000,50);// questão 12
		pessoa3.setSalarioBase(5000);
		pessoa3.setImposto(20);
		pessoa3.calcularSalario();
	}

}
