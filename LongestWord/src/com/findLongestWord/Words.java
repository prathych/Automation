package com.findLongestWord;
import java.util.ArrayList;

public class Words {

	int length;
	ArrayList<String> longestWords = new ArrayList<String>();
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public ArrayList<String> getLongestWords() {
		return longestWords;
	}
	public void setLongestWords(ArrayList<String> longestWords) {
		this.longestWords = longestWords;
	}

}
