package Session5;

public class ArrayEx1 {
	public static void main(String[] args) {
		String[] furnitures = {"table" ,"chair", "shelf","door","Sofaa"};
		for (int i=0; i< furnitures.length;i++) {
			if (furnitures[i].equals("Sofa")) {
				System.out.println(furnitures[i]);	
			}
		}
	}
}
