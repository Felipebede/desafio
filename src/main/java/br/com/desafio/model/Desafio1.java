package br.com.desafio.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "desafio1")
public class Desafio1 implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_desafio_1", nullable = false)
	private int idDesafio1;

	@Column(name = "id_pessoa", nullable = false, length = 4)
	private String idPessoa;

	@Column(name = "nome_pessoa", nullable = false, length = 39)
	private String nomePessoa;

	@Column(name = "valor_financeiro", nullable = false, precision = 25, scale = 2)
	private BigDecimal valorFinanceiro;

	public Desafio1(String idPessoa, String nomePessoa, BigDecimal valorFinanceiro) {
		super();
		this.idPessoa = idPessoa;
		this.nomePessoa = nomePessoa;
		this.valorFinanceiro = valorFinanceiro;
	}

	public Desafio1() {
		super();
	}

	public String getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(String idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public BigDecimal getValorFinanceiro() {
		return valorFinanceiro;
	}

	public void setValorFinanceiro(BigDecimal valorFinanceiro) {
		this.valorFinanceiro = valorFinanceiro;
	}

	public int getIdDesafio1() {
		return idDesafio1;
	}

	public void setIdDesafio1(int idDesafio1) {
		this.idDesafio1 = idDesafio1;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
