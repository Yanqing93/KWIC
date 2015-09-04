/**
 * Contributor: Nicholas Chew
 * 
 * Description: This is the main file of Shared Data implementation
 */

package SharedData;
import java.util.Vector;

public class SharedData_Main {
	static Vector<String> sentence = new Vector<String>();
	static Vector<String> sentenceFinal = new Vector<String>();
	static int lenSentenceFinal = 0;

	public static int getVectorSize(){
		return sentenceFinal.size();
	}

	public static int getNumWords(String newSentence) {
		return (newSentence.trim().split(" ").length);
	}

	public static String getUserInput() {
		input stringInput = new input();
		stringInput.setLine();
		return stringInput.getLine();
	}

	public static void execute() {
		String command     = "default";
		String newSentence = "default";
		String searchKey   = "default";
		int numWords 	   = 0;
		System.out.println("!Welcome to KWIC!");
		while (!command.matches("quit")){
			System.out.println("***Type \"enter\" to type sentences, \"quit\" to exit implementation***\n"
					+ "Enter command:");
			command = getUserInput();
			if (command.matches("enter")){
				System.out.println("Enter data!Key enter to finish input! ");
				while (!newSentence.matches("")){
					newSentence = getUserInput();
					numWords = getNumWords(newSentence);
					circularShift shift = new circularShift();
					sentence = shift.executeShift(newSentence, numWords);
					sentenceFinal.addAll(sentence);
					sentence.clear();
				}
				sentenceFinal.removeElementAt(sentenceFinal.size()-1);

				checkIgnoreWord ignoreWord = new checkIgnoreWord();
				numWords = getVectorSize();
				ignoreWord.setVectorSize(numWords);
				sentenceFinal = ignoreWord.executeIgnoreWord(sentenceFinal);
				numWords = ignoreWord.getVectorSize();

				alphabetize arrangeVector = new alphabetize();
				sentenceFinal = arrangeVector.executeAlphabetize(sentenceFinal,numWords);

				output printResult = new output();
				printResult.executeOutput(sentenceFinal, numWords);

				newSentence = "default";
				lenSentenceFinal = numWords;
			}
			else if (command.matches("search")){
				System.out.println("Enter search key: ");
				searchKey = getUserInput();
				search arraySearch = new search();
				arraySearch.executeSearch(sentenceFinal, lenSentenceFinal , searchKey);
			}
			else if (command.matches("quit"))
				System.out.println("Bye Bye\n");
			else
				System.out.println("Invalid Command\n");
		}
	}

	public static void main(String args[]) {
		execute();
	}
}
