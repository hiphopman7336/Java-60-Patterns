package th.com.hiphopman.number.pattern;

public class Pattern_E {
	//NumberPattern
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println(" ");
		}
	}
}