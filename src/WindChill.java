import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("Please enter value of temperature");
		int t = num.nextInt();
		System.out.println("Please enter value of velocity");
		int v = num.nextInt();

		if (t < 50 && v < 120 && v > 3) {

			double w = 35.74 + 0.6215 * t + (0.4215 * t - 35.75) * (Math.pow(v, 0.16));
			System.out.println("Temperature = " + t);
			System.out.println("Wind velocity  = " + v);
			System.out.println("Wind chill  = " + w);
		} else {
			System.out.println("Formula is invalid for this range");
		}

	}

}
