/*
 * Contributor: Zhang Yanqing
 * 
 * Description: UI for users to choose implementation of program
 * 
 */

import java.util.Scanner;

import ADT.ADT_Main;
import SharedData.SharedData_Main;;

public class KWIC_UI {

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		while(true){
			String choice = new String();
			System.out.print("KWIC\n..."
					+ "Please choose type of implementation below:\n"
					+ "1. Main Program/Subroutine with Shared Data\n"
					+ "2. Abstract Data Types\n\n"
					+ "Your choice (Type \"quit\" to terminate): ");
			
			choice = input.nextLine();
			
			if(choice.contains("1")){
				SharedData_Main.execute();
			}
			else if(choice.contains("2")){
				ADT_Main.adt_Main(input);
			}
			else if(choice.toLowerCase().contains("quit")){
				System.out.println("KWIC Program Terminating...");
				break;
			}
			else
				continue;
			
		}
		input.close();
	}

}
