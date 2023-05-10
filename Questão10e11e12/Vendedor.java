package Questão10e11e12;

public class Vendedor extends Empregado{
	protected double valorVendas;
	protected double comissao;
	public Vendedor(String nome, int codigoSetor,double valorVendas,double comissao) {
		super(nome, codigoSetor);
		this.valorVendas=valorVendas;
		this.comissao=comissao;
	}

	public double calcularSalario() {
		double salario=salarioBase-salarioBase*(imposto/100)+valorVendas*(comissao/100);
		System.out.println(salario);
		return salario;
	}

	public double getValorVendas() {
		return valorVendas;
	}
	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}
	
}
