import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
            int max = 0;
            int min = 1000000;
            for (int n = 0; n < 10; n++) {
                int sum = 0;
                String num = sc.next();
                for (int i = 0; i < num.length(); i++) {
                    sum += (num.charAt(i) - '0');
                }

                if (sum > max) {
                    max = sum;
                }
                if (sum < min) {
                    min = sum;
                }
            }

            System.out.printf("#%d %d %d\n", t, max, min);
        }
    }
}
