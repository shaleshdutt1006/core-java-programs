import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {

		int temp = 0;
		Scanner num = new Scanner(System.in);

		System.out.println("Please Enter the value of first and second number ");

		int number1 = num.nextInt();

		int number2 = num.nextInt();

		System.out.println("Before Swapping First number is: " + number1 + " And Second number is: " + number2);

		temp = number1;
		number1 = number2;
		number2 = temp;
		System.out.println("After Swapping First number is : " + number1 + " And Second number is: " + number2);
	}

}
