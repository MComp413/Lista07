package EP;

public class Sistema {
	private String nome;
	private Planeta[] planetas = new Planeta[10];
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Planeta[] getPlanetas() {
		return planetas;
	}
	public void setPlanetas(Planeta[] planetas) {
		this.planetas = planetas;
	}
}
