package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Please enter the fibonacci number: ");
		String userInputData = in.nextLine();
		int inputNum = Integer.parseInt(userInputData);

		int previous = 0;
		int current = 1;

		if (inputNum <= 0)
			System.out.println("0 1");
			else{
			System.out.print(previous);
			while (inputNum >= current){
				System.out.print(" "+ current);
				int tempNum = current;
				current = current + previous;
				previous = tempNum;

			}
		}

	}

}
