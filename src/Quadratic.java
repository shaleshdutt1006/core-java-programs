import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {

		double root1, root2, root;

		Scanner num = new Scanner(System.in);

		System.out.println("Please Enter value of a");

		double a = num.nextInt();
		double b = num.nextInt();
		double c = num.nextInt();

		double delta = b * b - 4 * a * c;

		if (delta > 0) {

			root1 = (-b + Math.sqrt(delta)) / (2 * a);

			root2 = (-b - Math.sqrt(delta)) / (2 * a);

			System.out.println("The first root is " + root1);
			System.out.println("The Second root is " + root2);
		} else if (delta == 0) {
			root = b / 2 * a;

			System.out.println("Both roots are same and their value is ");
		} else {
			System.out.println("Roots are imaginary not real");
		}
	}

}
