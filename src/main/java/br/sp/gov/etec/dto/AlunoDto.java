package br.sp.gov.etec.dto;

import java.io.Serializable;

import br.sp.gov.etec.entity.Aluno;

// class
public class AlunoDto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8801099962146052104L;
	
	// atributos da classe
	private String nome;
	private String rg;
	private int cpf;
	private String matricula;
	private String email;
	private String datanascimento;
	
	
	
	public String getNome() {
		return nome;
	}


	// método sem retorno (void)
	public void setNome(String nome) {
		this.nome = nome;
	}


	// método que retorna um tipo string
	public String getRg() {
		return rg;
	}



	public void setRg(String rg) {
		this.rg = rg;
	}



	public int getCpf() {
		return cpf;
	}



	public void setCpf(int cpf) {
		this.cpf = cpf;
	}



	public String getMatricula() {
		return matricula;
	}



	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getDatanascimento() {
		return datanascimento;
	}



	public void setDatanascimento(String datanascimento) {
		this.datanascimento = datanascimento;
	}


	// método classe
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	//método da classe
	public  Aluno toEntityAluno() {	
		//AQUI É UM OBJETO
		Aluno aluno = new Aluno(nome,rg, cpf, matricula, email, datanascimento);		
		return aluno;		
	}
	
	
	
	
}
