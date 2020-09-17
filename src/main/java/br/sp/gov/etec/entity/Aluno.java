package br.sp.gov.etec.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_aluno")
public class Aluno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "nome", nullable = false, length = 55)
	private String nome;

	@Column(name = "rg", nullable = false, length = 255)
	private String rg;

	@Column(name = "cpf", nullable = false, length = 11, unique = true)
	private int cpf;
	
	@Column(name = "matricula", length = 45)
	private String matricula;

	@Column(name = "email", length = 45)
	private String email;
	
	@Column(name = "datanascimento", length = 45)
	private String datanascimento;

	public Aluno(String nome, String rg, int cpf, String matricula, String email, String datanascimento) {
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.matricula = matricula;
		this.email = email;
		this.datanascimento = datanascimento;
	}

	public Aluno() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

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

}
