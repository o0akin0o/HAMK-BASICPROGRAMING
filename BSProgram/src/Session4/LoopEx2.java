package Session4;
import java.util.Scanner; 
public class LoopEx2 {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String answer="";
		System.out.println("Guess my name (type stop to exit)");
		answer = myObj.nextLine();
		int count = 0;
		while (!answer.equals("stop")) {
			if (answer.equals("Emma")) {
				System.out.println("Congratulations!");
				count+=1;
				break;
			}
			System.out.println("Guess my name (type stop to exit)");
			answer = myObj.nextLine();
			count+=1;
		}
		System.out.println("You guessed " + count +" times.");
		myObj.close();
	}
}