package com.findLongestWord;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import junit.framework.TestCase;

class LongestWordTest extends TestCase {

	LongestWord longestWord = new LongestWord();

	/*
	 * Accessing the findLongestWord method to get the Word Object Passing a string
	 * and asserting how many words are being returned. The string is going to have
	 * longest word jumped with length of 6 Expected out should have a words object
	 * with an array list with jumped in it and length of 6
	 */
	@Test
	public void testWithOneValue() {
		Words words = new Words();
		ArrayList<String> test = new ArrayList<String>();
		test.add("jumped");
		words = longestWord.findLongestWord("The cow jumped over the moon.");
		assertEquals(test, words.longestWords);
		assertEquals(6, words.length);
	}

	/*
	 * Accessing the findLongestWord method to get the Word Object Passing a string
	 * and asserting how many words are being returned. The string is going to have
	 * longest word jumped with length of 6 Expected out should have a words object
	 * with an array list with things and mostly in it and length of 6
	 */
	@Test
	public void testWithMultipleValues() {
		Words words = new Words();
		ArrayList<String> test = new ArrayList<String>();
		test.add("things");
		test.add("mostly");
		words = longestWord.findLongestWord("The best things in life are mostly free");
		assertEquals(test, words.longestWords);
		assertEquals(6, words.length);
	}

	/*
	 * Accessing the findLongestWord method to get the Word Object Testing the
	 * procedure if a space values are passed Expected out should be a null object
	 */
	@Test
	public void testWithSpaceValues() {
		assertEquals(null, longestWord.findLongestWord("   "));
	}

	/*
	 * Accessing the findLongestWord method to get the Word Object Testing the
	 * procedure if a empty string is passed Expected out should be a null object
	 */
	@Test
	public void testWithNullValues() {
		assertEquals(null, longestWord.findLongestWord(""));
	}

}
