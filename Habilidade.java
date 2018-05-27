package EP;

public class Habilidade {
	private boolean ready;
	private final String tipo;
	private String nome;
	private double baseDmg;
	private String descricao;
	private int cooldown;
	private int coolOff = 0;
	
	Habilidade(String nome, String tipo, double baseDmg, int cooldown){
		this.setCooldown(cooldown);
		this.tipo = tipo;
		this.setNome(nome);
		this.setBaseDmg(baseDmg);
	}
	
	public boolean isReady() {
		return (this.coolOff == 0);
	}
	public boolean getReady() {
		return ready;
	}
	
	public int getCoolOff() {
		return coolOff;
	}
	public void reduzCoolOff() {
		if (this.coolOff > 0)
			this.coolOff = this.coolOff - 1;
	}
	public void setCoolOff(int co) {
		this.coolOff = co;
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
	public int getCooldown() {
		return cooldown;
	}
	public void setCooldown(int cooldown) {
		this.cooldown = cooldown;
	}
}
