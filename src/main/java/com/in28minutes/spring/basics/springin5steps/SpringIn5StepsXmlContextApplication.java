package com.in28minutes.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.in28minutes.spring.basics.springin5steps.xml.XmlPersonDAO;

import utils.Utils;

public class SpringIn5StepsXmlContextApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsXmlContextApplication.class);

	public static void main(String[] args) {

		// Varianta 1:
		// try (FileSystemXmlApplicationContext applicationContext = new
		// FileSystemXmlApplicationContext(
		// "file:/home/bogdan/Workspace/SANDBOX/project-deposit/spring-in-5-steps-PLAY/src/main/resources/applicationContext.xml"))
		// {
		// Varianta 2:
		// try (FileSystemXmlApplicationContext applicationContext = new
		// FileSystemXmlApplicationContext(
		// "file:/home/bogdan/Workspace/SANDBOX/project-deposit/spring-in-5-steps-PLAY/src/main/resources/applicationContext.xml"))
		// {
		// Varianta 3:
		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml")) {

			Utils.startLog();
			LOGGER.info("Beans loaded --> {}", (Object) applicationContext.getBeanDefinitionNames());
			Utils.endLog();

			XmlPersonDAO xmlPersonDao = applicationContext.getBean(XmlPersonDAO.class);

			Utils.startLog();
			LOGGER.info("{} --- {}", xmlPersonDao, xmlPersonDao.getXmlJdbcConnection());
			Utils.endLog();
		}
	}
}
