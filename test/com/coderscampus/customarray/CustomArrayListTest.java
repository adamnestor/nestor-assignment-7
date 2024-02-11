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
		
		// Assert
		assertEquals(10, customList.get(0));
		assertEquals(1, customList.getSize());
	}

}
