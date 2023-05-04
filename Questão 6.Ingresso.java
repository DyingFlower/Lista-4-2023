package Questão6;

public class Ingresso {
	private int valor;
	private boolean venda=false;
	public Ingresso(int valor) {
		this.valor=valor;
	}
	
	public boolean isVenda() {
		return venda;
	}

	public void setVenda(boolean venda) {
		this.venda = venda;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	public int toString(int valor) {
		valor=this.valor;
		return valor;
	}
	public boolean vendido(boolean venda) {
		venda=true;
		this.venda=venda;
		return this.venda;
	}
	
}
