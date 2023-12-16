package com.number_game;
import java.util.Scanner;


	public class Game {
		int min;
		int max;
		int maxAttempts;
		int score;
		int rounds;
		NumberGenerator numberGenerator;
		Scanner scanner;

		public Game(int min, int max, int maxAttempts) {
			this.min = min;
			this.max = max;
			this.maxAttempts = maxAttempts;
			this.score = 0;
			this.rounds = 0;
			this.numberGenerator = new NumberGenerator(min, max);
			this.scanner = new Scanner(System.in);
		}

		public void playGame() {
			System.out.println("\t\t\t****Welcome to the Number Guessing Game!**");

			boolean playAgain = true;
			while (playAgain) {
				int randomNumber = numberGenerator.generateNumber();
				int attempts = 0;
				boolean guessedCorrectly = false;

				System.out.println("\nRound " + (rounds + 1) + ": Guess the number between " + min + " To " + max + ".");

				while (attempts < maxAttempts) {
					System.out.print("Enter your guess Number (Attempt " + (attempts + 1) + "): ");
					int userGuess = scanner.nextInt();
					scanner.nextLine();

					if (userGuess == randomNumber) {
						System.out.println("\t \t Congratulations! You've guessed the number correctly!");
						guessedCorrectly = true;
						score = score + (maxAttempts - attempts);
						break;
					} else if (userGuess < randomNumber) {
						System.out.println("Too low! Try a higher number.");
					} else {
						System.out.println("Too high! Try a lower number.");
					}
					attempts++;
				}

				if (!guessedCorrectly) {
					System.out.println("Sorry, you've reached the maximum number of attempts. The number was: " + randomNumber);
				}

				rounds++;
				System.out.print("\nDo you want to play again? (yes/no): ");
				String playChoice = scanner.nextLine().toLowerCase();

				if (!playChoice.equals("yes")) {
					playAgain = false;
				}
			}

			System.out.println("\nGame Over!");
			System.out.println("Rounds played: " + rounds);
			System.out.println("Your score: " + score);
			scanner.close();
		}
	}
