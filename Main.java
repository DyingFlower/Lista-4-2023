package Questão1;

public class Main {
/* 2) A fim de representar empregados em uma firma, você deverá criar uma
classe chamada Empregado. Esta classe deverá possuir as três informações
a seguir:
a. Um primeiro nome,
b. Um sobrenome,
c. Um salário mensal.
Sua classe deve ter um construtor que inicializa os três atributos. Forneça um
método set e get para cada atributo. Se o salário mensal não for positivo,
configure-o como 0.0. Crie duas instâncias da classe e exiba o salário anual de cada
instância. Então dê a cada empregado um aumento de 10% e exiba novamente o
salário anual de cada empregado. */
	public static void main(String[] args) {
		Empregado empregado1 = new Empregado("joão","paulo",10.000);
		Empregado empregado2 = new Empregado("Maria","clara",20.000);

	}

}
