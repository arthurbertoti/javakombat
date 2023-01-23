package main;

public abstract class Guerreiros {
	protected String nome;
	protected double poderAtaque;
	protected double vida;
	
	public Guerreiros(String nome, double poderAtaque, double vida) {
		this.nome = nome;
		this.poderAtaque = poderAtaque;
		this.vida = vida;
	}

	public void tirandoVida(Guerreiros guerreiro) {
		guerreiro.setVida(guerreiro.getVida() - this.getPoderAtaque());
	}
	
	public abstract void atacar(Guerreiros guerreiro);

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPoderAtaque() {
		return poderAtaque;
	}

	public void setPoderAtaque(double poderAtaque) {
		this.poderAtaque = poderAtaque;
	}

	public double getVida() {
		return vida;
	}

	public void setVida(double vida) {
		this.vida = vida;
	}
	
	
}
