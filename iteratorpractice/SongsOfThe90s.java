package iteratorpractice;

import java.util.Hashtable;
import java.util.Iterator;

public class SongsOfThe90s implements SongIterator {

	int year = 90;
	Hashtable<Integer, SongInfo> bestSongs;
	private int hashKey = 0;
			
		public SongsOfThe90s() {			
			bestSongs = new Hashtable<Integer, SongInfo>();;			
			addSong("Losing My Religion", "REM", 1991);		
			addSong("Losing My Religion2", "REM2", 1992);		
			addSong("Losing My Religion3", "REM3", 1993);
		}
		
		public void addSong(String songName, String bandName, int yearReleased) {
				SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);
				bestSongs.put(hashKey, songInfo);
				hashKey ++;
		}
		
		public int getYear() {
			return year;
		}
		
		/* If you want to use Hashtable instead of Iterator use this code
		public Hashtable<Integer, SongInfo> getBestSongs() {
			return bestSongs;
		}
		*/

		@Override
		public Iterator createIterator() {
			return bestSongs.values().iterator();
		}
}
