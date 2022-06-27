package day6LogicalProblem;


import java.util.Scanner;

public class CouponNumber {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		/**
		 * taking input 5 , 3-digit number from user
		 * then taking a random number of 3 digit
		 * checking while random is same as the 5 3-digit number from user
		 * if matched then Coupon Number generated
		 * 
		 */
		
		System.out.println("Enter five numbers of 3 digits");
		Scanner sc1 = new Scanner(System.in);
		int A1 = sc1.nextInt();
		Scanner sc2 = new Scanner(System.in);
		int A2 = sc2.nextInt();
		Scanner sc3 = new Scanner(System.in);
		int A3 = sc3.nextInt();
		Scanner sc4 = new Scanner(System.in);
		int A4 = sc4.nextInt();
		Scanner sc5 = new Scanner(System.in);
		int A5 = sc5.nextInt();
		
		int X=1;
		while (X<999999)	{
			
		X = 100 + (int)(Math.random() * 999);
		
		
		if (X==A1) {
			System.out.println("matched " +A1);
		}
		else if (X==A2) {
			System.out.println("matched " +A2);
		}
		else if (X==A3) {
			System.out.println("matched " +A3);
		}
		else if (X==A4) {
			System.out.println("matched " +A4);
		}
		else if (X==A5) {
			System.out.println("matched " +A5);
		}
		}
	}

}
