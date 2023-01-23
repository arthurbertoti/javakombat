package main.characters;

import main.Guerreiros;

public class LiuKang extends Guerreiros {
	
	protected int golpeEspecial = 0;
	
	public LiuKang(String nome, int poderAtaque, double vida) {
		super(nome, poderAtaque, vida);
	}
	
	@Override
	public void atacar(Guerreiros guerreiro) {
		if (golpeEspecial == 2) {
			bicycleKick(guerreiro);
			golpeEspecial = 0;
			System.out.print("Golpe especial Bycicle Kick efetuado! ");
		} else {
			this.tirandoVida(guerreiro);
			golpeEspecial += 1;
		}
		System.out.printf("Player %s atacou!\n", this.nome);
	}

	private void bicycleKick(Guerreiros guerreiro) {
		guerreiro.setVida(guerreiro.getVida() - (this.getPoderAtaque() * 1.8));
	}	
}
