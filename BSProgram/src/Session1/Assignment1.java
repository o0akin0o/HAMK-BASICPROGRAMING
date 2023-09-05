package Session1;

public class Assignment1 {

	public class Main {
		  public static void main(String[] args) {
			String creator;
			int number1,number2;
			int multiplication;
			int addition;
			double division;
			int subtraction;
		    System.out.println("Printer App");
		    System.out.print("This app is made by:");
		    creator = "Quan";
		    System.out.println(creator);
		    number1 = 10;
		    number2 = 3;
		    //System.out.println(number1);
		    System.out.println("The value of number1 is " + number1);
		    System.out.println("The value of number2 is " + number2);
		    
		    //multiplication
		    multiplication = number1 * number2;
		    System.out.println(number1 + " * " + number2 + " = " +  multiplication);
		    
		    //addition
		    addition = number1 + number2;
		    System.out.println(number1 + " + " + number2 + " = " +  addition);
		    
		    //division
		    division = number1 / number2;
		    System.out.println(number1 + " / " + number2 + " = " +  division);
		    
		    //subtraction		    
		    subtraction = number1 - number2;
		    System.out.println(number1 + " - " + number2 + " = " +  subtraction);
		  		    
		  }
		}
}
