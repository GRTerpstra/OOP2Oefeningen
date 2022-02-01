package singletonpractice;

import java.util.LinkedList;

public class GetTheTiles implements Runnable {

	@Override
	public void run() {
		SingletonTest newInstance = SingletonTest.getInstance();
		System.out.println("Instance ID: " + System.identityHashCode(newInstance));
		System.out.println(newInstance.getLetterList());
		LinkedList<String> playerOneTiles = newInstance.getTiles(2);
		System.out.println("Player: " + playerOneTiles);
		System.out.println("Got Tiles");
	}	
	
}
