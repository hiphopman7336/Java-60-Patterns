package th.com.hiphopman.alphabets.pattern;

public class Pattern_I {
	//AlphabetsPattern
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print((char) (j + 65));
			}
			System.out.println("");
		}
	}
}