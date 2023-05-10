package Questão13;

public class ControleRemoto {
	private int volume;
	private boolean ligado;
	private int canal;
	
	public ControleRemoto() {
		volume=25; // padrão
		ligado=false; // tv inicia desligada
	}
	public void mostrarpropiedades() {
		System.out.println("Volume: "+volume);
		System.out.println("Canal: "+canal);
	}
	public void mudarvolume(String v){
		if(ligado==true) {
			if(v.equals("+")) {
				volume++;
				System.out.println("Volume:"+volume);
			}
			else if(v.equals("-")) {
				volume--;
				System.out.println("Volume:"+volume);
			}
			else {
				System.out.println("Digite + ou - para completar a operação");
			}
		}
		
	}
	public void mudarcanal(String v){
		if(ligado==true) {
			if(v.equals("+")) {
				canal++;
				System.out.println("Canal:"+canal);
			}
			else if(v.equals("-")) {
				canal--;
				System.out.println("Canal:"+canal);
			}
			else {
				System.out.println("Digite + ou - para completar a operação");
			}
		}
		
	}
	public void trocarcanal(int canal) {
		if(ligado==true) {
			this.canal=canal;
			System.out.println("Canal: "+canal);
		}
	}
	public void mute() {
		if(ligado==true) {
			volume=0;
			System.out.println("Volume: 0");
		}
	}
	public boolean onoff() {
		if(ligado==true) {
			ligado=false;
			System.out.println("Tv desligando...");
			return ligado;
		}
		else {
			ligado=true;
			System.out.println("Inicializando tv...");
			mostrarpropiedades();
			return ligado;
		}
	}
}
