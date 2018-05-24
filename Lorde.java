package EP;

public class Lorde extends Sith{
	private Aprendiz pupilo;
	private boolean esquivo;
	public Habilidade forceChoke = new Habilidade("force choke", "force", 10, ((long)6.0));
	public Habilidade saberSlash = new Habilidade("saber slash", "saber", 14, ((long)2.0));
	public Habilidade forceShock = new Habilidade("force shock", "force", 12, ((long)5.0));
	public Habilidade counterattack = new Habilidade("counterattack", "saber", 5.0, ((long)1.0));
	public Habilidade esquiva = new Habilidade("esquiva", "force", 0, ((long)2.5));
	private Habilidade[] prioridades = {esquiva, forceShock, forceChoke, saberSlash, counterattack};
	
	Lorde(String nome, int percentualRaiva){
		this.setNome(nome);
		this.setPercentualRaiva(percentualRaiva);
	}
	
	public void setPrioridades(Habilidade[] prioridades) {
		this.prioridades = prioridades;
	}
	public Habilidade usarHabilidade() {
		return this.prioridades[0];
	}
	public boolean isEsquivo() {
		return esquivo;
	}
	public void setEsquivo(boolean esquivo) {
		this.esquivo = esquivo;
		if(!esquivo) {
			Habilidade[] p = {counterattack, esquiva, forceShock, forceChoke, saberSlash};
			setPrioridades(p);
		} else {
			Habilidade[] p = {forceShock, forceChoke, saberSlash, counterattack, esquiva};
			setPrioridades(p);
		}
	}
	
	
	public Aprendiz getPupilo() {
		return pupilo;
	}
	public void setPupilo(Aprendiz pupilo) {
		this.pupilo = pupilo;
	}
}
