package Questão10e11e12;

public class Empregado extends Pessoa{
	protected int codigoSetor;
	protected double salarioBase;
	protected double imposto;
	public Empregado(String nome,int codigoSetor) {
		super(nome);
		this.codigoSetor=codigoSetor;
		
	}
	public double calcularSalario() {
		double salario=salarioBase-salarioBase*(imposto/100);
		System.out.println(salario);
		return salario;
	}
	public int getCodigoSetor() {
		return codigoSetor;
	}
	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public double getImposto() {
		return imposto;
	}
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

}
