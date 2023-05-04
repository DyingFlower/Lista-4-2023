package Questão6;

public class IngressoVIP extends Ingresso{
	private int valoradicional; 
	public IngressoVIP(int valor,int valoradicional) {
		super(valor);
		this.valoradicional=valoradicional;
	}
	public int toString(int valor,int valoradicional) {
		valoradicional=this.valoradicional;
		return super.toString(valor)+valoradicional;
	}

	

}
