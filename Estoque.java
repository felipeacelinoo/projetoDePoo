import java.util.List;

public class Estoque {
	
	/*
	 * acho que � melhor trabalhar com List do que com Array
	 * al�m de ser mais f�cil de lidar, anula o m�todo alteraEstoque
	 * que iria dar um trabalho da porra pra redmensionar esse array na m�o
	 * 
	 * acho que n�o tem necessidade de fazer um getProduto() nem setProduto(); j� que existe cadastraNovoProduto();
	 */
	
	private List <Produto> produtos;
	
	public Estoque() {
		
	}
	
	public Estoque (List <Produto> produtos) {
		this.produtos = produtos;
	}
	
	public List<Produto> getProdutos() {
		return produtos;
	}
	
	public void cadastraNovoProduto(Produto produto) { 
		this.produtos.add(produto);
		System.out.println("Produto cadastrado!");
	}
	
	public void apagaProduto(int codigo) {
		for (Produto p : produtos) {
			if (p.getCodigo() == codigo) {
				produtos.remove(p);
				System.out.println("Produto removido!");
			}
		}
	}
	
	
	public void consultaEstoque(int codigo) {
		/*
		 * na uml esse m�todo t� boolean, mas achei melhor por void pra
		 * mostrar a quantidade
		 */
		for (Produto p : produtos) {
			if (p.getCodigo() == codigo) {
				p.getQuantidade();
			} else {
				System.out.println("Produto n�o existe!");
			}
		}
	}
	
}
