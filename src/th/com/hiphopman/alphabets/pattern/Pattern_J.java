package th.com.hiphopman.alphabets.pattern;

public class Pattern_J {
	//AlphabetsPattern
	public static void main(String[] args) {
		int n = 5;
		int a = 1;
		for (int i = 0; i < n; i++) {
			for (int j = n - 1; j > i; j--) {
				System.out.print(" ");
			}

			for (int k = 1; k <= a; k++) {
				System.out.print((char) (i + 65));
			}
			a++;

			System.out.println("");
		}
	}
}