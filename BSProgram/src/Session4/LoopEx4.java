package Session4;
import java.util.Scanner;
public class LoopEx4 {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String answer="";
		System.out.println("How many rows?");
		answer = myObj.nextLine();
		int rows = Integer.parseInt(answer);
		int i=0;
		while (i<rows) {
			for (int z=1; z< rows - i; z++) {
				System.out.print(" ");
			}
			for (int j=0; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
			i+=1;
		}
		myObj.close();
	}
}
