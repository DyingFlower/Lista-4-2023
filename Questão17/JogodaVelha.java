package Questão17;

import java.util.Scanner;

public class JogodaVelha {
	Scanner leitor = new Scanner(System.in);
	private String[][] array= new String[3][3];
	private Jogador jogador;
	public JogodaVelha() {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				array[j][i]=null;
			}
		}		
	}
	public void exibirgrade() {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(" ["+array[j][i]+"] ");
			}
			System.out.println();
		}		
	}
	public void jogar(Jogador jogador1, Jogador jogador2) {
		int contador=1;
		Jogador jogador;
		while(contador<10) {
			if(contador%2==0) {
				jogador =jogador2;
			}
			else {
				jogador =jogador1;
			}
			System.out.println(jogador.getNome()+" dê sua jogada:");
			int x=leitor.nextInt();
			int y=leitor.nextInt();
			if(array[x][y]==null) {
				array[x][y]=jogador.getNome();
			}
			else {
				System.out.println("Essa casa não está vazia");
			}
			exibirgrade();
			if(ganhar()==true) {
				System.out.println("O ganhador é: "+ jogador.getNome());
				contador=9;
			}
			else {
				System.out.println("Vez do próximo jogador.");
			}
			contador++;
		}
	}
	public	boolean ganhar() {
		boolean ganhar=false;
		if(array[0][0]!=null &&(array[0][0]==array[0][1] && array[0][1]==array[0][2]) || array[0][0]!=null&&(array[0][0]==array[1][1] && array[1][1]==array[2][2])) {
			ganhar=true;
			return ganhar;
		}
		if(array[1][0]!=null &&(array[1][0]==array[1][1] && array[1][1]==array[1][2])) {
			ganhar=true;
			return ganhar;
			
		}
		if(array[2][0]!=null&&(array[2][0]==array[2][1] && array[2][1]==array[2][2]) || array[2][0]!=null && (array[0][2]==array[1][1]&& array[1][1]==array[2][0])) {
			ganhar=true;
			return ganhar;
		}
		if(array[0][0]!=null&&(array[0][0]==array[1][0]&&array[1][0]==array[2][0])||array[0][1]!=null&&(array[0][1]==array[1][1]&&array[1][1]==array[2][1])||array[2][0]!=null&&(array[2][0]==array[2][1]&&array[2][1]==array[2][2])) {
			ganhar=true;
			return ganhar;
		}
		else {
			return ganhar;
		}
	}
}
