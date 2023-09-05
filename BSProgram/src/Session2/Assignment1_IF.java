package Session2;

public class Assignment1_IF {

	  public static void main(String[] args) {
		  //ques1();
		  //ques2();
		  ques3();
		  
	  }
	  
	  static void ques1() {
		  int number1,number2;
		  number1=3;
		  number2=4;
		  if (number1 == number2) {
			  System.out.println("number 1 and number 2 are equal");
		  }
		  if (number1 > number2 )  {
			  System.out.println("number 1 is greater than number 2 ");
		  }
		  if (number1 >= number2) {
			  System.out.println("number 1 is greater or equal to number 2 ");
		  }
		  if (number1 != number2) {
			  System.out.println("number 1 is NOT equal to number 2 ");
		  }	 
	  }
	  static void ques2() {
		  int number1,number2,number3;
		  number1=7;
		  number2=6;
		  number3=7;
		  if (number1 == number2 & number2 == number3) {
			  System.out.println("all number are equal");
		  }
		  if (number1 == number2 | number2 == number3) {
			  System.out.println("number 1 and number 2 are equal OR number 2 and number 3 are equal");
		  }
		  if (number1 > number2 & number1 > number3) {
			  System.out.println("number 1 is greater than number 2 and number 1 is greater than number 3");
		  }
		  if (number1 > number2) {}
		  else if (number2 > number3) {
			  System.out.println("number 1 not greater than number 2 and number2 is greater than number3");
		  }
		  if (number1 == number2) {}
		  else if (number1 == number3) {
			  System.out.println("number 1 not equal than number 2 and number1 and number3 are equal");
		  }
	  }
	  static void ques3() 
	  {
		  String name1,name2,name3;
		  name1="TOM";
		  name2="TOME";
		  name3="TOM";
		  if (name1.equals(name2)) {
			  System.out.println("name1 and name2 are equal");
		  } 
		  if (!name1.equals(name2)) {
			  System.out.println("name1 and name2 are not equal");
		  }
		  if (name1.equals(name2))
		  {			  
		  } else if (name1.equals(name3)) {
			  System.out.println("name1 and name2 are not equal and name1 and name3 are equal");
		  }
	  }
}
