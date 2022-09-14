package com.in28minutes.spring.learnspringframework.game;

public class GameRunner {

	//private MarioGame game;
	private SuperContraGame game;

	public GameRunner(SuperContraGame game) {
		this.game = game;
	}

	public void run() {
		game.up();
		game.down();
		game.right();
		game.left();

	}

}
