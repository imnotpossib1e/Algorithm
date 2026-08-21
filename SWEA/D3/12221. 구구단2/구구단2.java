import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
            // 10 이상의 자연수 곱은 -1 반환
            int a = sc.nextInt();
            int b = sc.nextInt();
            int re = 0;

            if (a >= 10 || b >= 10) {
                re = -1;
            } else {
                re = a * b;
            }

            System.out.printf("#%d %d\n", t, re);
        }
    }
}
