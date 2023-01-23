package main.characters;

import main.Guerreiros;

public class SonyaBlade extends Guerreiros {
	
	protected int golpeEspecial = 0;

	public SonyaBlade(String nome, double poderAtaque, double vida) {
		super(nome, poderAtaque, vida);
	}

	@Override
	public void atacar(Guerreiros guerreiro) {
		if (golpeEspecial == 3) {
			energyRings(guerreiro);
			golpeEspecial = 0;
			System.out.print("Golpe especial Energy Rings efetuado! ");
		} else {
			this.tirandoVida(guerreiro);
			golpeEspecial += 1;
		}
		System.out.printf("Player %s atacou!\n", this.nome);
	}
	
	private void energyRings(Guerreiros guerreiro) {
		guerreiro.setVida(guerreiro.getVida() - (this.getPoderAtaque() * 2.5));
	}
	
}

