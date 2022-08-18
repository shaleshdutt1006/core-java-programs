import java.util.Scanner;

public class QuotientAndRemainder {

	public static void main(String[] args) {
		int Q, rem;
		Scanner num = new Scanner(System.in);

		System.out.println("Please Enter number you want to divide");

		int dividend = num.nextInt();

		System.out.println("Please Enter number from which you  want to divide");
		int divisor = num.nextInt();

		Q = dividend / divisor;
		rem = dividend % divisor;
		System.out.println("Quotient of the number is : " + Q);
		System.out.println("Remainder of the number is : " + rem);

	}

}
