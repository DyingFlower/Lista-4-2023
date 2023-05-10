package Questão15;

import java.util.Scanner;

/*15)Crie uma classe Produto, essa classe deverá conter os seguintes atributos:
nome do produto, preço de custo, preço de venda, margem de lucro e
despesas da empresa. E o método: Cálculo da Margem de Lucros. OBS:
Cálculo da Margem de Lucro: Margem de Lucro = {[PV – (PC + D)] / PV]} x
100. Com - PC= Preço de Custo, PV= Preço de Venda, D= Despesas. Por
fim, no método main(), crie um novo objeto da classe Produto, peça para o
usuário informar o nome, os preços de custo e de venda e exiba a margem
de lucro em porcentagem.*/
public class Main {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Escreva o nome do produto, o preço de custo e de venda");
		String nome=leitor.next();
		double preçoC=leitor.nextDouble();
		double preçoV= leitor.nextDouble();
		Produto produto1 = new Produto(nome,preçoC,preçoV);
		produto1.CálculodaMargemdeLucros();
		System.out.println("Margem de Lucro: "+produto1.getMargemdeL()+"%");
		leitor.close();
	}

}
