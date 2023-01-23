package main;

public class Jogador {
	protected String nome;
	protected Guerreiros guerreiro;

	public Jogador(String nome) {
		this.nome = nome;
	}
	

	public void selecionarGuerreiro(Guerreiros guerreiro) {
		this.guerreiro = guerreiro;
	}
}
