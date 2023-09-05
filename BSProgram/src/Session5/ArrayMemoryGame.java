package Session5;
import java.util.Random;
import java.util.Scanner;
public class ArrayMemoryGame {
	public static void main(String[] args) {
		int[] Listnum = new int [7];
		int[] Listgess = new int [7];
		Scanner myObj = new Scanner(System.in);
		String answer="";
		System.out.println("Try to remember the following numbers. The numbers will be shown for 4 seconds.");
		for (int i=0;i<Listnum.length;i++) {
			Random random = new Random();
			int randomNumber;
			randomNumber = random.nextInt(4)+1;
			Listnum[i] = randomNumber;
			System.out.print(Listnum[i] + " ");
		}
		try { // The pause will last 1 second 
			Thread.sleep(4000); } 
		catch(InterruptedException ex)		{ 
			Thread.currentThread().interrupt(); }
		for (int i = 0; i < 20; ++i) {
			System.out.println();
		}
		for (int i=0;i<Listgess.length;i++) {
			System.out.println("Type number " + (i+1) +":");
			answer = myObj.nextLine();
			Listgess[i] = Integer.parseInt(answer);
		}
		System.out.println("The numbers were:");
		for (int i=0;i<Listnum.length;i++) {
			System.out.print(Listnum[i] + " ");
		}
		System.out.println();
		System.out.println("Your numbers were:");
		for (int i=0;i<Listgess.length;i++) {
			System.out.print(Listgess[i] + " ");
		}
		myObj.close();
	}
}
