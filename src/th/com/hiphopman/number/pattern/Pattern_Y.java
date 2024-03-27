package th.com.hiphopman.number.pattern;

public class Pattern_Y {
	//NumberPattern
	public static void main(String[] args) {
		int n = 3;
		int i;
		int j;
		int k;

		for (i = n; i >= -n; i--) {
			for (j = 1; j <= Math.abs(i); j++) {
				System.out.print(" ");
			}

			for (k = n; k >= Math.abs(i); k--) {
				System.out.print(k);
			}

			System.out.println();
		}
	}
}