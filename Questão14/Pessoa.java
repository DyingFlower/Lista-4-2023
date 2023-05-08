package Questão14;

public class Pessoa {
	private int idade;
	private int dia;
	private int mes;
	private int ano;
	private String nome;
	
	
	public int calculaIdade(int dia, int mes, int ano) {
		if(this.ano<=ano) {
			if(this.mes<mes) {
				idade=ano-this.ano;
				return idade;
			}
			else if(this.mes>mes){
				idade=ano-this.ano-1;
				return idade;
			}
			else {
				if(this.dia>dia) {
					idade=ano-this.ano-1;
					return idade;
				}
				else {
					idade=ano-this.ano;
					return idade;
				}
			}
		}
		else {
			return 0;
		}	
	}
	public int  informaIdade() {
		return idade;
	}
	public String informaNome() {
		return nome;
	}
	public void ajustaDataDeNascimento(int dia,int mes, int ano) {
		this.dia=dia;
		this.mes=mes;
		this.ano=ano;	
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
