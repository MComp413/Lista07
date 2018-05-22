package EP;

public class SistemaPolitico {
	private String nome;
	private String capital;
	private String lider;
	private int dataInicio, dataFim;
	private Planeta[] domínio = new Planeta[100];
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public String getLider() {
		return lider;
	}
	public void setLider(String lider) {
		this.lider = lider;
	}
	public Planeta[] getDomínio() {
		return domínio;
	}
	public void setDomínio(Planeta[] domínio) {
		this.domínio = domínio;
	}
	public int getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(int dataInicio) {
		this.dataInicio = dataInicio;
	}
	public int getDataFim() {
		return dataFim;
	}
	public void setDataFim(int dataFim) {
		this.dataFim = dataFim;
	}
}
