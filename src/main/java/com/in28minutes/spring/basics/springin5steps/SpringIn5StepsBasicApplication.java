package com.in28minutes.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.in28minutes.spring.basics.springin5steps.basic.BinarySearchImpl;

@SpringBootApplication
public class SpringIn5StepsBasicApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsBasicApplication.class,
				args);
		try {
			BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
			BinarySearchImpl binarySearch2 = applicationContext.getBean(BinarySearchImpl.class);

			System.out.println(binarySearch);
			System.out.println(binarySearch2);
			
			int result = binarySearch.binarySearch(new int[] { 12, 4, 6 }, 3);
			binarySearch2.binarySearch(new int[] { 12, 4, 6 }, 3);
			System.out.println(result);
		} finally {
			applicationContext.close();
		}
	}
}
