package iteratorpractice;

import java.util.ArrayList;
import java.util.Iterator;

public class SongsOfThe70s implements SongIterator {
	
		int year = 70;
		ArrayList<SongInfo> bestSongs;
			
		public SongsOfThe70s() {
			bestSongs = new ArrayList<SongInfo>();
			
			addSong("Imagine", "John Lennon", 1971);
			addSong("Imagine2", "John Lennon2", 1972);
			addSong("Imagine3", "John Lennon3", 1973);
		}
		
		public void addSong(String songName, String bandName, int yearReleased) {
				SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);
				bestSongs.add(songInfo);
		}
		
		public int getYear() {
			return this.year;
		}
		
		/* If you want to use ArrayList instead of Iterator use this code
		public ArrayList<SongInfo> getBestSongs() {
			return bestSongs;
		}
		*/

		@Override
		public Iterator createIterator() {	
			return bestSongs.iterator();
		}
}
