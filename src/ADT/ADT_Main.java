/**
 * Contributor: Zhang Yanqing
 * 
 * Description: This is the main file of ADT implementation
 */

package ADT;

import java.util.Scanner;

public class ADT_Main{
	private static boolean query(Scanner input){
		boolean choice = false;
		System.out.println("Do you want to continue with ADT KAIC? (yes/no)");
		String line = input.nextLine();
		if(line.toLowerCase().matches("yes")||line.toLowerCase().matches("y")){
			choice = true;
		}
		return choice;
	}
	
	public static void adt_Main(Scanner readline){
		boolean choice=true;
		while(choice){
		userInput input = new userInput();
		input.invoke(readline);
		
		circularShift shift = new circularShift(input.getTitles(),input.getIgnoreWords());
		shift.invoke();
		
		alphabetSort sort = new alphabetSort(shift.getShifted());
		sort.invoke();
		
		outputScreen output = new outputScreen(sort.getSorted());
		output.printKWIC();
		
		choice = query(readline);
		}
	}
	
}
