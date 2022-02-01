package iteratorpractice;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class DiscJockey {
	
	SongIterator iter70sSongs;
	SongIterator iter80sSongs;
	SongIterator iter90sSongs;

	/* Use this code if you do not want to use the iterator interface. SongsOfThe70s
	 * 
	 * songs70s; SongsOfThe80s songs80s; SongsOfThe90s songs90s;
	 * 
	 * public DiscJockey(SongsOfThe70s newSongs70s, SongsOfThe80s newSongs80s,
	 * SongsOfThe90s newSongs90s) { songs70s = newSongs70s; songs80s = newSongs80s;
	 * songs90s = newSongs90s;
	 */
		
	public DiscJockey(SongIterator newSongs70s, SongIterator newSongs80s, SongIterator newSongs90s) {	
		iter70sSongs = newSongs70s;
		iter80sSongs = newSongs80s;
		iter90sSongs = newSongs90s;
	}
	
	/* Use this code if you do not want to use the iterator interface.
	 * 
	 * public void showTheSongs() {
	 * 
	 * // Show all the songs with the help of an ArrayList ArrayList<SongInfo>
	 * all70sSongsArrayList = songs70s.getBestSongs();
	 * System.out.println("Songs of the 70s:");
	 * 
	 * for(int x = 0; x <= (all70sSongsArrayList.size() - 1); x++) { SongInfo song =
	 * all70sSongsArrayList.get(x); System.out.println(song.getSongName());
	 * System.out.println(song.getBandName());
	 * System.out.println(song.getYearReleased()); } System.out.println("");
	 * 
	 * // Show all the songs with the help of an Array SongInfo[] all80sSongsArray =
	 * songs80s.getBestSongs(); System.out.println("Songs of the 80s:");
	 * 
	 * for(int x = 0; x <= (all80sSongsArray.length - 1); x++) { SongInfo song =
	 * all80sSongsArray[x]; System.out.println(song.getSongName());
	 * System.out.println(song.getBandName());
	 * System.out.println(song.getYearReleased()); } System.out.println("");
	 * 
	 * // Show all the songs with the help of an Hashtable Hashtable<Integer,
	 * SongInfo> all90sSongsHashTable = songs90s.getBestSongs();
	 * System.out.println("Songs of the 90s:");
	 * 
	 * for(Enumeration<Integer> e = all90sSongsHashTable.keys();
	 * e.hasMoreElements();) { SongInfo song =
	 * all90sSongsHashTable.get(e.nextElement());
	 * System.out.println(song.getSongName());
	 * System.out.println(song.getBandName());
	 * System.out.println(song.getYearReleased()); } System.out.println(""); }
	 */
	
	public void showTheSongs() {
		Iterator songs70s = iter70sSongs.createIterator();
		Iterator songs80s = iter80sSongs.createIterator();
		Iterator songs90s = iter90sSongs.createIterator();
		System.out.println("Songs of the 70s:");
		printTheSongs(songs70s);
		System.out.println("");
		System.out.println("Songs of the 80s:");
		printTheSongs(songs80s);
		System.out.println("");
		System.out.println("Songs of the 90s:");
		printTheSongs(songs90s);
		System.out.println("");
	}
	
	public void printTheSongs(Iterator i) {
		while(i.hasNext()) {
			SongInfo songInfo = (SongInfo) i.next();
			System.out.println(songInfo.getSongName());
			System.out.println(songInfo.getBandName());
			System.out.println(songInfo.getYearReleased());
		}
	}
	
}
