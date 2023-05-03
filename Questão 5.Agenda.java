package Questão5;

import java.util.ArrayList;
import java.util.Scanner;

public class agenda {
	Scanner leitor = new Scanner(System.in);
	private ArrayList<Contato> lista= new ArrayList<>();
	private String nome;
	private String descriçao;
	
	public agenda(String nome, String descriçao) {
		this.nome=nome;
		this.descriçao=descriçao;
	}
	public  void adicionarlista(Contato h) {
		this.lista.add(h);
	}
	public ArrayList<Contato> getLista() {
		return lista;
	}
	public void setLista(ArrayList<Contato> lista) {
		this.lista = lista;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescriçao() {
		return descriçao;
	}
	public void setDescriçao(String descriçao) {
		this.descriçao = descriçao;
	}
	public void duplicar(boolean d) {
		if(d==true) {
			System.out.println("Escreva qual elemento da lista você quer que seja copiado: ");
			int i = leitor.nextInt();
			lista.get(i);
			System.out.println("Escreva qual elemento da lista você quer passar a copia: ");
			int j = leitor.nextInt();
			lista.get(j).setCodigo(lista.get(i).getCodigo());
			lista.get(j).setNome(lista.get(i).getNome());
			lista.get(j).setEndereço(lista.get(i).getEndereço());
			lista.get(j).setEmail(lista.get(i).getEmail());
			lista.get(j).setTelefone(lista.get(i).getTelefone());
			lista.get(j).setObservaçao(lista.get(i).getObservaçao());
		}
	}
}
