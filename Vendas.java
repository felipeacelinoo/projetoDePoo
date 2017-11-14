import java.util.List;
import java.util.Scanner;

public class Vendas {

	/*
	 * acho que talvez não tenha necessidade de ter uma lista de produtos
	 *
	 */
	
	private String data; //ainda não usei essa variável
	
	public void realizaVenda(List<Produto> produtos) {
		/*
		 * acho que esse método realiza venda vai ser um dos principais métodos porquê
		 * ele vai atualizar o estoque, e vai registrar as vendas
		 */
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite a quantidade que deseja vender");
		int quantidadeVendida = Integer.parseInt(scan.nextLine());
		
		for (Produto p : produtos) {
			Estoque e = new Estoque();
			e.apagaProduto(p.getCodigo());
			p.setQuantidadeVendida(quantidadeVendida);
		}
		scan.close();
	}
	
	/*
	 * acho que depois seria interessante fazer um método que retorne a quantidade
	 * de vendas específica de apenas um produto
	 */
	
	public void getVendas(List <Produto> produtos) {
		for (Produto p : produtos) {
			System.out.println(p.getNome() + " Quantidade vendida:" + p.getQuantidadeVendida());
		}
	}
}
