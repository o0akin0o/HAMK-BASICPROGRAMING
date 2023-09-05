package Session4;
import java.util.Scanner; 
public class UserInputEx {

	class Main {
		  public static void main(String[] args) {
		    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		    System.out.println("Please, give the value of 1st number");
		    String answer;
		    answer = myObj.nextLine();
		    int number1 = Integer.parseInt(answer);
		    System.out.println("Please, give the value of 2st number");
		    answer = myObj.nextLine();
		    int number2 = Integer.parseInt(answer);
		    //int sum = 0;
		    //sum = number1 + number2;
		    System.out.println("Would you like to calculate the sum or substration. Please type plus or minus.");
		    String calculate = myObj.nextLine();
		    int result = 0;
		    if ( calculate.equals("plus") ) {
		    	result = number1 + number2;
		    }
		    if ( calculate.equals("minus")  ) {
		    	result = number1 - number2;		    	
		    }
		    /* if (sum >10) {
		    	System.out.println("The value is greater than 10. It is " + (number1 + number2));
		    } else {
		    	System.out.println("The sum is " + (number1 + number2));
		    }*/
		    System.out.println("The result is " + result);
		    myObj.close();
		  }
		}
}
