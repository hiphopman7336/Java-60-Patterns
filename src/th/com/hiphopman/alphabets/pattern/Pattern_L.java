package th.com.hiphopman.alphabets.pattern;

public class Pattern_L {
	//AlphabetsPattern
	public static void main(String[] args) {
		int n = 5;
		int a = 5;
		for (int i = n - 1; i >= 0; i--) {
			for (int j = n - 1; j > i; j--) {
				System.out.print(" ");
			}

			for (int k = 0; k < a; k++) {
				System.out.print((char) (i + 65));
			}
			a--;

			System.out.println("");
		}
	}
}