package EP;

public class Controle {
	public static void main(String[] args) {
		Batalha batalha = new Batalha();
		//definir quem comeca:
		double num = Math.random();
		//double num = 0.8;
		init(batalha, num);
		loop(batalha, num);
	}
	public static void init(Batalha batalha, double num) {
		if (num < 0.5) {//Jedi comeca
			batalha.diminuiCoolOff();
			batalha.addHabilidade(batalha.mestre.usarHabilidade(), batalha.mestre);			
		}
		else {//Sith comeca
			batalha.diminuiCoolOff();
			batalha.addHabilidade(batalha.lorde.usarHabilidade(), batalha.lorde);
		}
	}
	public static void loop(Batalha batalha, double num) {
		while ((batalha.proximaHabilidade()) != null && batalha.getStatus() == false) {
			num = 1 - num; 
			//essa ordem de jogada se mantera
			if (num < 0.5) {//vez do Jedi
				batalha.diminuiCoolOff();
				batalha.addHabilidade(batalha.mestre.usarHabilidade(), batalha.mestre);
				batalha.processarHabilidade(batalha.proximaHabilidade(), batalha.mestre);
			}
			else {//vez do Sith
				batalha.diminuiCoolOff();
				batalha.addHabilidade(batalha.lorde.usarHabilidade(), batalha.lorde);
				batalha.processarHabilidade(batalha.proximaHabilidade(), batalha.lorde);
			}
		}
	}
}
