package Questão10e11e12;

public class Operario extends Empregado {
	protected double valorProducao;
	protected double comissao;
	
	public Operario(String nome, int codigoSetor,double valorProducao,double comissao) {
		super(nome, codigoSetor);
		this.valorProducao=valorProducao;
		this.comissao=comissao;
	}

	
	public void setSalarioBase(double salarioBase) {
		super.setSalarioBase(salarioBase);
	}


	public double getValorProducao() {
		return valorProducao;
	}


	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}


	public double getComissao() {
		return comissao;
	}


	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public double calcularSalario() {
		double salario=salarioBase-salarioBase*(imposto/100)+valorProducao*(comissao/100);
		System.out.println(salario);
		return salario;
	}
	
	
}
