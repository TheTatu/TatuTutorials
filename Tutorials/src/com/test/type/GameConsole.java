package com.test.type;

public class GameConsole {
	public static void main(String[] args) {
		System.out.println("This is Game Console");

		GameFactory factory = new GameFactory();

		int userChoice = 1; // this is user choice
		Game game = factory.getGame(userChoice);
		game.play();
		
		T20 t20 = new T20();
		System.out.println(t20.getName());
		
		
	}
}
