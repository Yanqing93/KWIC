/*
 * Contributor: Zhang Yanqing
 * 
 * Description: Sorts shifted sentences in ascending alphabetical order
 * 
 */

package ADT;
import java.util.ArrayList;


public class alphabetSort {

	private ArrayList<ArrayList<String>> shiftedTitles = new ArrayList<ArrayList<String>>();

	public alphabetSort(ArrayList<ArrayList<String>> titles){
		this.shiftedTitles = titles;
	}

	public void invoke(){
		int r, t, len;
		ArrayList<String> temp;
		len = shiftedTitles.size();
		for ( r = 0;  r < len - 1;  r++ ) {
			for ( t = r + 1;  t < len;  t++ ) {  
				if (shiftedTitles.get(r).get(0).compareTo(shiftedTitles.get(t).get(0)) > 0){
					temp = shiftedTitles.get(r);
					shiftedTitles.set(r, shiftedTitles.get(t));
					shiftedTitles.set(t, temp);
				}
			} 
		}
	}

	public ArrayList<ArrayList<String>> getSorted(){
		return this.shiftedTitles;
	}
	
	public void printOrdered(){
		System.out.println("Sorted Titles:");
		for(int i=0; i<shiftedTitles.size(); i++){
			for(int j=0; j<shiftedTitles.get(i).size(); j++){
				System.out.print(shiftedTitles.get(i).get(j) + " ");
			}
			System.out.println();
		}
	}
}

