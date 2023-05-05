package Questão7;

public class Vendedor extends Empregado{
	private float comissão;
	public Vendedor(String nome, int salario,float comissão) {
		super(nome, salario);
		this.comissão=comissão;
		toString();
	}
	public float calcularSalario() {
		float salariototal=comissão+salario;
		return salariototal;
	}
	public String toString() {
		return super.toString()+calcularSalario()+comissão;
	}
	

}
