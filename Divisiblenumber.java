package com.codegnan.operatorsexamples;

import java.util.Scanner;

public class Divisiblenumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = scanner.nextInt();
		String result = (number %5 == 0)?"Divisible by 5":"not divisible by 5";
		System.out.println("The number is " +result+ ":");
		scanner.close();

	}

}
