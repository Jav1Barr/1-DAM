package ex09;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("dime N");
		Integer n = sc.nextInt();
		for (int f = 0; f < n; f++) {
		    for (int c = 0; c < 2 * n - 1; c++) {
		        if (c >= n - 1 - f && c <= n - 1 + f) {
		            System.out.print("*");
		        } else {
		            System.out.print(" ");
		        }
		    }
		    System.out.println();
		}

		for (int f = n - 2; f >= 0; f--) {
		    for (int c = 0; c < 2 * n - 1; c++) {
		        if (c >= n - 1 - f && c <= n - 1 + f) {
		            System.out.print("*");
		        } else {
		            System.out.print(" ");
		        }
		    }
		    System.out.println();
		}
		sc.close();
	}

}
