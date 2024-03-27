package th.com.hiphopman.alphabets.pattern;

public class Pattern_S {
	//AlphabetsPattern
	public static void main(String[] args) {
		int size = 3;

		for (int i = size; i >= -size; i--) {
			for (int j = size; j >= Math.abs(i); j--) {
				System.out.print((char) (j + 65));
			}

			System.out.println("");
		}
	}
}