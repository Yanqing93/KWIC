/*
 * Contributor: Nicholas Chew
 * 
 * Description: Sorts shifted sentences in ascending alphabetical order
 * 
 */
package SharedData;
import java.util.Vector;

public class alphabetize {
	
	public Vector<String> executeAlphabetize(Vector<String> sentenceFinal, int len) { 
		int r, t;
		String temp;
		len = sentenceFinal.size();
		for ( r = 0;  r < len - 1;  r++ ) {
			for ( t = r + 1;  t < len;  t++ ) {  
				if (sentenceFinal.get(r).compareTo(sentenceFinal.get(t)) > 0){
					temp = sentenceFinal.get(r);
					sentenceFinal.set(r, sentenceFinal.get(t));
					sentenceFinal.set(t, temp);
				}
			} 
		}
		return sentenceFinal;
	}
}
