package EP;

public class Batalha {
	public Mestre mestre = new Mestre ("Obi-wan", 67);
	public Lorde lorde = new Lorde ("Darth Anakinho", 43);
	private Habilidade[] combatLog = new Habilidade[1000];
	private Ser[] agente = new Ser[1000];
	private int atual = 0, proxima = 0;
	
	public void addHabilidade(Habilidade a, Ser s) {
		if(atual >= combatLog.length)
			return;
		combatLog[atual++] = a;
		agente[atual++] = s;
	}
	
	public Habilidade proximaHabilidade() {
		if((proxima % combatLog.length) == 0) {
			this.fim();
			return null;
		}
		else {
			atual = atual++;
			proxima = atual++;
			return combatLog[atual];
		}
	}
	
	public void processarHabilidade(Habilidade h, Ser s) {
		if(s == lorde) {
			if(h == lorde.esquiva) {
				lorde.setEsquivo(true);
			} else if(h.getTipo() == "force") {
				mestre.setHP(mestre.getHP() - (lorde.getPercentualRaiva()+1)/200 * h.getBaseDmg());
				if(mestre.isEsquivo())
					mestre.setEsquivo(false);
			} else if(h.getTipo() == "saber") {
				if(mestre.isEsquivo())
					mestre.setHP(mestre.getHP() - (lorde.getPercentualRaiva()+1)/200 * h.getBaseDmg());
			}
		} else 
			if(h == mestre.esquiva) {
				mestre.setEsquivo(true);
			} else if(h.getTipo() == "force") {
				lorde.setHP(lorde.getHP() - (mestre.getPercentualPaz()+1)/200 * h.getBaseDmg());
				if(lorde.isEsquivo())
					lorde.setEsquivo(false);
			} else if(h.getTipo() == "saber") {
				if(lorde.isEsquivo())
					lorde.setHP(lorde.getHP() - (mestre.getPercentualPaz()+1)/200 * h.getBaseDmg());
			}
	}
	
	public void fim() {
		if(lorde.getHP() > mestre.getHP()){
			System.out.println("ih parabens o lado dark ganhou");
		} else if (mestre.getHP() > lorde.getHP()) {
			System.out.println("olha só os jedis ganharam, mto bem parabens herois");
		} else {
			System.out.println("Empatchy, aguarde a disney lancar o proximo filme");
		}
	}
	
	public Habilidade[] getCombatLog() {
		return combatLog;
	}
	public void setCombatLog(Habilidade[] combatLog) {
		this.combatLog = combatLog;
	}

}
