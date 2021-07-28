
public class Sessao{
	private int lugaresOcupados = 0;
	private String horaInicio;
	private Sala sala;
	
	/**
	 * permite visualizar o número de lugares ocupados na sala
	 * @return número de lugares ocupados
	 */
	public int getLugaresOcupados() {return this.lugaresOcupados;}
	/**
	 * permite visuzalizar a hora de início do filme nesta sessão
	 * @return hora de início do filme
	 */
	public String getHoraInicio() {return this.horaInicio;}
	/**
	 * permite atualizar o número de lugares ocupados
	 * @param número de lugares ocupados
	 */
	public void setLugaresOcupados(int lugaresOcupados) { this.lugaresOcupados = lugaresOcupados;}

	/**
	 * permite criar uma nova sessão com hora de início e nome da sala
	 * @param hora de início do filme
	 * @param nome da sala
	 */
	public Sessao(String horaInicio, Sala sala) {
		this.sala = sala;
		this.horaInicio = horaInicio;
	}
	
	/**
	 * permite verificar se ainda existem lugares disponíveis na sessão
	 * @return verdadeiro, se existirem lugares disponível; falso, se não existirem lugares disponíveis
	 */
	public boolean acessibilidadeDaSessao() {
		if(this.sala.getLugaresTotais() - this.lugaresOcupados == 0) 
			return true;
		return false;
	}
	
	/**
	 * permite marcar um lugar na sessão se esta ainda tiver lugares vazios
	 */
	public void marcarAssento() {
		if(this.acessibilidadeDaSessao())
			this.lugaresOcupados++;
	}
	
	/**
	 * permite apresentar todos os atributos da sessao
	 */
	public String toString() {
		return "Sessao [horaInicio=" + this.horaInicio + ", sala=" + this.sala.getNomeSala() + "]";
	}
}
