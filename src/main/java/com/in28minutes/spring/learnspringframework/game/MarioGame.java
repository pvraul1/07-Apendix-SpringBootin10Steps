package com.in28minutes.spring.learnspringframework.game;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MarioGame implements GamingConsole {

	@Override
	public void up() {
		log.info("up");
	}

	@Override
	public void down() {
		log.info("down");
	}

	@Override
	public void left() {
		log.info("left");
	}

	@Override
	public void right() {
		log.info("right");
	}

}
