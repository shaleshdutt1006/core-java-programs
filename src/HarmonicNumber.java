import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {

		double i;
		double sum = 0;
		double number;
		Scanner num = new Scanner(System.in);

		System.out.println("Please Enter number you want to take harmonic value upto ");

		number = num.nextInt();

		for (i = 1; i <= number; i++) {
			sum = sum + (1 / i);
		}

		System.out.println("Harmonic value up to " + number + " is " + sum);
	}
}
