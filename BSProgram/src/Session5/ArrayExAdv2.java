package Session5;
import java.util.Scanner;
import java.util.ArrayList;
public class ArrayExAdv2 {
	public static void main(String[] args) {
		boolean flag = true;
		Scanner myObj = new Scanner(System.in);
		String answer="";
		ArrayList<String> shoppinglist = new ArrayList<String>();
		while (flag) {
			System.out.println("Add item (x = exit)");
			answer = myObj.nextLine();
			if (!(answer.equals("x"))) {
				shoppinglist.add(answer);
			} else {
				flag = false;
			}
		}
		for (int i=0; i< shoppinglist.size();i++) {
		    System.out.println(shoppinglist.get(i));
		}
		myObj.close();
		
	}
}
