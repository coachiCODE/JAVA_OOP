
public class Filme {
	private String nomeFilme = "Não definido";
	private int duracao = 0;
	
	/**
	 * permite visualizar o nome do filme
	 * @return nome do filme
	 */
	public String getNomeFilme() {return this.nomeFilme;}
	/**
	 * permite visualizar a duração do filme
	 * @return minutos de duração do filme
	 */
	public int getDuracao() {return this.duracao;}
		
	/**
	 * permite criar um novo filme
	 * @param nome do filme
	 * @param minutos de duração do filme
	 */
	public Filme(String filme, int duracao) {
		this.nomeFilme = filme;
		this.duracao = duracao;
	}
	
	/**
	 * permite apresentar todos os atributos do filme
	 */
	public String toString() {
		return "Filme [filme=" + this.nomeFilme + ", duracao=" + this.duracao + "]";
	}
	
	
}
