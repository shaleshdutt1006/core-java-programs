
public class FlipCoin {

	public static void main(String[] args) {
		int tail = 0, head = 0;

		for (int i = 0; i <= 20; i++) {
			int randomNum = (int) (Math.floor(Math.random() * (1 - 0 + 1) + 0));

			if (randomNum < 0.5) {
				tail++;

			} else {
				head++;
			}
		}

		System.out.println("The Number of tails are " + tail);
		System.out.println("The Number of heads are " + head);
		System.out.println("Percentage of head is " + head * 100 / 20);
		System.out.println("Percentage of tail is " + tail * 100 / 20);
		System.out.println("Percentage of head  over tail is " + head * 100 / tail);
		System.out.println("Percentage of tail over head is " + tail * 100 / head);

	}

}
