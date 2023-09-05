package Session5;
import java.util.Scanner;
public class ArrayExAdv {
	public static void main(String[] args) {
		double[] javelinThrows = new double [3];
		Scanner myObj = new Scanner(System.in);
		String answer="";
		for (int i=0; i<javelinThrows.length;i++) {
			System.out.println("Throw length");
			answer = myObj.nextLine();
		    javelinThrows[i] = Double.parseDouble(answer);
		}
		for (int i=0; i< javelinThrows.length;i++) {
		    System.out.println("Throw "+ (i+1) + ": " + javelinThrows[i]);
		}
		myObj.close();
	}
}
