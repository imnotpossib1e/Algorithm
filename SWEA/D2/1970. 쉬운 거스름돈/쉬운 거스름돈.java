import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int t = 1; t <= T; t++) {
			int M = sc.nextInt();
			int coin1 = 0;
			int coin5 = 0;
			int coin10 = 0;
			int coin50 = 0;
			int bill1 = 0;
			int bill5 = 0;
			int bill10 = 0;
			int bill50 = 0;

			bill50 = M / 50000;
			M = M - (bill50 * 50000);

			bill10 = M / 10000;
			M = M - (bill10 * 10000);

			bill5 = M / 5000;
			M = M - (bill5 * 5000);

			bill1 = M / 1000;
			M = M - (bill1 * 1000);

			coin50 = M / 500;
			M = M - (coin50 * 500);

			coin10 = M / 100;
			M = M - (coin10 * 100);

			coin5 = M / 50;
			M = M - (coin5 * 50);

			coin1 = M / 10;
			M = M - (coin1 * 10);

			System.out.println("#" + t);
			System.out.printf("%d %d %d %d %d %d %d %d\n", bill50, bill10, bill5, bill1, coin50, coin10, coin5, coin1);

		}
	}
}