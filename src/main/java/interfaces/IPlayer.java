package interfaces;

import BattelshipTesting.Board;

/**
 * Inteface for Players
 * @author Cristian Vega
 *
 */
public interface IPlayer {
	
	public Board getOwn();
	public void locateBoat() throws InterruptedException;
	public boolean  isWinning();
	public void attack(IPlayer jugador) throws InterruptedException;
}
