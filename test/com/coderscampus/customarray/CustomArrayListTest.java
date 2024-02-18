package com.coderscampus.customarray;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomArrayListTest {

	// Test=Driven Development Methodology
	// Step 1 - Write a failing test
	// Step 2 - Write the business logic to make the test pass
	// Step 3 - Refactor your code

	// 3 A's
	// Arrange - Setting stuff up
	// Act - run the code
	// Assert - what would we expect to happen?

	@Test
	void should_add_one_item_to_list() {

		// Arrange
		CustomList<Integer> customList = new CustomArrayList<>();

		// Act
		customList.add(10);
		Integer expectedResult = customList.get(0);
		Integer expectedSize = customList.getSize();

		// Assert
		assertEquals(10, expectedResult);
		assertEquals(1, expectedSize);
	}
	
	@Test
	void should_add_item_to_index() {
		CustomList<String> customList = new CustomArrayList<>();
		customList.add("Matthew");
		customList.add("Mark");
		customList.add("John");
		
		customList.add(2, "Luke");
		
		assertEquals("Luke", customList.get(2));
		assertEquals("John", customList.get(3));
		assertEquals(4, customList.getSize());
			
	}

	@Test
	void should_get_size_of_list() {
		CustomList<Integer> customList = new CustomArrayList<>();

		customList.add(1);
		customList.add(2);
		Integer expectedSize = customList.getSize();

		assertEquals(2, expectedSize);
	}
	
	@Test
	void should_get_index_from_list() {
		CustomList<String> customList = new CustomArrayList<>();
		customList.add("Matthew");
		customList.add("Mark");
		customList.add("Luke");
		customList.add("John");
		
		assertEquals("Luke", customList.get(2));
		
	}
	
	@Test
	void should_remove_index_from_list() {
		CustomList<Integer> customList = new CustomArrayList<>();
		customList.add(10);
		customList.add(100);
		customList.add(1000);
		customList.add(10000);
		
		customList.remove(0);
		
		assertEquals(100, customList.get(0));
		assertEquals(3, customList.getSize());
	}
	
	@Test
	void should_ensure_capacity_of_list() {
		CustomList<Integer> customList = new CustomArrayList<>();
		
		for (int i=1; i<12; i++) {
			customList.add(i);
		}
		
		for (int i=0; i<11; i++) {
			assertEquals(i+1, customList.get(i));
		}
		assertEquals(11, customList.getSize());
	}

}
