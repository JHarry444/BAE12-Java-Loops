package loops;

public class App {

	public static void main(String[] args) {
		// start at 1; go up to 100; increase by 1 each time;
		for (int i = 1; i < 101; i++) {
			if (i % 2 == 0) {
				continue;
			}
			if (i == 9) {
				return;
			}
			for (int j = 1; j < 11; j++) {
				System.out.println(i);
				if (j > 1) {
					break;
				}
			}
		}

		while (true) {
			System.out.println("hello");
			break;
		}
		boolean run = true;

		int i = 100;
		while (i > 0) {
			System.out.println(i);
			i--;
		}

		boolean contin = true;
		do {
			System.out.println("wat up");
			contin = false;
		} while (contin);

	}

}
