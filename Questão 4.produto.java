package Questão4;

public class produto {
	private String nome;
	private double preço;
	private int quantidade;
	private boolean compra=false;
	public produto(String nome, double preço, int quantidade) {
		this.nome=nome;
		this.preço=preço;
		this.quantidade=quantidade;
		System.out.println("Para o produto: "+nome+" o preço total foi: "+retornarvalor(preço,quantidade));
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreço() {
		return preço;
	}

	public void setPreço(double preço) {
		this.preço = preço;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public boolean isCompra() {
		return compra;
	}

	public void setCompra(boolean compra) {
		this.compra = compra;
	}

	public boolean comprarProduto() {
		boolean compra=true;
		this.compra=compra;
		return compra;
	}
	public int desconto(double preço) {
		if(preço<=100) {
			return 0;
		}
		else if(preço>100 && preço<=200) {
			return 10;
		}
		else if(preço>200 && preço<=500) {
			return 20;
		}
		else if (preço>500){
			return 25;
		}
		else {
			return 999;
		}
	}
	public double retornarvalor(double preço,int quantidade) {
		double total = preço*quantidade;
		double valor=desconto(preço);
		total=total - (total*valor)/100;
		return total;
	}
}

