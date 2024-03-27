package th.com.hiphopman.alphabets.pattern;

public class Pattern_O {
	//AlphabetsPattern
	public static void main(String[] args) {
		int m = 0;
		int height = 5;
		int space = height - 1;

		for (int i = 0; i <= height; i++) {
			for (int j = space; j > i; j--) {
				System.out.print(" ");
			}

			for (int k = 0; k <= m; k++) {
				System.out.print((char) (m + 65));
			}
			m += 2;
			System.out.println("");
		}
	}
}