package th.com.hiphopman.number.pattern;

public class Pattern_ZD {
	//NumberPattern
	public static void main(String[] args) {
		int height = 5;
		int i;
		int j;
		int k;

		for (i = height; i >= 1; i--) {
			for (j = height - 1; j >= i; j--) {
				System.out.print(" ");
			}

			for (k = i; k >= 1; k--) {
				System.out.print(k + " ");
			}

			System.out.println();
		}
	}
}