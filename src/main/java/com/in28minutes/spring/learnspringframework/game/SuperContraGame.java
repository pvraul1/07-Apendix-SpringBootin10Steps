package com.in28minutes.spring.learnspringframework.game;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SuperContraGame implements GamingConsole {

	@Override
	public void up() {
		log.info("SuperContraGame up");
	}

	@Override
	public void down() {
		log.info("SuperContraGame down");
	}

	@Override
	public void left() {
		log.info("SuperContraGame left");
	}

	@Override
	public void right() {
		log.info("SuperContraGame right");
	}

}
