package th.com.hiphopman.alphabets.pattern;

public class Pattern_F {
	//AlphabetsPattern
	public static void main(String[] args) {
		for (char i = 'A'; i <= 'E'; i++) {
			for (char j = 'A'; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
	}
}