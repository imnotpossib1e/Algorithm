import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int t = 1; t <= T; t++) {

			int max = 0;
			int maxNum = 0;
			int min = 10000;
			int minNum = 0;
			int arr[] = new int[10];
			double sum = 0;
			for (int n = 0; n < 10; n++) {
				int num = sc.nextInt();
				if (num > max) {
					max = num;
					maxNum = n;
				}
				if (num < min) {
					min = num;
					minNum = n;
				}
				arr[n] = num;
			}

			for (int i = 0; i < 10; i++) {
				if (i != maxNum && i != minNum) {
					sum += arr[i];
				}
			}

			double avg = sum / 8;

			System.out.println("#" + t + " " + Math.round(avg));
		}
	}
}
