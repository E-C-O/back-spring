package br.com.eco.app.service;

import java.util.List;

import br.com.eco.app.model.Produto;

public interface ProdutoService {

	Produto insert(Produto produto);
	
	Produto update(Produto produto);
	
	Produto getById(int idProduto);
	
	List<Produto> getAll();
}
