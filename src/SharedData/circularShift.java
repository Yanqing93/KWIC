/*
 * Contributor: Nicholas Chew
 * 
 * Description: Shifts sentences with keywords in front
 * 
 */
package SharedData;
import java.util.Vector;


public class circularShift {
	static Vector<String> sentence = new Vector<String>();
	
	public Vector<String> executeShift(String newSentence, int numWords) {
		//splitting of words
		int i = 0;
		String[] word = new String[100];
		sentence.add(newSentence);
		//parsing of string
		while (newSentence.contains(" ")) {
			word[i++] = newSentence.substring(0, newSentence.indexOf(" "));
			newSentence = newSentence.substring( newSentence.indexOf(" ") + 1);
		}
		word[i++] = newSentence;
		//creating different combination of sentences
		int lengthWord = 0;
		for (int k=1;k<numWords;k++){
			lengthWord = word[k-1].length();
			sentence.add(sentence.get(k - 1).substring(lengthWord + 1) + " " + word[k-1]);
		}
		return sentence;
	}
}