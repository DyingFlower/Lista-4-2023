package Questão14;

public class Main {
/* 14) Criar a classe Pessoa com as seguintes características:
● atributos: idade e dia, mês e ano de nascimento, nome da pessoa
● métodos: o calculaIdade(), que recebe a data atual em dias, mês e anos e
calcula e armazena no atributo idade a idade atual da pessoa o
informaIdade(), que retorna o valor da idade o informaNome(), que retorna
o nome da pessoa o ajustaDataDeNascimento(), que recebe dia, mês e

ano de nascimento como parâmetros e preenche nos atributos
correspondentes do objeto.
● Criar dois objetos da classe Pessoa, um representando Albert Einstein
(nascido em 14/3/1879) e o outro representando Isaac Newton (nascido
em 4/1/1643)
● Fazer uma classe principal que cria os objetos, inicialize e mostre quais
seriam as idades de Einstein e Newton caso estivessem vivos. */
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		pessoa1.setNome("Albert Einstein");
		pessoa1.ajustaDataDeNascimento(14, 3, 1879);
		System.out.println("A idade de: "+pessoa1.informaNome()+" nos dias de hoje é: "+pessoa1.calculaIdade(8, 5, 2023));
		pessoa2.setNome("Isaac Newton");
		pessoa2.ajustaDataDeNascimento(4, 1, 1643);
		System.out.println("A idade de: "+pessoa2.informaNome()+" nos dias de hoje é: "+pessoa2.calculaIdade(8, 5, 2023));
		
	}

}
