package Questão7;

public class Main {
/*7) Crie uma implementação orientada a objetos conforme os passos abaixo:
a) A classe Empregado deve possuir dois atributos, nome e salário. O salário
deve ser do tipo protected. Crie os métodos get e set para classes e o método
toString.
b) A classe Gerente deve herdar da classe Empregado. Crie os métodos get
e set para a classe e o método toString. O método toString da classe Gerente deve
incluir a informação do departamento, além dos dados da superclasse. O construtor
da classe deve receber por parâmetro, além das informações da superclasse, a
informação do departamento.
c) A classe Vendedor deve herdar também da classe Empregado. Deve
possuir ainda um método denominado calcularSalario. Esse método deve retornar
um valor do tipo float, correspondente ao valor do salário acrescido do respectivo
percentual de comissão. O construtor da classe deve receber por parâmetro, além
das informações da superclasse, a informação do percentual de comissão do
vendedor. O método toString da classe deve apresentar as informações de nome do
empregado, salário sem comissão, salário com comissão e percentual de comissão.
d) Crie uma classe para testar objetos das classes implementadas. */
	public static void main(String[] args) {
		Empregado empregado = new Empregado("Chico",800);
		Gerente gerente = new Gerente("Fisher",1000,"Tecnicas");
		Vendedor vendedor = new Vendedor("Chico",800,10);
		vendedor.calcularSalario();
	}

}
