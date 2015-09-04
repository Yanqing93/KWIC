package SharedData;
import java.util.Scanner;

public class input {
	String newLine = "default";
	Scanner user_input = new Scanner(System.in);
	
	public String getLine() {
		return newLine;	
	}
	
	public void setLine() {
		newLine = user_input.nextLine();
	}
}
