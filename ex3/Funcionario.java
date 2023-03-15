package ex3;

import java.util.Date;

public class Funcionario {
	
	private String nome;
	private Date dataAdmissao;
	private double salario;
	private int identificador;
	private static int idaux = 1;
	
	Funcionario(){
		this.identificador = Funcionario.idaux++;
		
	}
	
	public int getIdentificador() {
		return identificador;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(Date dataAdmissao) {
		if(this.dataAdmissao == null) {
			this.dataAdmissao = dataAdmissao;
			System.out.println("data setada");
			return;
		}
		System.out.println("data já setada");
		
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		if(salario >=1100) {
			System.out.println("salario setado com sucesso");
			this.salario = salario;
			return;
		}
		System.out.println("adicione um valor maior ou igual a 1100");
	}
	
	
}
