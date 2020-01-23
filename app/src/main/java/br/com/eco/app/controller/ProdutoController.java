package br.com.eco.app.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.eco.app.model.Produto;
import br.com.eco.app.service.ProdutoService;
import br.com.eco.app.service.impl.ProdutoServiceImpl;

@CrossOrigin("*")
@RestController
public class ProdutoController {

ProdutoService produtoService = new ProdutoServiceImpl();  
	
	@GetMapping("/produto")
	public List<Produto> getAll(){
		return produtoService.getAll();
	}
	
	@GetMapping("/produto/{idProduto}")
	public ResponseEntity<Produto> getById(@PathVariable int idProduto) {
		Produto produto = produtoService.getById(idProduto);
		
		if(produto == null)
			ResponseEntity.notFound();
		
		return ResponseEntity.ok(produto);
	}
	
	@PostMapping("/produto")
	public ResponseEntity<Produto> insert(@RequestBody Produto produto) {
			
		return ResponseEntity.ok(produtoService.insert(produto));
	}
	
	@PutMapping("/produto")
	public Produto alterar(@RequestBody Produto produto) {
		produtoService.update(produto);
		return produto;
	}
	
}
