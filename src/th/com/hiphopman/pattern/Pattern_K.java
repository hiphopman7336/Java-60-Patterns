package th.com.hiphopman.pattern;

import java.util.Scanner;

public class Pattern_K {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the size:");
	        int input = sc.nextInt();
	        int odd = 1;
	        int noOfSpaces = input / 2+1;
	        for (int i = 1; i <= input; i++) {
	            for (int k = noOfSpaces; k >= 1; k--) {
	                System.out.print(" ");
	            }
	            for (int j = 1; j <= odd; j++) {
	                System.out.print("*");      
	            }
	            System.out.println();
	 
	            if(i < input/2+1)
	            {
	                odd = odd + 2;
	                noOfSpaces--;
	            }
	            else
	            {
	                odd = odd - 2;
	                noOfSpaces++;
	            }
	        }
	        sc.close();
	}
}