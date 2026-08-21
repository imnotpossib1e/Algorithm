import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
            // n명의 사람 소득이 주어졌을 때 이 중 평균 이하의 소득을 가진 사람의 수 출력

            int N = sc.nextInt();
            int[] arr = new int[N];
            int sum = 0;
            for (int n = 0; n < N; n++) {
                arr[n] = sc.nextInt();
                sum += arr[n];
            }

            int avg = sum / N;
            int cnt = 0;
            for (int n = 0; n < N; n++) {
                if (arr[n] <= avg) {
                    cnt++;
                }
            }

            System.out.printf("#%d %d\n", t, cnt);
        }
    }
}
