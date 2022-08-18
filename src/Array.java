import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		int arr[][];

		System.out.println("Please Enter number how many rows you want to take ");

		int row = num.nextInt();
		System.out.println("Please Enter number how many column you want to take ");

		int coloumn = num.nextInt();

		arr = new int[row][coloumn];

		for (int i = 0; i < row; i++) {

			for (int j = 0; j < coloumn; j++) {

				System.out.print("Enter element for row = " + (i + 1) + " column = " + (j + 1) + " : ");
				arr[i][j] = num.nextInt();
			}
		}

		System.out.println("You have entered the following array : ");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < coloumn; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
