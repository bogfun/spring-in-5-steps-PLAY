package com.in28minutes.spring.basics.springin5steps.basic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

// 2. Run the context
@RunWith(SpringRunner.class)
// 1. Load the context
@ContextConfiguration(locations="/testContext.xml")
public class BinarySearchXmlConfigurationTest {

	// 3. Get this beean from the context
	@Autowired
	BinarySearchImpl binarySearch;
	
	@Test
	public void testBasicScenario() {
		// 4. call method on binarySearch
		int actualResult = binarySearch.binarySearch(new int[]{}, 5);
		// 5. check if the value is correct
		assertEquals(3, actualResult);
	}

}
