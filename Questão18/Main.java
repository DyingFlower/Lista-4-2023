package Questão18;

public class Main {
/* 18)Crie uma matriz para representar uma área em que um robô pode caminhar.
Sendo que o robô poderá caminhar nas direções das setas indicadas abaixo.
Cada direção deverá ser mapeada por um método na classe robô. O robô
deverá caminhar apenas uma casa cada vez quando um método for
chamado. O robô deverá ser colocado no meio da área sempre que o
programa iniciar. O tamanho da área em que o robô caminha é quadrado,
mas pode ter diferentes números de linhas e colunas.

a) A classe deverá ter a contagem de quantas casas o robô caminhou nas
direções: norte, sul, leste, oeste, nordeste, sudeste, sudoeste e noroeste.
b) O programa deverá sortear uma determinada posição X,Y e colocar uma
moeda. Essa moeda deverá ser encontrada posteriormente pelo robô.
Você deverá usar o símbolo “$” para representar a moeda.
c) Faça um método que ao chamar as operações para o robô caminhar
encontre a moeda na área.
d) Faça um método que ao chamar as operações para o robô caminhar
encontre a moeda na área, com a restrição de que o mesmo método não
pode ser chamado em seguida. Por exemplo, não poderia existir as
seguintes chamadas: norte e norte. Mas poderia existir a seguinte
combinação: norte, nordeste e norte.
e) Faça um método para imprimir a área utilizada para o robô caminhar.
f) Modifique os métodos utilizados para o robô caminhar na área para que
cada posição da matriz que for visitada pelo robô seja marcada com o
símbolo ‘@’
g) Faça um método que conte as posições que o robô já passou
h) Faça um método que conte as posições que o robô ainda não passou
i) Faça o robô executar as seguintes novas caminhadas descritas nos itens
abaixo (um método para cada caminhada A, B e C ), sempre utilize os
métodos para movimento do robô. A caminhada começa no ponto (azul) e
termina na flecha (verde), como demonstrado nas figuras (A, B e C)
abaixo: */
	public static void main(String[] args) {
		Robo robo = new Robo();
		Moeda moeda = new Moeda();
		moeda.randomizar(10);
		Area area = new Area(10,10,robo,moeda);
		area.Imprimir();
		System.out.println("f");
		area.seguiratemoeda();
		area.Imprimir();
		System.out.println(area.contarposicoesP());
		System.out.println(area.contarposicoesN());
		System.out.println(area.contadorleste);
		System.out.println(area.contadoroeste);
		System.out.println(area.contadorsul);
		System.out.println(area.contadornorte);
		area.caminhadaA();
		System.out.println("Space");
		area.caminhadaB();
		System.out.println("Space");
		area.caminhadaC();
	}

}