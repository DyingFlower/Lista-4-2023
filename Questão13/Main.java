package Questão13;

public class Main {
/*13) Crie uma classe Controle Remoto que pode controlar o volume e trocar os
canais da televisão. O Controle Remoto deverá ter as seguintes
funcionalidades:
A) Ligar e desligar a TV
B) Aumentar ou diminuir a potência do volume de som em uma unidade
de cada vez;
C) Aumentar e diminuir o número do canal em uma unidade trocar para
um canal indicado;
D) Consultar o valor do volume de som e o canal selecionado;
E) Mudança de canal por meio de um número informado
F) Função Mute */
	public static void main(String[] args) {
		ControleRemoto controle = new ControleRemoto();
		controle.onoff();
		controle.mudarvolume("+");
		controle.mudarcanal("+");
		controle.trocarcanal(280);
		controle.mute();
		controle.onoff(); // nada de bom para assistir
		

	}

}
