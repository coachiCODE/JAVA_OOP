
public class BilheteEstudante extends Bilhete{
	private static double preco = 6;	
	
	public double getPreco() {return BilheteEstudante.preco;}
	
	public BilheteEstudante(Sessao sessao) {
		super(sessao);
		sessao.setLugaresOcupados(sessao.getLugaresOcupados() + 1);
	}
	
	
	public String toString() {
		return "BilheteCrianca [preco=" + preco + ", sessao=" + super.getSessao() + "]";
	}
}