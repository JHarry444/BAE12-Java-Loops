package flowcharts;

public class Coins {

	public static void makeChange(int cost, int amount) {
		int twentyPoundNotes = 0;
		int tenPoundNotes = 0;
		int fivePoundNotes = 0;
		int twoPoundCoins = 0;
		int onePoundCoins = 0;
		int fiftyPence = 0;
		int twentyPence = 0;
		int tenPence = 0;
		int fivePence = 0;
		int twoPence = 0;
		int onePence = 0;

		while (amount - cost >= 2_000) {
			twentyPoundNotes++;
			amount -= 2_000;
		}

		while (amount - cost >= 1_000) {
			tenPoundNotes++;
			amount -= 1_000;
		}

		while (amount - cost >= 500) {
			fivePoundNotes++;
			amount -= 500;
		}

		while (amount - cost >= 200) {
			twoPoundCoins++;
			amount -= 200;
		}

		while (amount - cost >= 100) {
			onePoundCoins++;
			amount -= 100;
		}
		while (amount - cost >= 50) {
			fiftyPence++;
			amount -= 50;
		}
		while (amount - cost >= 20) {
			twentyPence++;
			amount -= 20;
		}
		while (amount - cost >= 10) {
			tenPence++;
			amount -= 10;
		}
		while (amount - cost >= 5) {
			fivePence++;
			amount -= 5;
		}
		while (amount - cost >= 2) {
			twoPence++;
			amount -= 2;
		}
		while (amount - cost >= 1) {
			onePence++;
			amount -= 1;
		}

		System.out.print("£20: ");
		System.out.println(twentyPoundNotes);
		System.out.print("£10: ");
		System.out.println(tenPoundNotes);
		System.out.print("£5: ");
		System.out.println(fivePoundNotes);
		System.out.print("£2: ");
		System.out.println(twoPoundCoins);
		System.out.print("£1: ");
		System.out.println(onePoundCoins);
		System.out.print("50p: ");
		System.out.println(fiftyPence);
		System.out.print("20p: ");
		System.out.println(twentyPence);
		System.out.print("10p: ");
		System.out.println(tenPence);
		System.out.print("5p: ");
		System.out.println(fivePence);
		System.out.print("2p: ");
		System.out.println(twoPence);
		System.out.print("1p: ");
		System.out.println(onePence);
	}

}
