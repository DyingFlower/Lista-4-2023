package Questão18;

public class Area {
	protected Parte[][] matriz;
	protected Robo robo;
	protected Moeda moeda;
	public Area(int x,int y,Robo robo) {
		 this.matriz = new Parte[x][y];
		 this.robo=robo;
	}
	
	public void Imprimir() {
		for(int i=0;i<matriz[0].length;i++) {
			for(int j=0;j<matriz.length;j++) {
				System.out.print(" ["+matriz[j][i]+"] ");
			}
			System.out.println();
		}
	}
	public void adicionar() {
		matriz[robo.positionx][robo.positiony]=robo;
	}
}
