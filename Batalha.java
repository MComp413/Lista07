package EP;

public class Batalha {
	private Mestre mestre;
	private Lorde lorde;
	private Acao[] batalha = new Acao[100];
	private int atual = 0, proxima = 0;
	
	public void addAcao(Acao a) {
		if(atual >= batalha.length)
			return;
		batalha[atual++] = a;
	}
	
	public Acao proximaAcao() {
		if((proxima % batalha.length) == 0) {
			this.fim();
			return null;
		}
		else {
			atual = atual++;
			proxima = atual++;
			return batalha[atual];
		}
	}
	
	public void fim() {
		if(lorde.getHP() > mestre.getHP()){
			System.out.println("ih parabens o lado dark ganhou 10000% edgy");
		} else if (mestre.getHP() > lorde.getHP()) {
			System.out.println("olha só os jedais ganharam mto bem parabens herois");
		} else {
			System.out.println("Empatchy, aguarde a disney lancar o proximo filme");
		}
	}
	public Acao[] getBatalha() {
		return batalha;
	}
	public void setBatalha(Acao[] batalha) {
		this.batalha = batalha;
	}

}
