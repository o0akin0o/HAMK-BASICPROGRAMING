package Session5;
import java.util.Random;
public class ArrayEx2 {
	public static void main(String[] args) {
		int[] thrownDiceNumbers=new int[5];
		int sum=0;
		int max=0;
		for (int i=0;i<thrownDiceNumbers.length;i++) {
			Random random = new Random();
			thrownDiceNumbers[i] =random.nextInt(9);
			System.out.print(thrownDiceNumbers[i] + " ");
			sum+=thrownDiceNumbers[i];
			if (thrownDiceNumbers[i] > max) {
				max =  thrownDiceNumbers[i];
			}
		}
		System.out.println();
		System.out.println("The sum of array is " + sum);
		System.out.println("Highest value  of array is " + max);
		
	}
}
