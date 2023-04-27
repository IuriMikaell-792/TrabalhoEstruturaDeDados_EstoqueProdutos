package SistemaGerenciamentoEstoque;

public class Produto implements Comparable {
	private String codigo;
	private String nome;
	private double preco;
	private int quantidade;
	private static String tipo;

	public Produto(String codigo, String nome, double preco, int quantidade) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public static String getTipo() {
		return tipo;
	}
	public static void setTipo(String t) {
		tipo = t;
	}
	
	

	@Override
	public String toString() {
		return "\nCodigo = " + codigo + " \nNome = " + nome + "\nPreço = " + preco + "\nQuantidade = " + quantidade + "\n";
	}

	@Override
	public int compareTo(Object o) {
		Produto p = (Produto)o;
		if(getTipo().equals("nome")) {
			return this.nome.compareTo(p.nome);
		} 
		else if(getTipo().equals("codigo")) {
			return this.codigo.compareTo(p.codigo);
		}
		else if(getTipo().equals("quantidade")) {
			return this.quantidade - p.quantidade;
		}
		else {
			if (this.preco < p.preco) {
				return -1;
			}
			else if (this.preco > p.preco) {
				return 1;
			}
			return 0;
		}
	}
 
}