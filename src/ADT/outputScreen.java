package ADT;
import java.util.ArrayList;


public class outputScreen {

	private ArrayList<ArrayList<String>> orderedTitles = new ArrayList<ArrayList<String>>();
	
	public outputScreen(ArrayList<ArrayList<String>> titles){
		this.orderedTitles = titles;
	}
	
	public void printKWIC(){
		System.out.println("Key Words in Context (KWIC):");
		for(int i=0; i<orderedTitles.size(); i++){
			for(int j=0; j<orderedTitles.get(i).size(); j++){
				System.out.print(orderedTitles.get(i).get(j) + " ");
			}
			System.out.println();
		}
	}
}
