package br.com.bookstrore.loja.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.bookstrore.loja.DAOs.ProdutoDAO;
import br.com.bookstrore.loja.models.Produto;

@Controller
public class ProdutosController {
	
	
	@Autowired
	private ProdutoDAO dao;

	@RequestMapping("/produtos/form")
	public String form() {
		return "produtos/form";
	}
	
	@RequestMapping("/produtos")
	public String gravar(Produto produto){
		System.out.println(produto);
		dao.gravar(produto);
		return "/produtos/ok";
	}
}
