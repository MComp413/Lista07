package EP;

public class Batalha {
	public Mestre mestre = new Mestre ("Obi-wan", 67);
	public Lorde lorde = new Lorde ("Darth Anakinho", 43);
	private Habilidade[] combatLog = new Habilidade[1000];
	private Ser[] agente = new Ser[1000];
	private int atual = 0, proxima = 0;
	private double dano;
	private boolean acabou = false;
	private double chanceEsquivar;
	
	public void addHabilidade(Habilidade a, Ser s) {
		if(atual >= combatLog.length)
			return;
		combatLog[atual] = a;
		agente[atual] = s;
		atual =+ 1;
	}
	
	public Habilidade proximaHabilidade() {
		boolean looped = false;
		int start = proxima;
		while (combatLog[proxima] == null) {
			proxima = (proxima + 1) % combatLog.length;
			if (start == proxima)
				looped = true;
			if((proxima == (start + 1) % combatLog.length) && looped)
				return null;
		}
		return combatLog[proxima];
	}
	public void diminuiCoolOff() {
		for (int i = 0; i < lorde.getHabilidades().length; i++) {
		    lorde.getHabilidades()[i].reduzCoolOff();
		}
		for (int i = 0; i < mestre.getHabilidades().length; i++) {
		    mestre.getHabilidades()[i].reduzCoolOff();
		}
	}
	public void processarHabilidade(Habilidade h, Ser s) {
		if(s == lorde) {//lorde atacando
			if(h.getTipo() == "force") {
				if (mestre.isEsquivo())
					mestre.setEsquivo(false); //tira da esquiva
				dano = (lorde.getPercentualRaiva()+1)/200 * h.getBaseDmg();
				mestre.setHP(mestre.getHP() - dano);
				System.out.println("Mestre tomou " + dano + " de dano");
				if(mestre.getHP() <= 0)
					this.fim();
				if(mestre.isEsquivo())
					mestre.setEsquivo(false);
			} else if(h.getTipo() == "saber") {
				if(mestre.isEsquivo()){// se ja esta esquivo, tem chance de 60% de evitar o dano
					chanceEsquivar = Math.random();
					if (chanceEsquivar < 0.6)
						System.out.println("Mestre esquivou.");	
					else {
						dano = (lorde.getPercentualRaiva()+1)/200 * h.getBaseDmg();
						mestre.setHP(mestre.getHP() - dano);
						System.out.println("Mestre tomou " + dano + " de dano");
						if(mestre.getHP() <= 0)
							this.fim();
					}					
				}
				else { 
					//mestre nao esta no modo de esquiva ainda
					chanceEsquivar = Math.random();
					if (chanceEsquivar < 0.1) { //10% de chance de esquivar e ativar esquiva
						System.out.println("Mestre ativou sua esquiva.");
						mestre.setEsquivo(true);
					}
					else { //mestre nao esquivou
						System.out.println(mestre.getHP());
						dano = (lorde.getPercentualRaiva()+1)/200 * h.getBaseDmg();
						mestre.setHP(mestre.getHP() - dano);
						System.out.println("Mestre tomou " + dano + " de dano");
						if(mestre.getHP() <= 0)
							this.fim();
					}
				}
			}
		} else {//mestre atacando
			if(h.getTipo() == "force") {
				if (lorde.isEsquivo())
					lorde.setEsquivo(false); //tira da esquiva
				dano = (mestre.getPercentualPaz()+1)/200 * h.getBaseDmg();
				lorde.setHP(lorde.getHP() - dano);
				System.out.println("Lorde tomou " + dano + " de dano");
				if(lorde.getHP() <= 0)
					this.fim();
				if(lorde.isEsquivo())
					lorde.setEsquivo(false);
			} else if(h.getTipo() == "saber") {
				if(lorde.isEsquivo()){// se ja esta esquivo, tem chance de 60% de evitar o dano
					chanceEsquivar = Math.random();
					if (chanceEsquivar < 0.6)
						System.out.println("Lorde esquivou.");	
					else {
						dano = (mestre.getPercentualPaz()+1)/200 * h.getBaseDmg();
						lorde.setHP(lorde.getHP() - dano);
						System.out.println("Lorde tomou " + dano + " de dano");
						if(lorde.getHP() <= 0)
							this.fim();
					}					
				}
				else { //lorde nao esta no modo de esquiva ainda
					chanceEsquivar = Math.random();
					if (chanceEsquivar < 0.1) { //10% de chance de esquivar e ativar esquiva
						System.out.println("Lorde ativou sua esquiva.");
						lorde.setEsquivo(true);
					}
					else { //lorde nao esquivou
						dano = (mestre.getPercentualPaz()+1)/200 * h.getBaseDmg();
						lorde.setHP(lorde.getHP() - dano);
						System.out.println("Lorde tomou " + dano + " de dano");
						if(lorde.getHP() <= 0)
							this.fim();
					}
				}
			}
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
		this.acabou = true;
	}
	
	public boolean getStatus() {
		return acabou;
	}
	
	public Habilidade[] getCombatLog() {
		return combatLog;
	}
	public void setCombatLog(Habilidade[] combatLog) {
		this.combatLog = combatLog;
	}

}
