import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
            // L분 이상 U분 이하의 운동
            // 이번주에는 X분 운동함

            // L U X 순서로 임력받는다
            int l = sc.nextInt();
            int u = sc.nextInt();
            int x = sc.nextInt();

            int re = 0;

            if (x > l && x < u) {
                re = 0;
            } else if (x > u) {
                re = -1;
            } else {
                re = l - x;
            }

            System.out.printf("#%d %d\n", t, re);
        }
    }
}
