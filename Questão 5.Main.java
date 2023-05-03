package Questão5;

import java.util.ArrayList;

public class Main {
/* 5) Um contato é constituído de código, nome da pessoa, endereço, e-mail,
telefone e observação.
a. Crie 4 construtores e atribua o valores por meio dos construtores. Os
construtores devem receber os seguintes parâmetros:

I. Código.
II. Código e nome.
III. Código, nome e e-mail.
IV. Telefone.
b. O atributo e-mail não poderá ser modificado fora da classe contato, mas
poderá ser acessado por outras classes.
c. Faça um método para imprimir o código, nome, endereço, e-mail, telefone
e observação dos contatos cadastrados.
d. Faça um validador do código do contato. Um código válido é maior
igual a 1000 e menor igual a 9999. Não permita que seja cadastrado
um código inválido para nenhum contato.
e. Faça um validador para o telefone. O telefone sempre deverá ter 8 dígitos.
Não permita que seja cadastrado um telefone inválido para nenhum contato.
f. Crie um método que possa duplicar um contato. Desta forma, um novo
contato terá os mesmos dados do contato que for requerido a duplicação.
g. Faça um método para verificar se o contato está totalmente preenchido.
Ou seja, tenha valores diferentes do padrão para: código, nome, endereço, e-mail,
telefone e observação.
h. Crie uma classe agenda que é composta de uma lista de contatos, nome
da agenda e uma descrição.
i. Crie uma classe cliente que poderá usar uma agenda.
j. Faça uma classe main para testar seu sistema criado. */
	public static void main(String[] args) {
		ArrayList<Integer> telefone1 = new ArrayList<Integer>();
		telefone1.add(9);
		telefone1.add(9);
		telefone1.add(2);
		telefone1.add(0);
		telefone1.add(8);
		telefone1.add(6);
		telefone1.add(8);
		telefone1.add(2);
		Cliente fisher = new Cliente();
		agenda agendadofisher = new agenda("agendadofisher","agenda de contatos do fisher");
		Contato arthur = new Contato(1008,"arthur","arthurvieiradelacerda@gmail.com");
		arthur.setEndereço("Rua 1");
		arthur.setTelefone(telefone1);
		arthur.setObservaçao("Ele esta digitando...");
		arthur.imprimir();
		arthur.preenchido();
		agendadofisher.adicionarlista(arthur);
		fisher.setAgenda(agendadofisher);
	}

}
