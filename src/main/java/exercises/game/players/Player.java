package main.java.exercises.game.players;

import main.java.exercises.game.Entity;

/**
 * Base class por all players in the game.
 *
 * Notes about abstract classes:
 * - They may have abstract methods (i.e. not implemented).
 * - They can't be instantiated (can't do `new Player()`).
 * - They are meant to be extended (e.g. `class Rat extends Player`)
 */
public abstract class Player implements Entity {

	private int health;

	public Player() {
		this.health = 10;
	}

	public boolean isAlive() {
		return this.health > 0;
	}

	public int getHealth() {
		return this.health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public abstract int attack();

	public void receiveHit(int hit) {
		this.health -= hit;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " (" + health + ")";
	}
}
