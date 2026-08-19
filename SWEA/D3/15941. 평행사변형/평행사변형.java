import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
            int N = sc.nextInt();
            int sum = (N + N) * N / 2;

            System.out.printf("#%d %d\n", t, sum);
        }
    }
}
