package ua.com.foxminded;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String sentence = scanner.nextLine();
		System.out.println("Input your string - " + sentence);
		System.out.println("Your reversed string - " + new Anagram().reverseSentence(sentence));
		scanner.close();
	}
}
