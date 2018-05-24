package EP;

public class Controle {
	
	
	public void run() {
		Batalha bat = new Batalha();
		//definir quem comeca:
		double num = Math.random();
		if (num < 0.5) {//Jedi comeca
			bat.addAcao(bat.mestre.UsarHabilidade());
			bat.processarHabilidade(bat.proximaAcao(), bat.mestre);
			bat.addAcao(bat.lorde.UsarHabilidade());
			bat.processarHabilidade(bat.proximaAcao(), bat.lorde);
		}
		else {//Sith comeca
			bat.addAcao(bat.lorde.UsarHabilidade());
			bat.processarHabilidade(bat.proximaAcao(), bat.lorde);
			bat.addAcao(bat.mestre.UsarHabilidade());
			bat.processarHabilidade(bat.proximaAcao(), bat.mestre);
		}
		
		while ((bat.proximaAcao()) != null) {
			//essa ordem de jogada se mantera
			if (num < 0.5) {//Jedi comeca
				bat.addAcao(bat.mestre.UsarHabilidade());
				bat.processarHabilidade(bat.proximaAcao(), bat.mestre);
				bat.addAcao(bat.lorde.UsarHabilidade());
				bat.processarHabilidade(bat.proximaAcao(), bat.lorde);
			}
			else {//Sith comeca
				bat.addAcao(bat.lorde.UsarHabilidade());
				bat.processarHabilidade(bat.proximaAcao(), bat.lorde);
				bat.addAcao(bat.mestre.UsarHabilidade());
				bat.processarHabilidade(bat.proximaAcao(), bat.mestre);
			}
		}
		
	}
}
