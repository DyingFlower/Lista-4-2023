package Questão17;

public class Main {
/* 17)Escreva um programa completo para jogar o jogo da velha. Para tanto crie
uma classe Jogo da Velha (OBS: apenas terminal, ainda não estudamos
interface gráfica):
a. A classe deve conter como dados privados um array bidimensional 3x3
para representar a grade do jogo.
b. Utilize uma variável do tipo String para representar as possibilidades de
ocupação de uma casa na grade (vazia, jogador 1 ou jogador 2)
c. O construtor deve inicializar a grade como vazia
d. Forneça um método para exibir a grade
e. Permitir dois jogadores humanos
f. Forneça um método para jogar o jogo; todo movimento deve ocorrer em
uma casa vazia; depois de cada movimento, determine se houve uma derrota ou um
empate. */
	public static void main(String[] args) {
		Jogador jogador1 = new Jogador("Arthur");
		Jogador jogador2 = new Jogador("Jefferson");
		JogodaVelha jogo = new JogodaVelha();
		jogo.exibirgrade();
		jogo.jogar(jogador1,jogador2);

		
		

	}

}
