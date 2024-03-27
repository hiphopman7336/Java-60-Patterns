package th.com.hiphopman.pattern;

import java.util.Scanner;

public class Pattern_D {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size:");
		int input = sc.nextInt();
		for(int i = 0; i < input; i++) {
        	for(int j = input-1; j >= 0; j--) {
        		if(j > i) {
        			System.out.print(" ");
        		}else {
        			System.out.print("*");
        		}
        	}
        	System.out.println();
        }
		sc.close();
	}
}