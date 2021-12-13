package ua.com.foxminded;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AnagramTest {

	private Anagram anagram;

	@BeforeEach
	public void setUp() {
		anagram = new Anagram();
	}

	@Test
	public void givenNull_whenReverseSentence_thenThrowsIllegalArgumentException() {
		assertThrows(IllegalArgumentException.class, () -> anagram.reverseSentence(null));
	}

	@Test
	public void givenEmptyText_whenReverseSentence_thenEmptyText() {
		String sentence = "";
		assertEquals("", anagram.reverseSentence(sentence));
	}

	@Test
	public void givenOneWord_whenReverseSentence_thenReversedAllCharsTest() {
		String sentence = " simple";
		assertEquals("elpmis", anagram.reverseSentence(sentence));
	}

	@Test
	public void givenOneWordMixedChars_whenReverseSentence_thenReversedOneWordMixedCharsTest() {
		String sentence = "simp!le";
		assertEquals("elpm!is", anagram.reverseSentence(sentence));
	}

	@Test
	public void givenSpaceFrontOneWordSpecialChars_whenReverseSentence_thenSpaceFrontOneWordSpecialCharsTest() {
		String sentence = " 23456";
		assertEquals("23456", anagram.reverseSentence(sentence));
	}

	@Test
	public void givenTwoWordsDifferentChars_whenReverseSentence_thenReversedTwoWordsDifferentCharsTest() {
		String sentence = "a1bcd efg!h";
		assertEquals("d1cba hgf!e", anagram.reverseSentence(sentence));
	}

	@Test
	public void givenAllSpecialCharText_whenReverseSentence_thenAllSpecialCharsSentenceTest() {
		String sentence = "43!256 %23456";
		assertEquals("43!256 %23456", anagram.reverseSentence(sentence));
	}

	@Test
	public void givenMultipleWords_whenReverseSentence_thenReversedMultipleWordsTest() {
		String sentence = "a1bcd efg!h a1bcd efg!h";
		assertEquals("d1cba hgf!e d1cba hgf!e", anagram.reverseSentence(sentence));
	}
}
