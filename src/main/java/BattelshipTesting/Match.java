package BattelshipTesting;

import javax.swing.JTextArea;

import interfaces.IManagerIO;
import utils.Constants;

/**
 * Class that manages the match
 * 
 * @author Cristian Vega
 *
 */
public class Match {

	IManagerIO managerIO;
	JTextArea pantalla;
	Player randomIA;
	Player user;
	MockObjGUI gui;
	boolean endGame = false;
	boolean playerTurn = true;

	/**
	 * Default constructor
	 * 
	 * @param managerIO
	 * @throws InterruptedException 
	 */
	public Match(IManagerIO managerIO, MockObjGUI uno) throws InterruptedException {
		gui=uno;
		this.user = new Player(Constants.NAME_PLAYER, managerIO, gui);
		this.randomIA = new Player(Constants.RANDOM_PLAYER_IA, managerIO, gui);
		this.startMatch();
	}

	/**
	 * Main match/game loop
	 * @throws InterruptedException 
	 */
	public void startMatch() throws InterruptedException {

		while (!this.endGame) {

			if (this.playerTurn) {
				user.attack(randomIA);
				playerTurn = false;
			} else {
				randomIA.attack(user);
				playerTurn = true;
			}

			if (user.isWinning() || randomIA.isWinning()) {
				endGame = true;
			}
		}
		showWinner();
	}

	/**
	 * Tells us who wins the game
	 */
	public void showWinner() {
		pantalla=gui.getDisplay();
		if (this.user.isWinning()) {
			pantalla.append("Game winner: " + this.user.getName() + "!!!");
		} else {
			pantalla.append("Game winner: " + this.randomIA.getName() + "!!!");
		}
	}

}
