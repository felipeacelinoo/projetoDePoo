
public class Produto {
	
	private int codigo;
	private String nome;
	private double preco;
	private int quantidade;
	private int quantidadeVendida; //adicionei essa variável pra poder usar no getVendas() na classe Vendas
	
	
	public Produto (int codigo, String nome, double preco, int quantidade) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
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

	public int getQuantidadeVendida() {
		return quantidadeVendida;
	}

	public void setQuantidadeVendida(int quantidadeVendida) {
		this.quantidade -= quantidadeVendida; //depois tem que ter quidado pra quantidade não ficar negativa
		this.quantidadeVendida = quantidadeVendida;
	}
	
	

}
