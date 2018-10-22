package com.findLongestWord;

public class LongestWord {

	public String input;

	public Words findLongestWord(String findLongestString) {
		// Trimming the string if it has space values and handling the only space
		// strings
		this.input = findLongestString.trim();

		if (!input.equals(null) && !input.isEmpty()) {
			Words words = new Words();
			// Splitting the string with space value to get words into a string array
			String[] splitStr = input.split(" ");

			words.length = 0;
			for (int i = 0; i < splitStr.length; i++) {
				int tempLength = splitStr[i].length();
				if (tempLength >= words.length) {
					/*
					 * Checking if the new string in the loop has a greater length than before
					 * length. If the condition is satisfied we are clearing the array List to add
					 * new highly added values.
					 */
					if (words.length < tempLength) {
						words.longestWords.clear();
					}
					words.length = tempLength;
					words.longestWords.add(splitStr[i]);
				}
			}
			return words;
		}
		return null;
	}
}
