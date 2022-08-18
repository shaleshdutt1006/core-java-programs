import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {

		int base, exponent, expo, power = 1;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the base: ");
		base = sc.nextInt();

		System.out.print("Enter the exponent: ");
		exponent = sc.nextInt();

		while (exponent != 0) {

			power = power * base;

			System.out.println(base + " to the power " + exponent + " is: " + power);

			--exponent;
		}

		System.out.println("the result is " + power);
	}

}
