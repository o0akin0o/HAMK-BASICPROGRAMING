import java.util.Scanner;

public class Exam {

	public static void checkActivityRecommendation (String activityLevel, int amount, int count) {
		if ( (amount >= 75 && activityLevel.equals("vigorous")) && count>=2 || (amount >= 150 && activityLevel.equals("moderate") && count>=2) )
			System.out.println("You exercise enough according to the recommendations!");
		else
			System.out.println("You should exercise more!");
	}
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String answer="";
		System.out.println("Activity level of exercise (vigorous/moderate)?");
		answer = myObj.nextLine();
		String mode = answer;
		int totaltime =0;
		for (int i=1; i<8; i++) {
			System.out.println("Minutes on "+ i +". day?");
			answer = myObj.nextLine();
			int time = Integer.parseInt(answer);
			totaltime += time;
		}
		System.out.println("How many times you did muscle strengthening and balance activities?");
		answer = myObj.nextLine();
		int count = Integer.parseInt(answer);
		System.out.println("You did "+ totaltime +" minutes "+ mode +" exercise during week.");
		checkActivityRecommendation(mode,totaltime,count);
		myObj.close();
	}
}