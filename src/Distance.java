import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {

		Scanner num = new Scanner(System.in);

		System.out.println("Please Enter value of x");

		int x = num.nextInt();

		System.out.println("Please Enter value of y");
		int y = num.nextInt();

		double distance = Math.sqrt(x * x + y * y);

		System.out.println(distance);
	}

}
