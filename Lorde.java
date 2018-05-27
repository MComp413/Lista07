package EP;

public class Lorde extends Sith{
	private Aprendiz pupilo;
	private boolean esquivo;
	public Habilidade forceChoke = new Habilidade("force choke", "force", 10.0, 6);
	public Habilidade saberSlash = new Habilidade("saber slash", "saber", 14.0, 2);
	public Habilidade forceShock = new Habilidade("force shock", "force", 12.0, 4);
	public Habilidade counterattack = new Habilidade("counterattack", "saber", 5.0, 2);
	public Habilidade esquiva = new Habilidade("esquiva", "force", 0, 0);
	private Habilidade[] prioridades = {forceShock, forceChoke, saberSlash, counterattack};
	
	Lorde(String nome, double percentualRaiva){
		this.setNome(nome);
		this.setPercentualRaiva(percentualRaiva);
		this.setHP(100.0);
	}
	
	public Habilidade[] getHabilidades() {
		return prioridades;
	}
	public void setPrioridades(Habilidade[] prioridades) {
		this.prioridades = prioridades;
	}
	public Habilidade usarHabilidade() {
		int i = 0;
		while (i < this.prioridades.length && this.prioridades[i].getCoolOff() > 0)
			i++;
		this.prioridades[i].setCoolOff(this.prioridades[i].getCooldown());
		return this.prioridades[i];
	}
	public boolean isEsquivo() {
		return esquivo;
	}
	public void setEsquivo(boolean esquivo) {
		this.esquivo = esquivo;
	}
	
	public Aprendiz getPupilo() {
		return pupilo;
	}
	public void setPupilo(Aprendiz pupilo) {
		this.pupilo = pupilo;
	}
}
