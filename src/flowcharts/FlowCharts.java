package flowcharts;

public class FlowCharts {

	public static void loop1() {
		for (int i = 100; i < 201; i++) {
			System.out.println(i);
		}
	}

	public static void loop2() {
		for (int i = 100; i < 201; i++) {
			if (i % 2 == 0) {
				System.out.println("-");
			} else {
				System.out.println("*");
			}
		}
	}

	public static void loop3() {
		for (int i = 1; i < 11; i++) {

			for (int j = 1; j < 11; j++) {
				System.out.println(i);
			}

		}
	}

	public static void loop4() {
		for (int i = 1; i < 11; i++) {

			for (int j = 1; j < i + 1; j++) {
				System.out.println(i);
			}

		}
	}

}
