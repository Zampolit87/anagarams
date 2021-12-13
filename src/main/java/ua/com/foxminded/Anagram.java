package ua.com.foxminded;

import static java.lang.Character.isAlphabetic;

public class Anagram {

	public static final String SPLITTER = " ";

	public String reverseSentence(String sentence) {
		if (sentence == null) {
			throw new IllegalArgumentException("No NULL alowed here!");
		}
		StringBuilder result = new StringBuilder();
		String[] words = sentence.split(SPLITTER);
		for (int i = 0; i < words.length; i++) {
			if (!result.toString().isEmpty()) {
				result.append(SPLITTER);
			}
			result.append(reverseWord(words[i]));
		}
		return result.toString();
	}

	private static String reverseWord(String word) {
		char[] chars = word.toCharArray();
		int rightIndex = chars.length - 1;
		int leftIndex = 0;
		while (leftIndex < rightIndex) {
			if (!isAlphabetic(chars[leftIndex])) {
				leftIndex++;
			} else if (!isAlphabetic(chars[rightIndex])) {
				rightIndex--;
			} else {
				swap(chars, rightIndex, leftIndex);
				leftIndex++;
				rightIndex--;
			}
		}
		return new String(chars);
	}

	private static void swap(char[] chars, int rightIndex, int leftIndex) {
		char leftChar = chars[leftIndex];
		chars[leftIndex] = chars[rightIndex];
		chars[rightIndex] = leftChar;
	}
}
