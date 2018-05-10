package br.com.desafio.controllers;

import java.io.IOException;
import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.desafio.model.Desafio1;
import br.com.desafio.repository.Desafio1Repository;
import br.com.desafio.util.ReadFile;

@Controller
public class Desafio1Controller {
	@Autowired
	Desafio1Repository desafio1Repository;


	@RequestMapping("/desafio/desafio1")
	public String LerArquivo() {
		System.out.println("Inicio Desafio 1");

		ReadFile rf = new ReadFile();
		String arquivo = "RM0001.TXT";
		String idPessoa = new String();
		String nomePessoa = new String();
		String valorFinanceiro = new String();

		/*
		 * Posição de 1 a 4 "código sequencial do arquivo"(tamanho 4). Posição de 27 a
		 * 65 "nome da pessoa"(tamanho 39). Posição de 107 a 130
		 * "valor financeiro"(tamanho 22).
		 * 
		 **/

		try {
			String[] lines = rf.readLines(arquivo);
			for (String line : lines) {

				idPessoa = line.substring(0, 4);
				nomePessoa = line.substring(26, 65);
				valorFinanceiro = line.substring(106, 130);

				valorFinanceiro = new StringBuilder(valorFinanceiro).insert(valorFinanceiro.length() - 2, ".")
						.toString();

				BigDecimal valorFinanceiroBD = new BigDecimal(valorFinanceiro);

				Desafio1 desafio1 = new Desafio1();
				desafio1.setIdPessoa(idPessoa);
				desafio1.setNomePessoa(nomePessoa);
				desafio1.setValorFinanceiro(valorFinanceiroBD);

				desafio1Repository.save(desafio1);

			}

		} catch (IOException e) {
			System.out.println("Erro ao Ler arquivo: " + arquivo + ": " + e.getMessage());
		}

		System.out.println("Fim desafio 1");

		return "home/desafio1ok";
	}
}
