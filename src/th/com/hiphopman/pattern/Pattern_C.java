package th.com.hiphopman.pattern;

import java.util.Scanner;

public class Pattern_C {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size:");
		int input = sc.nextInt();
		for (int i = 0; i < input; i++) {
			for (int j = input; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}