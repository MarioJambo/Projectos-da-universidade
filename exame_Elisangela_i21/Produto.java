
public class Produto {

	private double preco;
	private int quantidade;
	private int stock;
	
	public Produto(double preco, int quantidade, int stock) {
		super();
		this.preco = preco;
		this.quantidade = quantidade;
		this.stock = stock;
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

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Produto [preco=" + preco + ", quantidade=" + quantidade + ", stock=" + stock + "]";
	}	
	
}
