package Questão16;

public class Elevador {
	private int andar;
	private int totalandar;
	private int capacidade;
	private int ocupacao;
	
	public Elevador() {
		andar=0;
		ocupacao=0;
	}
	public void Inicializa(int capacidade,int totalandar) {
		this.capacidade=capacidade;
		this.totalandar=totalandar;
	}
	public void Entra(){
		if(ocupacao<capacidade) {
			ocupacao++;
		}
	}
	public void Sai() {
		if(ocupacao>0) {
			ocupacao--;
		}
	}
	public  void Sobe() {
		if(andar<totalandar) {
			andar++;
		}
	}
	public void Desce() {
		if(andar>0) {
			andar--;
		}
	}
	public int getAndar() {
		return andar;
	}
	public void setAndar(int andar) {
		this.andar = andar;
	}
	public int getTotalandar() {
		return totalandar;
	}
	public void setTotalandar(int totalandar) {
		this.totalandar = totalandar;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	public int getOcupacao() {
		return ocupacao;
	}
	public void setOcupacao(int ocupacao) {
		this.ocupacao = ocupacao;
	}
	
}
