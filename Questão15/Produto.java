package Questão15;

public class Produto {
	private String nome;
	private double preçoC;
	private double preçoV;
	private double margemdeL;
	private double despesas;
	
	
	public Produto(String nome, double preçoC, double preçoV) {
		this.nome = nome;
		this.preçoC = preçoC;
		this.preçoV = preçoV;
	}
	public double CálculodaMargemdeLucros() {
		margemdeL=((preçoV-(preçoC+despesas))/preçoV)/100;
		return margemdeL;
		
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreçoC() {
		return preçoC;
	}
	public void setPreçoC(double preçoC) {
		this.preçoC = preçoC;
	}
	public double getPreçoV() {
		return preçoV;
	}
	public void setPreçoV(double preçoV) {
		this.preçoV = preçoV;
	}
	public double getDespesas() {
		return despesas;
	}
	public void setDespesas(double despesas) {
		this.despesas = despesas;
	}
	public double getMargemdeL() {
		return margemdeL;
	}
	public void setMargemdeL(double margemdeL) {
		this.margemdeL = margemdeL;
	}
	
}
