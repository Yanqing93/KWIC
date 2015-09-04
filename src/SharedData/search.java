/*
 * Contributor: Nicholas Chew
 * 
 * Description: Search for sentence
 * 
 */
package SharedData;
import java.util.Vector;

public class search {
	Vector<String> arraySearch = new Vector<String>();
	
	public void executeSearch(Vector<String> sentenceFinal, int len, String key) {
		for (int i = 0; i < len; i++){
			if (sentenceFinal.get(i).contains(key))
				arraySearch.add(sentenceFinal.get(i));
		}
		System.out.println("Search:");
		if (arraySearch.size() == 0)
				System.out.println("No search Results");
		for (int j = 0; j < arraySearch.size(); j++){
			System.out.println(arraySearch.get(j));
		}
		System.out.println("Search Complete");	
	}
	
}
