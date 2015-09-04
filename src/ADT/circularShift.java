/*
 * Contributor: Zhang Yanqing
 * 
 * Description: Shifts sentences with keywords in front
 * 
 */

package ADT;
import java.util.ArrayList;
import java.util.Arrays;


public class circularShift {
	private ArrayList<ArrayList<String>> titles = new ArrayList<ArrayList<String>>();
	private ArrayList<ArrayList<String>> shiftedTitles = new ArrayList<ArrayList<String>>();
	private String[] toIgnore;

	public circularShift(ArrayList<ArrayList<String>> inputs, String[] ignore){
		this.titles = inputs;
		this.toIgnore = Arrays.copyOf(ignore, ignore.length);
	}

	private int checkIgnoreWord(int i, int j){
		int shift=1;
		for(int l=0; l<toIgnore.length; l++){
			if(titles.get(i).get(j).equals(toIgnore[l])){
				shift=0;
				break;
			}

		}

		return shift;
	}

	private void shiftTitle(int titleSize, int i, int j){
		String temp;
		ArrayList<String> tempShiftedTitles=new ArrayList<String>();
		//Adding and shifting title words
		for(int k=0; k<titleSize; k++){
			tempShiftedTitles.add(titles.get(i).get((j+k)%titleSize));
		}
		temp = tempShiftedTitles.get(0);
		tempShiftedTitles.set(0, temp.toUpperCase());
		shiftedTitles.add(tempShiftedTitles);
	}

	public void invoke(){
		for(int i=0; i<titles.size(); i++){
			int titleSize = titles.get(i).size();
			//Shifting within 1 title
			for(int j=0; j<titleSize; j++){
				int shift=checkIgnoreWord(i,j);
				if(shift==1)
					shiftTitle(titleSize, i, j);
			}
		}
	}
	
	public ArrayList<ArrayList<String>> getShifted(){
		return this.shiftedTitles;
	}
	
	/* For debugging
	public void printShifted(){
		System.out.println("Shifted Titles:");
		for(int i=0; i<shiftedTitles.size(); i++){
			for(int j=0; j<shiftedTitles.get(i).size(); j++){
				System.out.print(shiftedTitles.get(i).get(j) + " ");
			}
			System.out.println();
		}
	}
	
	public void printTitles(){
		for(int i=0; i<titles.size(); i++){
			for(int j=0; j<titles.get(i).size(); j++){
				System.out.print(titles.get(i).get(j) + " ");
			}
			System.out.println();
		}
	}*/


}
