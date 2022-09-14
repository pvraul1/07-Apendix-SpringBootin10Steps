package com.in28minutes.spring.learnspringframework.game;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PacmanGame implements GamingConsole {

	@Override
	public void up() {
		log.info("PacmanGame up");
	}

	@Override
	public void down() {
		log.info("PacmanGame down");
	}

	@Override
	public void left() {
		log.info("PacmanGame left");
	}

	@Override
	public void right() {
		log.info("PacmanGame right");
	}

}
