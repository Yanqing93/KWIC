package ADT;

import java.util.ArrayList;
import java.util.Arrays;

public class characters {
	private static ArrayList<ArrayList<String>> titles = new ArrayList<ArrayList<String>>();
	private static String[] toIgnore;
	
	public void storeSentences(ArrayList<ArrayList<String>>sentences, String[] ignoreWords){
		titles = sentences;
		toIgnore = Arrays.copyOf(ignoreWords, ignoreWords.length);
	}
	
	public static ArrayList<ArrayList<String>> getTitles(){
		return titles;
	}
	
	public static String[] getIgnoreWords(){
		return toIgnore;
	}
}
