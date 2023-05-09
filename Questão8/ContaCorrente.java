package Questão8;
public class ContaCorrente {
	private Cliente cliente;
	protected  float saldo;
	
	public ContaCorrente(Cliente cliente, float saldo) {
		this.cliente = cliente;
		this.saldo= saldo;
	}
	public float Sacar(int quantidade) {
		float novosaldo=saldo-quantidade;
		if(novosaldo<0) {
			System.out.println("Sem o necessário na conta");
		}
		return novosaldo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
}
