package Questão7;

public class Empregado {
	private String nome;
	protected int salario;
	
	public Empregado(String nome,int salario) {
		this.nome=nome;
		this.salario=salario;
		toString();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	public String toString() {
		return nome+salario;
	}
	
}
