package Questão9;

public class Main {
/* 9) Crie uma classe que será chamada de Forma. A classe Forma é composta
dos métodos calcularArea e imprimirNome. Crie as classes Círculo,
Retângulo, Quadrado e Triângulo. Cada classe deverá ter os métodos
calcularArea e imprimirNome. Porém, para cada classe deverá implementar
as operações segundo cada forma geométrica. Por exemplo, o quadrado
deverá calcular a área segundo o quadrado e imprimir o nome “quadrado”.
Utilize os recursos da orientação a objetos para modelar os requisitos acima. */
	public static void main(String[] args) {
		Quadrado quadrado = new Quadrado(4);
		quadrado.imprimirNome();
		quadrado.calcularArea();
		Retângulo retangulo = new Retângulo(4,8);
		retangulo.imprimirNome();
		retangulo.calcularArea();
		Triângulo triangulo = new Triângulo(10,5);
		triangulo.imprimirNome();
		triangulo.calcularArea();
		Círculo circulo = new Círculo(2);
		circulo.imprimirNome();
		circulo.calcularArea();
	}

}
