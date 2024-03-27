package th.com.hiphopman.number.pattern;

public class Pattern_T {
	//NumberPattern
	public static void main(String[] args) {
		int n = 4;
		int z = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = n - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = i - 1; k >= -(i - 1); k--) {
				System.out.print(i - Math.abs(k));
			}
			z += 2;
			System.out.println();
		}
	}
}