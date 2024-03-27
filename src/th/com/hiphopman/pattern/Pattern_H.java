package th.com.hiphopman.pattern;

import java.util.Scanner;

public class Pattern_H {
	public static void main(String[] args) {
		int min_stars = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size:");
		int input = sc.nextInt();
		int space = input - 1;
		for (int i = 0; i < input; i++) {
			for (int j = space; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= min_stars; k++) {
				System.out.print("*");

			}
			min_stars += 2;
			System.out.println();
		}
		sc.close();
	}
}