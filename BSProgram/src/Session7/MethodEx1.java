package Session7;
import java.util.Scanner;
public class MethodEx1 {
	public static void main(String[] args) {
		printTitle();
		multiplie1k(inputNum());
		
	}
	static void printTitle() {
	    System.out.println("********************");
	    System.out.println("* Method Exercises *");
	    System.out.println("********************");
	    
	 }
	static void multiplie1k(int i) {
		System.out.println(i*1000);
	}
	static int inputNum() {
		System.out.println("Please, input the number:");
		Scanner myObj = new Scanner(System.in);
		String answer="";
		answer = myObj.nextLine();
		int i= Integer.parseInt(answer);
		myObj.close();
		return i;
	}
}
