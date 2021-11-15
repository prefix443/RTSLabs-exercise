package com.rtslabs.exercise;


import com.rtslabs.exercise.services.CodingExercise;
import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Test cases listed in email
 * 
 * @author Andrew
 */

public class CodingExerciseTests {

	private CodingExercise codingExercise;

	@Before
	public void setup() {
		codingExercise = new CodingExercise();
	}

	@Test
	public void aboveBelowTest() {

		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
		HashMap<String, Integer> result = codingExercise.aboveBelow(list , 3);

		assertEquals((Integer) 3, result.get("above"));

	}
	@Test
	public void stringRotationTest() {

		String result = codingExercise.stringRotation("MyString" , 2);

		assertEquals("ngMyStri",result );

	}


}
