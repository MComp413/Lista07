package EP;

public class Mestre extends Jedi{
	private boolean esquivo;
	private boolean videncia;
	private boolean imortalidade;
	public Habilidade forcePush = new Habilidade("force push", "force", 8.0, 4);
	public Habilidade saberSlash = new Habilidade("saber slash", "saber", 12, 2);
	public Habilidade hurlSaber = new Habilidade("hurl saber", "force", 16, 4);
	public Habilidade counterattack = new Habilidade("counterattack", "saber", 5.0, 2);
	public Habilidade esquiva = new Habilidade("esquiva", "force", 0, 0);
	private Habilidade[] prioridades = {hurlSaber, forcePush, saberSlash, counterattack};
	
	Mestre(String nome, double percentualPaz){
		this.setNome(nome);
		this.setPercentualPaz(percentualPaz);
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
	public boolean isVidencia() {
		return videncia;
	}
	public void setVidencia(boolean videncia) {
		this.videncia = videncia;
	}
	public boolean isImortalidade() {
		return imortalidade;
	}
	public void setImortalidade(boolean imortalidade) {
		this.imortalidade = imortalidade;
	}
}
