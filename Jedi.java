package EP;

public class Jedi extends Ser {
	private int percentualPaz;
	private Sabre sabre;
	private String[] poderes = new String[10];
	
	public Sabre getSabre() {
		return sabre;
	}
	public void setSabre(Sabre sabre) {
		this.sabre = sabre;
	}
	public String[] getPoderes() {
		return poderes;
	}
	public void setPoderes(String[] poderes) {
		this.poderes = poderes;
	}
	public int getPercentualPaz() {
		return percentualPaz;
	}
	public void setPercentualPaz(int percentualPaz) {
		this.percentualPaz = percentualPaz;
	}
	
}
