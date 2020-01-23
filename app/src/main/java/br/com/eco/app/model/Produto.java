package br.com.eco.app.model;

public class Produto {

	private int idProduto;
	private String titulo;
	private String detalhes;
	private String linkfoto;
	private float preco;
	private int qtdEstoque;

	public Produto() {
		super();
	}

	public Produto(int idProduto, String titulo, String detalhes, String linkfoto, float preco, int qtdEstoque) {
		super();
		this.idProduto = idProduto;
		this.titulo = titulo;
		this.detalhes = detalhes;
		this.linkfoto = linkfoto;
		this.preco = preco;
		this.qtdEstoque = qtdEstoque;
	}

	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDetalhes() {
		return detalhes;
	}

	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}

	public String getLinkfoto() {
		return linkfoto;
	}

	public void setLinkfoto(String linkfoto) {
		this.linkfoto = linkfoto;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}
	
	

}
