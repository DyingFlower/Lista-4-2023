package Questão6;

import java.util.ArrayList;

public class evento {
	ArrayList<Ingresso> lista;
	public int computar(ArrayList<Ingresso> lista) {
		lista=this.lista;
		int soma=0;
		for(int i=0;i<lista.size();i++) {
			if(lista.get(i).isVenda()==true){
				soma=soma+lista.get(i).getValor();
			}
		}
		return soma;
	}
	public ArrayList<Ingresso> mostrar(ArrayList<Ingresso> lista){
		lista=this.lista;
		ArrayList<Ingresso> Nvendidos= new ArrayList<Ingresso>();
		for(int i=0;i<lista.size();i++) {
			if(lista.get(i).isVenda()==false){
				Nvendidos.add(lista.get(i));
			}
		}
		return Nvendidos;
	}
		
	
}

