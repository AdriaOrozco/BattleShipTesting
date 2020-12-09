package BattelshipTesting;

import javax.swing.JTextArea;

import interfaces.IManagerIO;
import interfaces.IPlayer;

import utils.Constants;

/**
 * Class to manager player entity
 * 
 * @author Budy
 *
 */
public class Player implements IPlayer {

	String name;
	Board own;
	Board enemy;
	int type;
	JTextArea pantalla;
	MockObjGUI gui;

	/**
	 * Player default constructor
	 * 
	 * @param string
	 * @param managerIOMock
	 * @throws InterruptedException 
	 */
	public Player(String name, IManagerIO managerIO, MockObjGUI uno) throws InterruptedException {
		gui=uno;
		this.name = name;
		this.own = new Board(managerIO,gui);
		this.enemy = new Board(managerIO,gui);
		if (name.contains("IA")) {
			this.type = 0;
		} else {
			this.type = 1;
		}
		this.locateBoat();
	}



	/**
	 * Position ships on the board
	 * @throws InterruptedException 
	 */
	public void locateBoat() throws InterruptedException {
		pantalla=gui.getDisplay();
		if (this.type == 1) {
			pantalla.append("Player: " + this.name + "\nPosition your boats!\n");

			for (int i = 0; i < Constants.BOAT_LIST.length; i++) {
				pantalla.append(
						"Position (X, Y) head of the ship it occupies " + Constants.BOAT_LIST[i] + " squares (1/1)\n");

				own.insertPosicion(Constants.BOAT_LIST[i]);
				own.showBoard();

			}
		} else {

			pantalla.append("Machine: " + this.name + "\nRandomly positioning your boats!\n");
			for (int i = 0; i < Constants.BOAT_LIST.length; i++) {

				own.insertPosicionRandom(Constants.BOAT_LIST[i]);

			}
		}

	}

	/**
	 * Allows you to attack between player
	 * @throws InterruptedException 
	 */
	public void attack(IPlayer player) throws InterruptedException {
		pantalla=gui.getDisplay();
		if (this.type == 1) {
			pantalla.append("Player => " + this.name + " ATTACK!!!\n");
			pantalla.append("What position do you want to attack?\n");

			enemy.attack(player);
			enemy.showBoard();

		} else {
			pantalla.append("Machine => " + this.name + " ATTACK RANDOM!\n");
			enemy.attackRandom(player);
			enemy.showBoard();

		}

	}

	/**
	 * Tells us if the current player has won
	 */
	public boolean isWinning() {
		if (enemy.numberBoats == 0) {
			return true;
		}
		return false;
	}

	/**
	 * Get Atribute Name
	 * 
	 * @return
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Get Own Board
	 */
	public Board getOwn() {

		return this.own;
	}

	/**
	 * Get Player type
	 */
	public int getType() {

		return this.type;
	}

}
