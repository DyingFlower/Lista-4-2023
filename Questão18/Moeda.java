package Questão18;

import java.util.Random;

public class Moeda extends Parte{

	public Moeda() {
		nome="$";
	}
	public void randomizar(int x) {
		Random random = new Random();
		positionx=random.nextInt(x);
		positiony=random.nextInt(x);
	}

	public String nome() {
		return nome;
	}
}
