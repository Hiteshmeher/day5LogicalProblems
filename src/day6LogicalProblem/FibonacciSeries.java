package day6LogicalProblem;

import java.util.Scanner;

public class FibonacciSeries {
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		/*
		 * initialize two vale 0 and 1
		 * taking range from user
		 * add the 1st no and 2nd no in a variable i
		 * after this 2nd num will 1st num and i will be 2nd no
		 * same process till range
		 * 
		 */
		int a = 0, b = 1, i;
		System.out.println("Enter the Range ");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (i = 2; i <= N; i++) {
			System.out.println(+a);
			int nextTerm = a + b;
			a = b;
			b = nextTerm;
		}
	}
}