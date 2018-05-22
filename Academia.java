package EP;

public class Academia {
	private Planeta planeta = new Planeta();
	private String alinhamento;
	private Conselho conselho = new Conselho();
	
	public Planeta getPlaneta() {
		return planeta;
	}
	public void setPlaneta(Planeta planeta) {
		this.planeta = planeta;
	}
	public String getAlinhamento() {
		return alinhamento;
	}
	public void setAlinhamento(String alinhamento) {
		this.alinhamento = alinhamento;
	}
	public Conselho getConselho() {
		return conselho;
	}
	public void setConselho(Conselho conselho) {
		this.conselho = conselho;
	}
}
