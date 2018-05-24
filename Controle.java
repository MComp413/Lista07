package EP;

public class Controle {
	public static void main(String[] args) {
		Batalha batalha = new Batalha();
		//definir quem comeca:
		double num = Math.random();
		init(batalha, num);
		loop(batalha, num);
	}
	public static void init(Batalha batalha, double num) {
		if (num < 0.5) {//Jedi comeca
			batalha.addHabilidade(batalha.mestre.usarHabilidade(), batalha.mestre);
		}
		else {//Sith comeca
			batalha.addHabilidade(batalha.lorde.usarHabilidade(), batalha.lorde);
		}
	}
	public static void loop(Batalha batalha, double num) {
		while ((batalha.proximaHabilidade()) != null) {
			num = 1 - num;
			//essa ordem de jogada se mantera
			if (num < 0.5) {//vez do Jedi
				batalha.addHabilidade(batalha.mestre.usarHabilidade(), batalha.mestre);
				batalha.processarHabilidade(batalha.proximaHabilidade(), batalha.mestre);
			}
			else {//vez do Sith
				batalha.addHabilidade(batalha.lorde.usarHabilidade(), batalha.lorde);
				batalha.processarHabilidade(batalha.proximaHabilidade(), batalha.lorde);
			}
		}
	}
}

