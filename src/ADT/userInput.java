/*
 * Contributor: Zhang Yanqing
 * 
 * Description: Receives user input: ignore words and sentences
 * 
 */

package ADT;
import java.util.ArrayList;
import java.util.Scanner;


public class userInput {
	private ArrayList<ArrayList<String>> titles = new ArrayList<ArrayList<String>>();
	private String[] toIgnore;
	public userInput(){
	}
	
	private void storeInputs(){
		characters Characters = new characters();
		Characters.storeSentences(titles, toIgnore);
	}
	
	public void invoke(Scanner input){
		String line = new String();
		String[] parsing;
		System.out.println("----KWIC----");
		System.out.println("Enter words to ignore:");
		//Scanner input = new Scanner(System.in);
		String delims = "[ ,?!]+";
		line = input.nextLine();
		toIgnore = line.split(delims);
		System.out.println("Enter titles: (Double Enter to terminate input)");
		while(!"".equals(line=input.nextLine())){;
			ArrayList<String> title = new ArrayList<String>();
			parsing = line.split(delims);
			for(int i=0; i<parsing.length; i++){
				title.add(parsing[i]);
			}
			titles.add(title);
		}
		storeInputs();
		
	}
	
	public void printTitles(){
		for(int i=0; i<titles.size(); i++){
			for(int j=0; j<titles.get(i).size(); j++){
				System.out.print(titles.get(i).get(j) + " ");
			}
			System.out.println();
		}
	}
	
}
