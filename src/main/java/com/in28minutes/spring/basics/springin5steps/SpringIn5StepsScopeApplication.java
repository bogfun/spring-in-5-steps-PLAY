package com.in28minutes.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.in28minutes.spring.basics.springin5steps.scope.PersonDAO;

import utils.Utils;

@SpringBootApplication
public class SpringIn5StepsScopeApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);
	
	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsScopeApplication.class,
				args);
		try {
			
			PersonDAO personDao = applicationContext.getBean(PersonDAO.class);
			PersonDAO personDao2 = applicationContext.getBean(PersonDAO.class);

			Utils.startLog();
			LOGGER.info("{}", personDao);
			LOGGER.info("{}", personDao.getJdbcConnection());
			LOGGER.info("{}", personDao2);;
			LOGGER.info("{}", personDao2.getJdbcConnection());
			Utils.endLog();
		} finally {
			applicationContext.close();
		}
	}
}
