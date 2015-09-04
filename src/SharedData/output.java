package SharedData;
import java.util.Vector;

public class output {
	public  void executeOutput(Vector<String> sentenceFinal, int len) {
		System.out.println("final output");
		for (int b=0;b<len;b++){
			if (sentenceFinal.get(b).indexOf(" ")<0)
				System.out.println(sentenceFinal.get(b).toUpperCase());
			else {
				System.out.println(sentenceFinal.get(b).substring(0, sentenceFinal.get(b).indexOf(" ")).toUpperCase()
						+ " " + sentenceFinal.get(b).substring(sentenceFinal.get(b).indexOf(" ") + 1,
								sentenceFinal.get(b).length()));
			}
		}
		System.out.println();
	}
}
