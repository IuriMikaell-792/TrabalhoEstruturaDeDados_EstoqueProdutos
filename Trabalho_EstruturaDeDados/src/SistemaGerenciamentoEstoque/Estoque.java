package SistemaGerenciamentoEstoque;

import java.util.ArrayList;
import java.util.Collections;

public class Estoque {
	private ArrayList<Produto> produtos;

	public Estoque() {
		this.produtos = new ArrayList<Produto>();
	}

	public ArrayList<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}
	public void adicionaProduto(Produto produto) {
		produtos.add(produto);
	}

	
	//imprime lista original
	public void imprimeLista() {
		for(Produto p : getProdutos()) {
			System.out.println("Codigo: " + p.getCodigo() + "\nNome: " + p.getNome() 
								+ "\nPreço: " + p.getPreco() + "\nQuantidade: " + p.getQuantidade() + "\n");
		}
	}
	
	//função para ordenar lista
	private void ordenaLista() {
		Collections.sort(produtos);
		System.out.println(produtos.toString().replace("[", "").replace("]", "").replace(",", ""));
	}
	
	
	public void imprimeOrdNome() {
		Produto.setTipo("nome");
		ordenaLista();
	}
	
	public void imprimeOrdCodigo() {
		Produto.setTipo("codigo");
		ordenaLista();
	}
	
	public void imprimeOrdQuantidade() {
		Produto.setTipo("quantidade");
		ordenaLista();
	}
	
	public void imprimeOrdPreco() {
		Produto.setTipo("preco");
		ordenaLista();
	}
	
}