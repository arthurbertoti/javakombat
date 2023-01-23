package main;

public class JavaKombatApplication {
	protected Jogador player1, player2, vencedor, perdedor;

	public void inciarPartidaParaDois(Jogador player1, Jogador player2) {
		this.player1 = player1;
		this.player2 = player2;

		iniciarBatalha();
	}

	private void iniciarBatalha() {
		int rodada = 1;
		int turno = 1;
		while (this.player1.guerreiro.vida > 0 && this.player2.guerreiro.vida > 0) {
			if (rodada == 1) {
				System.out.printf("--------------- %dº turno ---------------\n\n", turno);
				player1.guerreiro.atacar(player2.guerreiro);
				rodada = 2;
			} else {
				player2.guerreiro.atacar(player1.guerreiro);
				rodada = 1;
				turno += 1;
				exibirDados();
			}
			
		}

		if (this.player1.guerreiro.vida < 0) {
			vencedor = player2;
			perdedor = player1;
		} else {
			vencedor = player1;
			perdedor = player2;
		}

		encerrarBatalha();
	}
	
	public String getVencedor() {
		return vencedor.guerreiro.nome;
	}
	
	private void exibirDados() {
		System.out.printf("Vida restante de %s: %.2f\n", player1.guerreiro.nome, player1.guerreiro.getVida());
		System.out.printf("Vida restante de %s: %.2f\n\n", player2.guerreiro.nome, player2.guerreiro.getVida());
	}
	
	private void encerrarBatalha() {
		System.out.println("\n---------- fim da batalha ---------------\n");
		System.out.printf("Player %s ganhou do player %s\n", vencedor.guerreiro.nome, perdedor.guerreiro.nome);
		System.out.printf("Vida do player vencedor: %.2f\n", vencedor.guerreiro.vida);
	}
}