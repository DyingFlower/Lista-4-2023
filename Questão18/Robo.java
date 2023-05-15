package Questão18;

public class Robo extends Parte{

	public Robo() {
		nome="Robo";
	}
	public void andaesquerda() {
		positionx-=1;
	}
	public void andadireita() {
		positionx+=1;
	}
	public void andacima() {
		positiony-=1;
	}
	public void andabaixo() {
		positiony+=1;
	}
	public String nome() {
		return nome;
	}
	
}