import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
            int h = sc.nextInt();
            int j = sc.nextInt();

            int sum = h + j;

            if (sum / 24 != 0) {
                sum = sum % 24;
            }

            System.out.printf("#%d %d\n", t, sum);
        }
    }
}
