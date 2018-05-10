
package br.com.desafio.controllers;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.desafio.model.Desafio1;
import br.com.desafio.repository.Desafio1Repository;

@RestController
public class Desafio4Controller {
	@Autowired
	Desafio1Repository desafio1Repository;

	@RequestMapping("/desafio/desafio4")
	public List<Desafio1> montarJson() {
		System.out.println("inicio desafio 4");

		ObjectMapper mapper = new ObjectMapper();
		List<Desafio1> lista = desafio1Repository.findAll();

		System.out.println(lista.size());

		try {
			mapper.writeValue(new File("pessoas.json"), lista);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("fim desafio 4");

		return lista;

	}

}
