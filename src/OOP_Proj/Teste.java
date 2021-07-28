
public class Teste {

	public static void main(String[] args) {
		
		Filme filme1 = new Filme("Pulp Fiction", 86);
		Filme filme2 = new Filme("Kill Bill", 128);
		Filme filme3 = new Filme("Reservoir Dogs", 99);
		Filme filme4 = new Filme("Inglourious Bastards", 90);
		Filme filme5 = new Filme("The Hateful Eight", 96);
		Filme filme6 = new Filme("Django Unchained", 122);
		
		Sala sala1 = new Sala("Sala 1", 120, filme1);
		Sala sala2 = new Sala("Sala 2", 100, filme2);
		Sala sala3 = new Sala("Sala 3", 75, filme3);
		Sala sala4 = new Sala("Sala 4", 99, filme4);
		Sala sala5 = new Sala("Sala 5", 49, filme5);
		Sala sala6 = new Sala("Sala 6", 120, filme6);
		System.out.println(sala6.toString());
		sala6.definirFilme(filme6);
		System.out.println(sala6.toString());
		
		Sessao sessao11 = new Sessao("13:50", sala1);
		Sessao sessao12 = new Sessao("16:10", sala1);
		Sessao sessao13 = new Sessao("18:20", sala1);
		Sessao sessao21 = new Sessao("14:30", sala2);
		Sessao sessao22 = new Sessao("17:40", sala2);
		Sessao sessao23 = new Sessao("21:10", sala2);
		Sessao sessao24 = new Sessao("00:20", sala2);
		Sessao sessao31 = new Sessao("20:50", sala3);
		Sessao sessao32 = new Sessao("23:40", sala3);
		Sessao sessao41 = new Sessao("14:00", sala4);
		Sessao sessao42 = new Sessao("16:20", sala4);
		Sessao sessao43 = new Sessao("18:40", sala4);
		Sessao sessao44 = new Sessao("21:00", sala4);
		Sessao sessao45 = new Sessao("23:50", sala4);
		Sessao sessao51 = new Sessao("14:20", sala5);
		Sessao sessao52 = new Sessao("16:40", sala5);
		Sessao sessao53 = new Sessao("19:10", sala5);
		Sessao sessao54 = new Sessao("21:30", sala5);
		Sessao sessao55 = new Sessao("24:00", sala5);
		Sessao sessao61 = new Sessao("14:10", sala6);
		Sessao sessao62 = new Sessao("17:50", sala6);
		Sessao sessao63 = new Sessao("21:20", sala6);
		Sessao sessao64 = new Sessao("00:30", sala6);
		
		System.out.println(sessao22);
		BilheteCrianca bilhete1 = new BilheteCrianca(sessao22); 
		BilheteEstudante ticket2 = new BilheteEstudante(sessao31);
		Bilhete ticket = new Bilhete(sessao11);
		System.out.println(sessao22);
		
	}

}
