package main.characters;

import main.Guerreiros;

public class Scorpion extends Guerreiros {
	
	protected int golpeEspecial = 0;

	public Scorpion(String nome, double poderAtaque, double vida) {
		super(nome, poderAtaque, vida);
	}

	@Override
	public void atacar(Guerreiros guerreiro) {
		if (golpeEspecial == 4) {
			getOverHere(guerreiro);
			golpeEspecial = 0;
			System.out.print("Golpe especial Get Over Here efetuado! ");
		} else {
			this.tirandoVida(guerreiro);
			golpeEspecial += 1;
		}
		System.out.printf("Player %s atacou!\n", this.nome);
		
	}

	private void getOverHere(Guerreiros guerreiro) {
		guerreiro.setVida(guerreiro.getVida() - (this.getPoderAtaque() * 2.5));
	}	
}

