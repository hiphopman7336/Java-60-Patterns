package th.com.hiphopman.alphabets.pattern;

public class Pattern_M {
	//AlphabetsPattern
	public static void main(String[] args) {
		int n = 5;
		int a = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}

			for (int k = 0; k < a; k++) {
				System.out.print((char) (k + 65));
			}
			a--;
			System.out.println("");
		}
	}
}