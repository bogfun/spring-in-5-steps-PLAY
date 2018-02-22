package com.in28minutes.spring.basics.springin5steps;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.in28minutes.spring.basics.springin5steps.basic.BinarySearchImpl;

@RunWith(SpringRunner.class)
@SpringBootApplication
public class SpringIn5StepsBasicApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsBasicApplication.class);
	
	public static void main(String[] args) {

		try(AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringIn5StepsBasicApplication.class)) {
			BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
			BinarySearchImpl binarySearch2 = applicationContext.getBean(BinarySearchImpl.class);

			LOGGER.info("{}", binarySearch);
			LOGGER.info("{}", binarySearch2);

			int result = binarySearch.binarySearch(new int[] { 12, 4, 6 }, 3);
			binarySearch2.binarySearch(new int[] { 12, 4, 6 }, 3);
			LOGGER.info("{}", result);
		}
	}
}
