/*
 * Contributor: Nicholas Chew
 * 
 * Description: Checks for ignore words
 * 
 */

package SharedData;
import java.util.Vector;


public class checkIgnoreWord {
	int vectorSize;
		
	public Vector<String> executeIgnoreWord(Vector<String> sentence) {
		String word = new String();
		int index = 0, count = 0;
		int max = vectorSize;
		Vector<String> ignoreWords = new Vector<String>();
		ignoreWords.add("on");
		
		while (count < max){
			if (!sentence.get(index).contains(" "))
				count = max;
			else {
				word = sentence.get(index).substring(0, sentence.get(index).indexOf(" "));
				if (ignoreWords.contains(word)) {
					sentence.remove(index);
					vectorSize--;
					count++;
				}
				else{
					index++;
					count++;
				}
			}
		}
		return sentence;
	}
	
	public void setVectorSize(int size) {
		vectorSize = size;
	}
	
	public int getVectorSize() {
		return vectorSize;
	}
}
