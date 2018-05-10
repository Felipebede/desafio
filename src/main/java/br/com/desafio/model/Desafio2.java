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
@Table(name = "desafio2")
public class Desafio2 implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_desafio_2", nullable = false)
	private int idDesafio2;

	@Column(name = "id_pessoa", nullable = false, length = 4)
	private String idPessoa;

	@Column(name = "nome_pessoa", nullable = false, length = 39)
	private String nomePessoa;

	@Column(name = "valor_financeiro", nullable = false, precision = 24, scale = 2)
	private BigDecimal valorFinanceiro;

	public Desafio2(String idPessoa, String nomePessoa, BigDecimal valorFinanceiro) {
		super();
		this.idPessoa = idPessoa;
		this.nomePessoa = nomePessoa;
		this.valorFinanceiro = valorFinanceiro;
	}

	public Desafio2() {
		super();
	}

	public Desafio2(String valorFinanceiro) {

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

	public int getIdDesafio2() {
		return idDesafio2;
	}

	public void setIdDesafio2(int idDesafio2) {
		this.idDesafio2 = idDesafio2;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
