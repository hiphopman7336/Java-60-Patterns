package th.com.hiphopman.number.pattern;

public class Pattern_K {
	//NumberPattern
	public static void main(String[] args) {
		int n = 5;
		int a = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = n - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= a; k++) {
				System.out.print(i);
			}
			a++;
			System.out.println();
		}
	}
}