package com.number_game;

public class TestNumberGame {

	public static void main(String[] args) {
		int min = 1;
		int max = 100;
		int maxAttempts = 5;
		
		
		Game game = new Game(min,max,maxAttempts);
		game.playGame();

	}

}
