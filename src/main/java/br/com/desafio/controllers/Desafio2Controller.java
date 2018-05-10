package br.com.desafio.controllers;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.desafio.model.Desafio2;
import br.com.desafio.repository.Desafio2Repository;

@Controller
public class Desafio2Controller {
	@Autowired
	Desafio2Repository desafio2Repository;

	@RequestMapping("/desafio/desafio2")
	public String criarPessoas() {

		System.out.println("Iniciando desafio 2");
		/* Pessoa 1 */
		Desafio2 pessoa1 = new Desafio2();
		BigDecimal valorFinanceiroPessoa1 = new BigDecimal("134500.40");
		pessoa1.setNomePessoa("JAMES SMITH                            ");
		pessoa1.setIdPessoa("0001");
		pessoa1.setValorFinanceiro(valorFinanceiroPessoa1);

		/* Pessoa 2 */
		Desafio2 pessoa2 = new Desafio2();
		BigDecimal valorFinanceiroPessoa2 = new BigDecimal("1400000.00");
		pessoa2.setNomePessoa("CONSTANCE WILLARD                      ");
		pessoa2.setIdPessoa("0002");
		pessoa2.setValorFinanceiro(valorFinanceiroPessoa2);

		/* Pessoa 3 */
		Desafio2 pessoa3 = new Desafio2();
		BigDecimal valorFinanceiroPessoa3 = new BigDecimal("75499.30");
		pessoa3.setNomePessoa("WILLIAM H GREEN                        ");

		pessoa3.setIdPessoa("0003");
		pessoa3.setValorFinanceiro(valorFinanceiroPessoa3);

		/* Pessoa 4 */
		Desafio2 pessoa4 = new Desafio2();
		BigDecimal valorFinanceiroPessoa4 = new BigDecimal("500.00");
		pessoa4.setNomePessoa("JOHN WAYNE                             ");

		pessoa4.setIdPessoa("0004");
		pessoa4.setValorFinanceiro(valorFinanceiroPessoa4);

		/* Pessoa 5 */
		Desafio2 pessoa5 = new Desafio2();
		BigDecimal valorFinanceiroPessoa5 = new BigDecimal("0.00");
		pessoa5.setNomePessoa("LOUIS J HARLEY                         ");
		pessoa5.setIdPessoa("0005");
		pessoa5.setValorFinanceiro(valorFinanceiroPessoa5);

		/* Pessoa 6 */
		Desafio2 pessoa6 = new Desafio2();
		BigDecimal valorFinanceiroPessoa6 = new BigDecimal("0.55");
		pessoa6.setNomePessoa("MARGARETH WHITE                        ");
		pessoa6.setIdPessoa("0006");
		pessoa6.setValorFinanceiro(valorFinanceiroPessoa6);

		/* Pessoa 7 */
		Desafio2 pessoa7 = new Desafio2();
		BigDecimal valorFinanceiroPessoa7 = new BigDecimal("800000.00");
		pessoa7.setNomePessoa("ALAN WALKER                            ");
		pessoa7.setIdPessoa("0007");
		pessoa7.setValorFinanceiro(valorFinanceiroPessoa7);

		/* Pessoa 8 */
		Desafio2 pessoa8 = new Desafio2();
		BigDecimal valorFinanceiroPessoa8 = new BigDecimal("40560.47");
		pessoa8.setNomePessoa("CHRIS JAMES                            ");
		pessoa8.setIdPessoa("0008");
		pessoa8.setValorFinanceiro(valorFinanceiroPessoa8);

		/* Pessoa 9 */
		Desafio2 pessoa9 = new Desafio2();
		BigDecimal valorFinanceiroPessoa9 = new BigDecimal("1809700.19");
		pessoa9.setNomePessoa("MIKE THOMAS                            ");
		pessoa9.setIdPessoa("0009");
		pessoa9.setValorFinanceiro(valorFinanceiroPessoa9);

		/* Pessoa 10 */
		Desafio2 pessoa10 = new Desafio2();
		BigDecimal valorFinanceiroPessoa10 = new BigDecimal("199.23");
		pessoa10.setNomePessoa("STEVE ULRICH                           ");
		pessoa10.setIdPessoa("0010");
		pessoa10.setValorFinanceiro(valorFinanceiroPessoa10);

		desafio2Repository.save(pessoa1);
		desafio2Repository.save(pessoa2);
		desafio2Repository.save(pessoa3);
		desafio2Repository.save(pessoa4);
		desafio2Repository.save(pessoa5);
		desafio2Repository.save(pessoa6);
		desafio2Repository.save(pessoa7);
		desafio2Repository.save(pessoa8);
		desafio2Repository.save(pessoa9);
		desafio2Repository.save(pessoa10);

		String posicao5a26 = "0000000000000000000000";
		String posicao66a106 = "00000000000000000000000000000000000000000";
		String posicao131a177 = "0000000000000000000000000000000000000000000000";

		try {
			FileWriter writer = new FileWriter("RM0002.txt", true);
			BufferedWriter bufferedWriter = new BufferedWriter(writer);

			List<Desafio2> desafio2Lista = desafio2Repository.findAll();

			for (Desafio2 desafio2 : desafio2Lista) {
				System.out.println(desafio2.getNomePessoa() + desafio2.getValorFinanceiro() + desafio2.getIdPessoa());
				StringBuilder linha = new StringBuilder();
				StringBuilder zeros = new StringBuilder();
				linha.append(desafio2.getIdPessoa());
				linha.append(posicao5a26);
				linha.append(desafio2.getNomePessoa());
				linha.append(posicao66a106);
				int preencherEspaco = 23 - desafio2.getValorFinanceiro().toString().length();

				for (int i = 0; i < preencherEspaco; i++) {
					zeros.append("0");
				}

				linha.append(zeros);
				linha.append(desafio2.getValorFinanceiro().toString().replace(".", ""));
				linha.append(posicao131a177);

				bufferedWriter.write(linha.toString());
				bufferedWriter.newLine();

			}
			bufferedWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Fim Desafio 2");
		return "home/desafio2ok";
	}

}
