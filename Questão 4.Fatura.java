package Questão2;

import java.util.Scanner;

public class Fatura {
	Scanner leitor = new Scanner(System.in);
	private int num;
	private String desc;
	private int quant;
	private double preço;
	private double preçoT;
	public Fatura(int num,String desc,int quant,int preço,int preçoT) {
		this.num=num;
		this.desc=desc;
		this.quant=quant;
		this.preço=preço;
		this.preçoT=preçoT;
		System.out.println("Insira a porcentagem de desconto: ");
		int desconto=leitor.nextInt();
		desconto(desconto);
		System.out.println("preço total a pagar: "+getValorFatura(quant,preço));
		
		
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getQuant() {
		return quant;
	}
	public void setQuant(int quant) {
		if(quant<0) {
			quant=0;
		}
		this.quant = quant;
	}
	public double getPreço() {
		return preço;
	}
	public void setPreço(double preço) {
		if(preço<0) {
			preço=0;
		}
		this.preço = preço;
	}
	public double getPreçoT() {
		return preçoT;
	}
	public void setPreçoT(double preçoT) {
		this.preçoT = preçoT;
	}
	public double getValorFatura(int quant,double preço) {
		double valorfatura=quant*preço;
		return valorfatura;
	}
	public void desconto(int desconto) {
		preço=preço-(preço*(desconto/100));
	}
}

