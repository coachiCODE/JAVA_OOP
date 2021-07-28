
public class Bilhete{
	private double preco = 7.5;
	//private String classificacao = "normal";
	private Sessao sessao;
	
	/**
	 * 
	 * @return
	 */
	public double getPreco() {return this.preco;}
	//public String getClassificacao() {return this.classificacao;}
	public Sessao getSessao() {return this.sessao;}
	
	public Bilhete() {
		sessao.setLugaresOcupados(sessao.getLugaresOcupados() + 1);
	}
	
	public Bilhete(Sessao sessao) {
		this.sessao = sessao;
		sessao.setLugaresOcupados(sessao.getLugaresOcupados() + 1);
	}
		
	public String toString() {
		return "Bilhete [preco=" + this.preco + ", sessao=" + this.sessao + "]";
	}
}
