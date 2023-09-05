package Session2;

public class Assignment2_Age {
	public static void main(String[] args) {
		int age = 101;
		if (age > 0 && age < 18) { 
			System.out.println("You are underage."); 
			if (age >= 15) {
				System.out.println("You can drive a moped.");
			} 
		} else if (age >= 65) { 
			System.out.println("You are retired.");
			if (age ==70 | age ==80 | age ==90 | age ==100 | age ==110 | age==120){
				System.out.println("Anniversary Party!!");
			}
			if (age == 100) {
				System.out.println("Congratulations!");
				System.out.println("Congratulations!");
				System.out.println("Congratulations!");
			}
		} else { 
			System.out.println("You are an adult.");
			if (age == 18) {
				System.out.println("You can drive a car.");
			}
			if (age ==10 | age ==20 | age ==30 | age ==40 | age ==50 | age==60){
				System.out.println("Anniversary Party!!");
			}
			if (age >=40 & age <=50 ){
				System.out.println("Wish happy mid-life!!");
			}
		}
		  
	  }
	  
}
