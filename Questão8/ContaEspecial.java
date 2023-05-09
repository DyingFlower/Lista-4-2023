package Questão8;

public class ContaEspecial extends ContaCorrente{
	private float limitedecrédito;
	
	public ContaEspecial(Cliente cliente, float saldo, float limitedecrédito) {
		super(cliente, saldo);
		this.limitedecrédito=limitedecrédito;
		
	}

	public float Sacar(int quantidade) {
		float novosaldo = saldo-quantidade;
		if(novosaldo<0-(limitedecrédito)) {
			System.out.println("Você não pode sacar isso, estoura seu limite");
			return 0;
		}
		else if(novosaldo<0) {
			System.out.println("Você deve: "+novosaldo);
			return novosaldo;
		}
		else {
			System.out.println("Você ainda tem: "+ novosaldo+" guardado.");
			return novosaldo;
		}
	}

	public float getLimitedecrédito() {
		return limitedecrédito;
	}

	public void setLimitedecrédito(float limitedecrédito) {
		this.limitedecrédito = limitedecrédito;
	}
	
	
}
