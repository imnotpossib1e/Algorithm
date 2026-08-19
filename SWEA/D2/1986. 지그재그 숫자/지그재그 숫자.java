import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
            int num = sc.nextInt();
            int sum = 1;

            for (int i = 2; i <= num; i++) {
                if (i % 2 == 0) {
                    sum -= i;
                } else {
                    sum += i;
                }
            }

            System.out.printf("#%d %d\n", t, sum);
        }
    }
}
