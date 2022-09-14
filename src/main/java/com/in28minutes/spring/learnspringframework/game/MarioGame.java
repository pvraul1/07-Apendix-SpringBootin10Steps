package com.in28minutes.spring.learnspringframework.game;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class MarioGame implements GamingConsole {

	@Override
	public void up() {
		log.info("jump");
	}

	@Override
	public void down() {
		log.info("down into a hole");
	}

	@Override
	public void left() {
		log.info("stop");
	}

	@Override
	public void right() {
		log.info("run");
	}

}
