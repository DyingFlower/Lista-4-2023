package Questão18;

import java.util.ArrayList;

public class Area {
	protected int x;
	protected int y;
	protected Parte[][] matriz;
	protected Robo robo;
	protected Moeda moeda;
	protected int contadornorte;
	protected int contadorsul;
	protected int contadorleste;
	protected int contadoroeste;
	protected int contadorP=0;
	protected int contadorN;
	Arroba arroba = new Arroba();
	public Area(int x,int y,Robo robo,Moeda moeda) {
		this.x=x;
		this.y=y;
		contadorN=x*y;
		robo.positionx=x/2;
		robo.positiony=x/2;
		this.matriz = new Parte[x][y];
		this.robo=robo;
		this.moeda=moeda;
		moeda.randomizar(x);
		matriz[robo.positionx][robo.positiony]=robo;
		matriz[moeda.positionx][moeda.positiony]=moeda;
	}
	
	public void Imprimir() {
		for(int i=0;i<matriz[0].length;i++) {
			for(int j=0;j<matriz.length;j++) {
				if(matriz[j][i]!=null) {
					System.out.print(" ["+matriz[j][i].nome()+"] ");
				}
				else {
					System.out.print(" ["+matriz[j][i]+"] ");
				}
			}
			System.out.println();
		}
	}
	public void moverdireita() {
		contadorleste++;
		matriz[robo.positionx][robo.positiony]=arroba;
		contarposicoesP();
		contarposicoesN();
		robo.andadireita();
		encontreimoeda();
		matriz[robo.positionx][robo.positiony]=robo;
	}
	public void moveresquerda() {
		contadoroeste++;
		matriz[robo.positionx][robo.positiony]=arroba;
		contarposicoesP();
		contarposicoesN();
		robo.andaesquerda();
		encontreimoeda();
		matriz[robo.positionx][robo.positiony]=robo;
	}
	public void movercima() {
		contadornorte++;
		matriz[robo.positionx][robo.positiony]=arroba;
		contarposicoesP();
		contarposicoesN();
		robo.andacima();
		encontreimoeda();
		matriz[robo.positionx][robo.positiony]=robo;
	}
	public void moverbaixo() {
		contadorsul++;
		matriz[robo.positionx][robo.positiony]=arroba;
		contarposicoesP();
		contarposicoesN();
		robo.andabaixo();
		encontreimoeda();
		matriz[robo.positionx][robo.positiony]=robo;
	}
	public boolean encontreimoeda() {
		if(robo.positionx==moeda.positionx &&robo.positiony==moeda.positiony){
			System.out.println("O Robô achou a moeda :)");
			return true;
		}
		else {
			return false;
		}
	}
	public void seguiratemoeda() {
		for(;moeda.positionx>robo.positionx;) {
			moverdireita();
			for(;moeda.positiony>robo.positiony;) {
				moverbaixo();
			}
			for(;moeda.positiony<robo.positiony;) {
				movercima();
			}
		}
		for(;moeda.positionx<robo.positionx;) {
			moveresquerda();
			for(;moeda.positiony>robo.positiony;) {
				moverbaixo();
			}
			for(;moeda.positiony<robo.positiony;) {
				movercima();
			}
		}
	}
	public int contarposicoesP() {
		contadorP++;
		return contadorP;
	}
	public int contarposicoesN() {
		contadorN--;
		return contadorN;
	}
	public void caminhadaA() {
		for(int i=0;i<matriz[0].length;i++) {
			for(int j=0;j<matriz.length;j++) {
				matriz[j][i]=null;
			}
		}
		robo.positionx=0;
		robo.positiony=0;
		matriz[robo.positionx][robo.positiony]=robo;
		while(robo.positiony<y-1) {
			while(robo.positionx<x-1) {
				moverdireita();
			}
			moverbaixo();
			while(robo.positionx>0) {
				moveresquerda();
			}
			if(robo.positiony!=y-1) {
				moverbaixo();
			}
		}
		Imprimir();
	}
	public void robodiagonalsudeste() {
		matriz[robo.positionx][robo.positiony]=arroba;
		robo.andabaixo();
		robo.andadireita();
		matriz[robo.positionx][robo.positiony]=robo;
	}
	public void robodiagonalsudoeste() {
		matriz[robo.positionx][robo.positiony]=arroba;
		robo.andaesquerda();
		robo.andabaixo();
		matriz[robo.positionx][robo.positiony]=robo;
	}
	public void caminhadaB() {
		for(int i=0;i<matriz[0].length;i++) {
			for(int j=0;j<matriz.length;j++) {
				matriz[j][i]=null;
			}
		}
		robo.positionx=0;
		robo.positiony=0;
		matriz[robo.positionx][robo.positiony]=robo;
		while(robo.positionx<x-1) {
			robodiagonalsudeste();
		}
		while(robo.positiony>0) {
			movercima();
		}
		while(robo.positiony<y-1) {
			robodiagonalsudoeste();
		}
		while(robo.positiony>0) {
			movercima();
		}
		Imprimir();
	}
	
	public void caminhadaC() { // não consegui
		int aux=1;
		for(int i=0;i<matriz[0].length;i++) {
			for(int j=0;j<matriz.length;j++) {
				matriz[j][i]=null;
			}
		}
		robo.positionx=x/2;
		robo.positiony=y/2;
		matriz[robo.positionx][robo.positiony]=robo;
		while(robo.positionx!=0 && robo.positiony!=y-1) {
			while(robo.positionx<robo.positionx+aux) {
				if(robo.positionx<x-1) {
					moverdireita();
				}
			}
			while(robo.positiony<robo.positiony+aux) {
				if(robo.positiony<y-1) {
					moverbaixo();
				}
			}
			aux++;
			while(robo.positionx>robo.positionx-aux) {
				if(robo.positionx>x-1) {
					moveresquerda();
				}
			}
			while(robo.positiony>robo.positiony-aux) {
				if(robo.positiony>y-1) {
					movercima();
				}
	
			}
			aux++;
			}
		Imprimir();
		}
		
}

