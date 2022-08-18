import java.util.Scanner;

public class LeapYearOrNot {

	public static void main(String[] args) {

		Scanner Input1 = new Scanner(System.in);
		System.out.println("Please Enter Year which You Want to Test");
		int Year = Input1.nextInt();

		int flag = (Year % 400 == 0) || (Year % 4 == 0 && Year % 100 != 0) ? 1 : 0;
		if (flag == 1) {
			System.out.println("This is a Leap Year");
		} else {
			System.out.println("This is a Leap Year");
		}
	}
}
