package Questão18;

public class Area {
	protected Parte[][] matriz;
	protected Robo robo;
	protected Moeda moeda;
	protected int contadornorte;
	protected int contadorsul;
	protected int contadorleste;
	protected int contadoroeste;
	Arroba arroba = new Arroba();
	public Area(int x,int y,Robo robo,Moeda moeda) {
		robo.positionx=x/2;
		robo.positiony=x/2;
		this.matriz = new Parte[x][y];
		this.robo=robo;
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
		robo.andadireita();
		encontreimoeda();
		matriz[robo.positionx][robo.positiony]=robo;
	}
	public void moveresquerda() {
		contadoroeste++;
		matriz[robo.positionx][robo.positiony]=arroba;
		robo.andaesquerda();
		encontreimoeda();
		matriz[robo.positionx][robo.positiony]=robo;
	}
	public void movercima() {
		contadornorte++;
		matriz[robo.positionx][robo.positiony]=arroba;
		robo.andacima();
		encontreimoeda();
		matriz[robo.positionx][robo.positiony]=robo;
	}
	public void moverbaixo() {
		contadorsul++;
		matriz[robo.positionx][robo.positiony]=arroba;
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
}