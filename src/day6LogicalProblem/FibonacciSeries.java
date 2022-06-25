package day6LogicalProblem;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
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