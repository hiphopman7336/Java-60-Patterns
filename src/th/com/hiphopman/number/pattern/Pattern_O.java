package th.com.hiphopman.number.pattern;

public class Pattern_O {
	//NumberPattern
	public static void main(String[] args) {
		int n = 3;
		int i;
		int j;

		for (i = n; i >= -n; i--) {
			for (j = n; j >= Math.abs(i); j--) {
				System.out.print(j);
			}

			System.out.println(" ");
		}
	}
}