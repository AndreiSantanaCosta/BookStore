package br.com.bookstrore.loja.DAOs;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.bookstrore.loja.models.Produto;

@Repository
@org.springframework.transaction.annotation.Transactional
public class ProdutoDAO {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void gravar(Produto produto) {
		manager.persist(produto);
	}

}
