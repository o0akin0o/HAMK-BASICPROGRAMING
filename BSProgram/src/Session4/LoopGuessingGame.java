package Session4;
import java.util.Scanner;
public class LoopGuessingGame {
	public static void main(String[] args) {
		boolean flag = true;
		String name = "Alex";
		int count = 0;
		while (flag) {
			System.out.println("Please, guess my name.");
			Scanner myObj = new Scanner(System.in);
			String answer="";
			answer = myObj.nextLine();
			count+=1;
			if (answer.equals(name)) {
				System.out.println("Congratulations!");
				System.out.println("Guesses: " + count);
				flag = false;
			} else {
				System.out.println("Do you want to quit (y/n) ?");
				answer="";
				answer = myObj.nextLine();
				if (answer.equals("y")) {
					flag = false;
				}else {
					String substr=name.substring(0,count);
					System.out.println("The name will is :" +substr);
				}
			}
			myObj.close();
		}
		
	}
}
