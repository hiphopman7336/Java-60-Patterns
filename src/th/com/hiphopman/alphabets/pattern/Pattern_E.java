package th.com.hiphopman.alphabets.pattern;

public class Pattern_E {
	//AlphabetsPattern
	public static void main(String[] args) {
		for (char i = 'A'; i <= 'E'; i++) {
			for (char j = 'A'; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println("");
		}
	}
}