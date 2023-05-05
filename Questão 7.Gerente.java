package Questão7;

public class Gerente extends Empregado {
	private String departamento;
	
	public Gerente(String nome, int salario,String departamento) {
		super(nome, salario);
		this.departamento=departamento;
		toString();
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getNome() {
		return super.getNome();
	}
	public void setNome(String nome) {
		super.setNome(nome);
	}
	public int getSalario() {
		return super.getSalario();
	}
	public void setSalario(int salario) {
		super.setSalario(salario);
	}
	public String toString() {
		return super.toString()+departamento;
	}


}
