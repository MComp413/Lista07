package EP;

public class Habilidade extends Acao{
	private final String tipo;
	private String nome;
	private double baseDmg;
	private String descricao;
	private long cooldown;
	private long coolOff = 0;
	
	Habilidade(String nome, String tipo, double baseDmg, long cooldown){
		this.setCooldown(cooldown);
		this.tipo = tipo;
		this.setNome(nome);
		this.setBaseDmg(baseDmg);
	}
	
	public boolean isReady() {
		return System.currentTimeMillis() >= coolOff;
	}
	
	public long getCoolOff() {
		return coolOff;
	}
	public void setCoolOff() {
		this.coolOff = cooldown + System.currentTimeMillis();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getBaseDmg() {
		return baseDmg;
	}
	public void setBaseDmg(double baseDmg) {
		this.baseDmg = baseDmg;
	}
	public String getTipo() {
		return tipo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public long getCooldown() {
		return cooldown;
	}
	public void setCooldown(long cooldown) {
		this.cooldown = cooldown;
	}
}
