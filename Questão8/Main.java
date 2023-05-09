package Questão8;

public class Main {
/* 8) Crie uma implementação orientada a objetos conforme os passos abaixo:
a) A classe ContaEspecial herda da classe ContaCorrente.
b) Clientes que possuem conta especial possuem um limite de crédito. Dessa
forma, podem fazer saques até esse valor limite, mesmo que não possuam saldo
suficiente na conta.
c) O construtor da classe ContaEspecial deve receber como parâmetro, além
dos parâmetros da superclasse, o limite que o banco disponibiliza para o cliente.
d) Sobrescreva o método sacar na classe ContaEspecial, de modo que o
cliente possa ficar com saldo negativo até o valor de seu limite. Note que o atributo
saldo da classe ContaCorrente deve ser do tipo protected para que possa ser
modificado na subclasse */
	public static void main(String[] args) {
		Cliente Fisher = new Cliente("Fisher","03483055");
		ContaEspecial conta1= new ContaEspecial(Fisher,1000,1000);
		conta1.Sacar(700);
	}

}
