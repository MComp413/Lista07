package EP;

public class Missao {
	private String objetivo;
	private Planeta local;
	private int data;
	
	public String getObjetivo() {
		return objetivo;
	}
	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}
	public Planeta getLocal() {
		return local;
	}
	public void setLocal(Planeta local) {
		this.local = local;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
}
