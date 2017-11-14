import java.util.List;
import java.util.Scanner;

public class Vendas {

	/*
	 * acho que talvez n�o tenha necessidade de ter uma lista de produtos
	 *
	 */
	
	private String data; //ainda n�o usei essa vari�vel
	
	public void realizaVenda(List<Produto> produtos) {
		/*
		 * acho que esse m�todo realiza venda vai ser um dos principais m�todos porqu�
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
	 * acho que depois seria interessante fazer um m�todo que retorne a quantidade
	 * de vendas espec�fica de apenas um produto
	 */
	
	public void getVendas(List <Produto> produtos) {
		for (Produto p : produtos) {
			System.out.println(p.getNome() + " Quantidade vendida:" + p.getQuantidadeVendida());
		}
	}
}
