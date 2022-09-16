package com.in28minutes.spring.learnspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.in28minutes.spring.learnspringframework.enterprise.MyWebController;
import com.in28minutes.spring.learnspringframework.game.GameRunner;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class LearnSpringFrameworkApplication  {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
				SpringApplication.run(LearnSpringFrameworkApplication.class, args);

		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();

		MyWebController controller = context.getBean(MyWebController.class);
		log.info(String.valueOf(controller.returnValueFromBusinessService()));

	}

}
