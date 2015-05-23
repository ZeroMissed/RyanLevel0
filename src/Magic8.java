import java.util.Random;

public class Magic8 {
	public static void main(String[] args) {
		int rand = new Random().nextInt(4);
		rand++;
		switch (rand) {

		case 1:
			System.out.println("You look good!");
			break;
		case 2:
			System.out.println("You look ok!");
			break;
		case 3:
			System.out.println("You look bad!");
			break;

		}

	}
}
