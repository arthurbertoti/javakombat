package test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import main.Guerreiros;
import main.JavaKombatApplication;
import main.Jogador;
import main.characters.LiuKang;
import main.characters.SonyaBlade;
import main.characters.SubZero;
import main.characters.Scorpion;

public class JavaKombatApplicationTest {

	@Test
	public void sonyaDeveVencer() {

		Guerreiros liuKang = new LiuKang("Liu kang", 9, 70);
		Guerreiros sonyaBlade = new SonyaBlade("Sonya Blade", 8, 80);

		Jogador player1 = new Jogador("1");
		Jogador player2 = new Jogador("2");

		player1.selecionarGuerreiro(sonyaBlade);
		player2.selecionarGuerreiro(liuKang);

		JavaKombatApplication partida = new JavaKombatApplication();

		partida.inciarPartidaParaDois(player1, player2);
		
		Assert.assertEquals("Sonya Blade", partida.getVencedor());
	}

	@Test
	public void subZeroDeveVencer() {

		Guerreiros subZero = new SubZero("Sub Zero", 9, 71);
		Guerreiros scorpion = new Scorpion("Scorpion", 8, 78);

		Jogador player1 = new Jogador("1");
		Jogador player2 = new Jogador("2");

		player1.selecionarGuerreiro(subZero);
		player2.selecionarGuerreiro(scorpion);

		JavaKombatApplication partida = new JavaKombatApplication();

		partida.inciarPartidaParaDois(player1, player2);
		
		Assert.assertEquals("Sub Zero", partida.getVencedor());

	}
	
	@Test
	public void scorpionDeveVencer() {

		Guerreiros liuKang = new LiuKang("Liu kang", 9, 68);
		Guerreiros scorpion = new Scorpion("Scorpion", 8, 76);

		Jogador player1 = new Jogador("1");
		Jogador player2 = new Jogador("2");

		player1.selecionarGuerreiro(scorpion);
		player2.selecionarGuerreiro(liuKang);

		JavaKombatApplication partida = new JavaKombatApplication();

		partida.inciarPartidaParaDois(player1, player2);
		
		Assert.assertEquals("Scorpion", partida.getVencedor());

	}
	
	@Test
	public void liuKangDeveVencer() {

		Guerreiros subZero = new SubZero("Sub Zero", 9, 70);
		Guerreiros liuKang = new Scorpion("Liu Kang", 10, 80);

		Jogador player1 = new Jogador("1");
		Jogador player2 = new Jogador("2");

		player1.selecionarGuerreiro(subZero);
		player2.selecionarGuerreiro(liuKang);

		JavaKombatApplication partida = new JavaKombatApplication();

		partida.inciarPartidaParaDois(player1, player2);
		
		Assert.assertEquals("Liu Kang", partida.getVencedor());

	}

}
