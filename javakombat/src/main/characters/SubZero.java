package main.characters;

import main.Guerreiros;

public class SubZero extends Guerreiros {
	
	protected int golpeEspecial = 0;
	

	public SubZero(String nome, double poderAtaque, double vida) {
		super(nome, poderAtaque, vida);
	}

	@Override
	public void atacar(Guerreiros guerreiro) {
		if (golpeEspecial == 3) {
			freeze(guerreiro);
			golpeEspecial = 0;
			System.out.print("Golpe especial Freeze efetuado! ");
		} else {
			this.tirandoVida(guerreiro);
			golpeEspecial += 1;
		}
		System.out.printf("Player %s atacou!\n", this.nome);
	}

	private void freeze(Guerreiros guerreiro) {
		guerreiro.setVida(guerreiro.getVida() - (this.getPoderAtaque() * 2.2));
	}	
	
}

