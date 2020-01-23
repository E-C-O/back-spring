package br.com.eco.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import br.com.eco.app.model.Produto;
import br.com.eco.app.service.ProdutoService;

public class ProdutoServiceImpl implements ProdutoService{

	static List<Produto> produtos = new ArrayList<Produto>();
	private static int incrmt = 0;
	
	
	@Override
	public Produto insert (Produto produto) {
		incrmt++;
		produto.setIdProduto(incrmt);
		ProdutoServiceImpl.produtos.add(produto);
		return produto;
	}
	
	@Override
	public Produto update (Produto produto) {
		Produto aux = getById(produto.getIdProduto());
		
		if (aux != null) {
			aux.setTitulo(produto.getTitulo());
			aux.setDetalhes(produto.getDetalhes());
			aux.setLinkfoto(produto.getLinkfoto());
			aux.setPreco(produto.getPreco());
			aux.setQtdEstoque(produto.getQtdEstoque());
		}
		return aux;
	}
	
		@Override
	public Produto getById (int idProduto) {
		for (Produto produto : produtos) {
			if (produto.getIdProduto() == idProduto) {
				return produto;
			}
			
		}
		return null;
	}
	
	@Override
	public List<Produto> getAll() {
		return produtos;
	}
}

