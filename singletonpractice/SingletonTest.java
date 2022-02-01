package singletonpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class SingletonTest {		
	
	private static SingletonTest firstInstance = null;
	private String[] letters = {"a", "b", "c", "d", "e", "f", "g"};
	private LinkedList<String> letterList = new LinkedList<String>(Arrays.asList(letters));
	
	static boolean firstThread = true;
	
	private SingletonTest() {
		
	}
	
	public static SingletonTest getInstance() {
		if (firstInstance == null) {

			
			//dit stukje alleen voor thread gebruik------------------------
			if(firstThread) {
				firstThread = false;
				Thread.currentThread();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
	            synchronized (SingletonTest.class) {
	                if (firstInstance == null) {
	            //-------------------------------------------------------------    	
	                	
	                	firstInstance = new SingletonTest();
	                	Collections.shuffle(firstInstance.letterList);
	                }
	            }			
			}
			return firstInstance;
		}	
		
		public LinkedList<String> getLetterList() {
			return firstInstance.letterList;
		}	
		
		public LinkedList<String> getTiles(int howManyTiles) {
			LinkedList<String> tilesToSend = new LinkedList<String>();
			
			for(int i = 0; i <= howManyTiles; i++) {
				tilesToSend.add(firstInstance.letterList.remove(0));
			}
			return tilesToSend;			
		}			
}
