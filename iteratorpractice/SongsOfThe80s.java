package iteratorpractice;

import java.util.Arrays;
import java.util.Iterator;

public class SongsOfThe80s implements SongIterator {
	
	int year = 80;	
	SongInfo[] bestSongs;
	private int arrayValue = 0;
			
		public SongsOfThe80s() {			
			bestSongs = new SongInfo[3];			
			addSong("Roam", "B52s", 1989);
			addSong("Roam2", "B52s2", 1990);
			addSong("Roam3", "B52s3", 1991);
		}
		
		public void addSong(String songName, String bandName, int yearReleased) {
				SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);
				bestSongs[arrayValue] = songInfo;
				arrayValue ++;
		}
		
		public int getYear() {
			return year;
		}
		
		/* If you want to use Array instead of Iterator use this code
		public SongInfo[] getBestSongs() {
			return bestSongs;
		}
		*/

		@Override
		public Iterator createIterator() {
			return Arrays.asList(bestSongs).iterator();
		}
}
