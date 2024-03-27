package th.com.hiphopman.number.pattern;

public class Pattern_X {
	//NumberPattern
	public static void main(String[] args) {
		int n = 3;
		int i;
		int j;

		for (i = n; i >= -n; i--) {
			for (j = Math.abs(i); j <= n; j++) {
				System.out.print(j);
			}

			System.out.println(" ");
		}
	}
}