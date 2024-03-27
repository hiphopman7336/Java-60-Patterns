package th.com.hiphopman.alphabets.pattern;

public class Pattern_G {
	//AlphabetsPattern
	public static void main(String[] args) {
		for (int i = 0; i <= 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print((char) (i + 65));
			}
			System.out.println("");
		}
	}
}