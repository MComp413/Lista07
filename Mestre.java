package EP;

public class Mestre extends Jedi{
	private boolean esquivo;
	private boolean videncia;
	private boolean imortalidade;
	public Habilidade forcePush = new Habilidade("force push", "force", 8.0, ((long)3.0));
	public Habilidade saberSlash = new Habilidade("saber slash", "saber", 12, ((long)2.0));
	public Habilidade hurlSaber = new Habilidade("hurl saber", "force", 16, ((long)3.0));
	public Habilidade counterattack = new Habilidade("counterattack", "saber", 5.0, ((long)1.0));
	public Habilidade esquiva = new Habilidade("esquiva", "force", 0, ((long)0.5));
	private Habilidade[] prioridades = {esquiva, hurlSaber, forcePush, saberSlash, counterattack,};
	
	Mestre(String nome, int percentualPaz){
		this.setNome(nome);
		this.setPercentualPaz(percentualPaz);
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
			Habilidade[] p = {counterattack, esquiva, hurlSaber, forcePush, saberSlash};
			setPrioridades(p);
		} else {
			Habilidade[] p = {hurlSaber, forcePush, saberSlash, counterattack, esquiva};
			setPrioridades(p);
		}
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
