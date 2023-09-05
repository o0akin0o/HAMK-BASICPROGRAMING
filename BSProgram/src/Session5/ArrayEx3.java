package Session5;
import java.util.Random;
public class ArrayEx3 {
	public static void main(String[] args) {
		int[] thrownDiceNumbers=new int[5];
		int count =0;
		int number;
		boolean flag = true;
		while (flag) {
			int flag2 = 0;
			Random random = new Random();
			number =random.nextInt(19)+1;
			for (int i=0;i<thrownDiceNumbers.length;i++) {
				if (thrownDiceNumbers[i] == number) {
					flag2+=1;
				}
			}
			if (flag2 == 0) {
				thrownDiceNumbers[count] = number;
				//System.out.println(thrownDiceNumbers[count]);
				count+=1;
			} 			
			if (count ==5) {
				flag = false;
			}
		}
		for (int i=0; i <5;i++) {
			System.out.print(thrownDiceNumbers[i] + " ");
		}
		
	}
}
