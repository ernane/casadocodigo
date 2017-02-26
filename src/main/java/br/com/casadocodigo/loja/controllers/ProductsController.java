package br.com.casadocodigo.loja.controllers;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.casadocodigo.loja.models.Product;

@Controller
public class ProductsController {

	private static final Logger logger = Logger.getLogger(ProductsController.class);
	
	@RequestMapping("/produtos")
	public String save(Product product) {
		System.out.println("Cadastro de produto" + product);
		return "procuts/ok";
	}

	@RequestMapping("/produtos/form")
	public String form() {
		// logs debug message
		if (logger.isDebugEnabled()) {
			logger.debug("getWelcome is executed!");
		}

		// logs exception
		logger.error("This is Error message");
		return ("products/form");
	}
}
