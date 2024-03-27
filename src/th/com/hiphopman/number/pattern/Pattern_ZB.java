package th.com.hiphopman.number.pattern;

public class Pattern_ZB {
	//NumberPattern
	public static void main(String[] args) {
		int i;
		int j;
		int k;

		for (i = 1; i <= 5; i++) {
			for (j = 4; j >= i; j--) {
				System.out.print(" ");
			}

			for (k = 1; k <= i; k++) {
				System.out.print(k + " ");
			}

			System.out.println();
		}
	}
}