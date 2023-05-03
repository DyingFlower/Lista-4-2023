package Questão5;

import java.util.ArrayList;

public class Contato {
	private int codigo;
	private String nome;
	private String endereço;
	private String email;
	private ArrayList<Integer> telefone= new ArrayList<>();
	private String observaçao;
	public Contato(int codigo) {
		if(codigo>=1000 && codigo<=9999) {
			this.codigo = codigo;
		}
		else
			System.out.println("Codigo invalido");
	}
	public Contato(int codigo,String nome) {
		this.nome=nome;
		if(codigo>=1000 && codigo<=9999) {
			this.codigo = codigo;
		}
		else
			System.out.println("Codigo invalido");
	}
	public Contato(int codigo, String nome, String email) {
		this.nome=nome;
		if(codigo>=1000 && codigo<=9999) {
			this.codigo = codigo;
		}
		else
			System.out.println("Codigo invalido");
		this.email=email;
	}
	public Contato (ArrayList<Integer> telefone) {
		if(telefone.size()==8) {
			this.telefone = telefone;
		}
		else
			System.out.println("Telefone invalido");
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		if(codigo>=1000 && codigo<=9999) {
			this.codigo = codigo;
		}
		else
			System.out.println("Codigo invalido");
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public ArrayList<Integer> getTelefone() {
		return telefone;
	}
	public void setTelefone(ArrayList<Integer> telefone) {
		if(telefone.size()==8) {
			this.telefone = telefone;
		}
		else
			System.out.println("Telefone invalido");
	}
	public String getObservaçao() {
		return observaçao;
	}
	public void setObservaçao(String observaçao) {
		this.observaçao = observaçao;
	}
	public void imprimir() {
		System.out.println(codigo);
		System.out.println(nome);
		System.out.println(endereço);
		System.out.println(email);
		System.out.println(telefone);
		System.out.println(observaçao);
	}
	public void preenchido() {
		boolean esta = false;
		if(codigo!=0 && nome!=null&& endereço!=null && email!=null && telefone!=null && observaçao!=null) {
			esta=true;
		}
		System.out.println(esta);
	}
	
	
}
