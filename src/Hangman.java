import static java.lang.System.out;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Hangman {
	boolean gameIsOver = false;
	String drawing = null;
	int numberGuess = 0;
	String randomWord = null;
	List<String> words = new ArrayList<String>();
	List<String> guessedString = new ArrayList<String>();
	Scanner keyboard = new Scanner(System.in);

	public void victory() {
		out.println("You win! You will not be hung!");
		gameIsOver = true;
	}

	public String getRandomWord(List<String> words) {
		Random random = new Random();
		int index = random.nextInt(words.size());
		randomWord = words.get(index);
		return randomWord;
	}

	public void guessTheWord(String randomWord) {
		boolean guessCorrect = true;
		String guessedLetter = null;
		do {
			out.println();
			out.println("Which letter do you want to guess?");
			guessedLetter = keyboard.next();
			if (!randomWord.contains(guessedLetter)) {
				guessCorrect = false;
				numberGuess++;
				out.println("That letter is not in the word.");
			} else {
				guessedString.add(guessedLetter);

				fillInWord(randomWord, guessedLetter);
				if (gameIsOver) {
					guessCorrect = false;
				}
			}
		} while (guessCorrect);

		switch (numberGuess) {
		case 1:
			HangDrawing.drawOne();
			break;
		case 2:
			HangDrawing.drawTwo();
			break;
		case 3:
			HangDrawing.drawThree();
			break;
		case 4:
			HangDrawing.drawFour();
			break;
		case 5:
			HangDrawing.drawFive();
			break;
		case 6:
			HangDrawing.drawSix();
			break;
		case 7:
			HangDrawing.drawSeven();
			break;
		case 8:
			HangDrawing.drawEight();
			break;
		case 9:
			HangDrawing.drawNine();
			out.println("You die. Ha. Ha.");
			out.println("The word was " + randomWord);
			gameIsOver = true;
			break;
		default:
			HangDrawing.drawEmpty();
			break;
		}
	}

	public void fillInWord(String randomWord, String guessedLetter) {
		List<String> orderedLetterList = new ArrayList<String>();
		for (int i = 1; i < (randomWord.length() + 1); i++) {
			if (guessedString.contains(randomWord.substring((i - 1), i))) {
				out.print(randomWord.substring((i - 1), i));
				orderedLetterList.add(guessedLetter);
				int orderedSize = orderedLetterList.size();
				if (orderedSize == randomWord.length()) {
					out.println();
					victory();
				}
			} else {
				out.print("_");
			}
		}
	}

	public void run() {
		HangDrawing.drawEmpty();

		ReadDictionaryFindWord r = new ReadDictionaryFindWord();
		words = r.getWord();
		randomWord = getRandomWord(words);
		// out.println(randomWord);
		for (int i = 0; i < randomWord.length(); i++) {
			out.print("_");
		}
		out.print(" " + randomWord.length() + " letters ");
		out.println("The object of this game is to guess the word with 8 wrong guesses or less.");
		out.println("Otherwise, you will be hung from the neck until you die!");
		while (!gameIsOver) {
			guessTheWord(randomWord);
		}
	}

	public static void main(String[] args) {
		Hangman h = new Hangman();
		h.run();
	}

}
