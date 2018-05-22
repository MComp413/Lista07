package EP;

public class Sith extends Ser{
	private int percentualRaiva;
	private Sabre sabre;
	private String[] poderes = new String[10];
	private String nomeSith;
	
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
	public int getPercentualRaiva() {
		return percentualRaiva;
	}
	public void setPercentualRaiva(int percentualRaiva) {
		this.percentualRaiva = percentualRaiva;
	}
	public String getNomeSith() {
		return nomeSith;
	}
	public void setNomeSith(String nomeSith) {
		this.nomeSith = nomeSith;
	}
}
