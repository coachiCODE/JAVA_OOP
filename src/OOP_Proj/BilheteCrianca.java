
public class BilheteCrianca extends Bilhete{
	private static double preco = 5;
	
	/**
	 * permite visualizar o preço do bilhete de criança
	 * @return perço do bilhete
	 */
	public double getPreco() {return BilheteCrianca.preco;}
	
	public BilheteCrianca(Sessao sessao) {
		super(sessao);
		sessao.setLugaresOcupados(sessao.getLugaresOcupados() + 1);
	}
	
	
	public String toString() {
		return "BilheteCrianca [preco=" + preco + ", sessao=" + super.getSessao() + "]";
	}
}
