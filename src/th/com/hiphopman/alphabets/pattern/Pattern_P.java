package th.com.hiphopman.alphabets.pattern;

public class Pattern_P {
	//AlphabetsPattern
	public static void main(String[] args) {
		int width = 7;
		int space = width / 2;
		int height = width - space;

		for (int i = height - 1; i >= 0; i--) {
			for (int j = space; j >= i; j--) {
				System.out.print(" ");
			}

			for (int k = 1; k <= width; k++) {
				System.out.print((char) (i + 65));
			}
			width -= 2;
			System.out.println("");
		}
	}
}