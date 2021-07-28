
public class Sala{
	private String nomeSala;
	private int lugaresTotais;
	private Filme filme;
	
	/**
	 * permite visualizar o nome da sala
	 * @return nome da sala
	 */
	public String getNomeSala() {return this.nomeSala;}
	/**
	 * permite visualizar os lugares totais da sala
	 * @return número de lugares totais da sala
	 */
	public int getLugaresTotais() {return this.lugaresTotais;}
	/**
	 * permite visualizar o filme que será trasmitido na sala
	 * @return nome do filme transmitido na sala
	 */
	public Filme getFilme() {return this.filme; }
		
	/**
	 * permite criar uma nova sala indicando o nome da sala, os lugares totais, e o filme que será transmitido
	 * @param nome da sala
	 * @param número de lugares totais da sala
	 * @param nome do filme
	 */
	public Sala(String nomeSala, int lugaresTotais, Filme filme) {
		this.filme = filme;
		this.nomeSala = nomeSala;
		this.lugaresTotais = lugaresTotais;
	}
	
	/**
	 * permite criar uma nova sala
	 * @param nome da sala 
	 * @param número de lugares totais
	 */
	public Sala(String nomeSala, int lugaresTotais) {
		this.nomeSala = nomeSala;
		this.lugaresTotais = lugaresTotais;
	}
	
	/**
	 * permite definir o filme a ser transmitido na sala
	 * @param nome do filme
	 */
	public void definirFilme(Filme filme) {
		this.filme = filme;
	}
	
	/**
	 * permite apresentar todos os atributos da sala
	 */
	public String toString() {
		return "Sala [nomeSala=" + this.nomeSala + ", lugaresTotais=" + this.lugaresTotais + ", filme=" + this.filme + "]";
	}
}
