package br.sp.gov.etec.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_curso")
public class Curso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "nome", nullable = false, length = 55, unique = true)
	private String nome;

	@Column(name = "descricao", nullable = false, length = 255)
	private String descricao;

	@Column(name = "status", nullable = false, length = 1)
	private int status;

	@Column(name = "codigo", length = 45)
	private String codigo;

	public Curso(String nome, String descricao, int status, String codigo) {
		this.nome = nome;
		this.descricao = descricao;
		this.status = status;
		this.codigo = codigo;
	}

	public Curso() {

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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

}
