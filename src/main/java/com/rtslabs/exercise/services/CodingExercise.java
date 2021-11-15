package com.rtslabs.exercise.services;

import java.util.HashMap;
import java.util.List;

/**
 * RTS Labs at home coding Exercise
 *
 * @author Andrew
 * @version 1.0
 */
public class CodingExercise {


	/**
	 * Exercise #1 aboveBelow
	 *
	 * @param nums  a collection of integers (the list)
	 * @param value an integer (the comparison value)
	 * @return returns a hash/object/map/etc. with the keys "above" and "below" with the corresponding count of integers from the list that are above or below the comparison value
	 *
	 */
	public HashMap < String, Integer > aboveBelow(List < Integer > nums, int value) {
		HashMap < String, Integer > h = new HashMap < String, Integer > ();
		for (Integer i: nums) {
			if (i < value) {
				h.put("below", h.getOrDefault("below", 0) + 1);
			} else if (i > value) {
				h.put("above", h.getOrDefault("above", 0) + 1);
			}
		}
		return h;
	}

	/**
	 * Exercise #2 stringRotation
	 *
	 * @param str  a string (the original string)
	 * @param value a positive integer (the rotation amount)
	 * @return returns a new string, rotating the characters in the original string to the right by the rotation amount and have the overflow appear at the beginning
	 *
	 */
	public String stringRotation(String str, int value) {
		int pos = value % str.length();
		char[] charArray = str.toCharArray();
		reverseCharArray(charArray, 0, charArray.length - 1);
		reverseCharArray(charArray, 0, pos - 1);
		reverseCharArray(charArray, pos, charArray.length - 1);
		return String.valueOf(charArray);
	}

	private void reverseCharArray(char[] charArray, int i, int j) {
		while (i < j) {
			char tmp = charArray[i];
			charArray[i] = charArray[j];
			charArray[j] = tmp;
			i++;
			j--;
		}
	}



}