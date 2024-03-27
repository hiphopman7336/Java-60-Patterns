package th.com.hiphopman.alphabets.pattern;

public class Pattern_Q {
	//AlphabetsPattern
	public static void main(String[] args) {
		int width = 7;
		int space = width / 2;
		int height = width - space;

		for (int i = height; i >= 1; i--) {
			for (int j = space; j >= i; j--) {
				System.out.print(" ");
			}

			for (int k = 1; k <= width; k++) {
				System.out.print((char) ((width - 1) + 65));
			}
			width -= 2;
			System.out.println("");
		}
	}
}