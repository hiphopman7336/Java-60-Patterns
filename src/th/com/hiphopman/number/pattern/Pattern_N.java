package th.com.hiphopman.number.pattern;

public class Pattern_N {
	//NumberPattern
	public static void main(String[] args) {
		int n = 5;
		int a = 5;
		for (int i = n; i >= 1; i--) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= a; k++) {
				System.out.print(k);
			}
			a--;
			System.out.println();
		}
	}
}