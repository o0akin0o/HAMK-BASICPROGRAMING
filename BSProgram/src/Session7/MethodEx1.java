package Session7;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class MethodEx1 {
	public static void main(String[] args) {
		printTitle();
		//multiplie1k(inputNum());
		/*System.out.println("Please, input the width:");
		Scanner myObj = new Scanner(System.in);
		String answer="";
		answer = myObj.nextLine();
		int width= Integer.parseInt(answer);
		System.out.println("Please, input the length:");
		answer = myObj.nextLine();
		int length= Integer.parseInt(answer);
		myObj.close();
		//area(width,length);
		System.out.println("Area is:" + area2(width,length));
		if (area2(width,length) > 50) {
			System.out.println("Huge room");
		} else {
			System.out.println("Standard room size");
		}
		String[] furnitures = {"table" ,"chair", "shelf","door","sofaa"};
		for (int i=0; i < furnitures.length;i++) {
			System.out.println(furnitures[i]);
		}
		System.out.println("Soft table is ");
		printTableSorted(furnitures);*/
		ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    System.out.println(cars);
	    printListSorted(cars);
		
		
	}
	public static void printTitle() {
	    System.out.println("********************");
	    System.out.println("* Method Exercises *");
	    System.out.println("********************");
	    
	 }
	public static void multiplie1k(int i) {
		System.out.println(i*1000);
	}
	public static int inputNum() {
		System.out.println("Please, input the number:");
		Scanner myObj = new Scanner(System.in);
		String answer="";
		answer = myObj.nextLine();
		int i= Integer.parseInt(answer);
		myObj.close();
		return i;
	}
	public static void area(int width, int length) {
		System.out.println("Area is:" + (width * length));
	}
	public static int area2(int width, int length) {
		int area = width * length;
		
		return area;
	}
	public static void printTableSorted (String[] table) {
		Arrays.sort(table);
		for (int i=0; i < table.length;i++) {
			System.out.println(table[i]);
		}
	}
	public static void printListSorted (ArrayList <String> table) {
		table.sort(null);
		System.out.println(table);
	}
}
