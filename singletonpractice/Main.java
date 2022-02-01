package singletonpractice;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		
		SingletonTest newInstance = SingletonTest.getInstance();
		System.out.println("Instance 1 ID: " + System.identityHashCode(newInstance));
		System.out.println(newInstance.getLetterList());
		LinkedList<String> playerOneTiles = newInstance.getTiles(1);
		System.out.println("Player 1: " + playerOneTiles);
		
		SingletonTest instanceTwo = SingletonTest.getInstance();
		System.out.println("Instance 2 ID: " + System.identityHashCode(newInstance));
		System.out.println(instanceTwo.getLetterList());
		LinkedList<String> playerTwoTiles = instanceTwo.getTiles(1);
		System.out.println("Player 2: " + playerTwoTiles);
	}
	
}
