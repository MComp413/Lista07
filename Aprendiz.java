package EP;

public class Aprendiz extends Sith {
	private Lorde mentor;
	private boolean conhecimentoConstrSabre;
	
	public Lorde getMentor() {
		return mentor;
	}
	public void setMentor(Lorde mentor) {
		this.mentor = mentor;
	}
	public boolean isConhecimentoConstrSabre() {
		return conhecimentoConstrSabre;
	}
	public void setConhecimentoConstrSabre(boolean conhecimentoConstrSabre) {
		this.conhecimentoConstrSabre = conhecimentoConstrSabre;
	}
}
