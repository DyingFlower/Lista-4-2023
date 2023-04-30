package Questão1;

public class Empregado {
	private String Pnome;
	private String Snome;
	private double salarioM;

	public Empregado(String Pnome,String Snome, double salarioM) {
		this.Pnome=Pnome;
		this.Snome=Snome;
		this.salarioM=salarioM;
		exibirsalario(salarioM);
	}

	public String getPnome() {
		return Pnome;
	}

	public void setPnome(String pnome) {
		Pnome = pnome;
	}

	public String getSnome() {
		return Snome;
	}

	public void setSnome(String snome) {
		Snome = snome;
	}

	public double getSalarioM() {
		return salarioM;
	}

	public void setSalarioM(double salarioM) {
		if(salarioM<0) {
			salarioM=0;
		}
		this.salarioM = salarioM;
	}
	public void exibirsalario(double salarioM) {
		salarioM=this.salarioM;
		System.out.println("Salario de "+ Pnome+" é " +salarioM);
		System.out.println("Seu novo salario é "+aumento(salarioM));
	}
	public double aumento(double salarioM) {
		salarioM=salarioM+(salarioM*0.1);
		return salarioM;
	}
		
}
