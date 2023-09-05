package Session4;
import java.util.Scanner;
import java.util.Random;
public class LoopLucky7 {
	public static void main(String[] args) {
		System.out.print("how much you wants to play the game: ");
		Scanner myObj = new Scanner(System.in);
		String answer="";
		answer = myObj.nextLine();
		int money = Integer.parseInt(answer);
		while (money >0) {
			System.out.println("Your money you have " + money);
			money-=1;
			int flag=0;
			System.out.print("Three number: ");
			for (int i=0;i<3;i++) {
				Random random = new Random();
				int randomNumber;
				randomNumber = random.nextInt(9)+1;
				System.out.print(randomNumber + " ");
				if (randomNumber ==7 ) {
					flag+=1;
				}
			}
			System.out.println();
			if (flag >0) {
				System.out.println("You won");
			} else {
				System.out.println("You lost");
			}
			if (flag == 1) {
				money+=3;
			} else if (flag == 2){
				money+=5;
			} else if (flag == 3) {
				money+=10;
			}
			System.out.print("Do you want to play continous, type any character to continous and type n/N to stop ");
			answer="";
			answer = myObj.nextLine();
			if (answer.equals("N") | answer.equals("n")) {
				System.out.println("Your money you have " + money + ". Goodbye, see you late !");
				break;
			}
		}
		myObj.close();
	}
}
