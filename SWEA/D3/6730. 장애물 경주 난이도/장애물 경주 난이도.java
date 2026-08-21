import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
            // 가장 처음 블록 위에서 가장 마지막 블록 위로 이동
            // 다음 블록 높이가 현재보다 높으면 올라가고 낮으면 내려간다
            // 난이도를 변화가 심한것으로 -> 올라갈때 가장 큰 차이,내려갈때 가장 큰 차이

            int N = sc.nextInt();
            int[] arr = new int[N];

            for (int n = 0; n < N; n++) {
                int max = 0;
                arr[n] = sc.nextInt();
            }

            int downRe = 0;
            int upRe = 0;

            for (int i = 0; i < N - 1; i++) {
                // 내려간다
                if (arr[i] > arr[i + 1]) {
                    int down = arr[i] - arr[i + 1];
                    if (downRe < down) {
                        downRe = down;
                    }
                }

                // 올라간다
                if (arr[i] < arr[i + 1]) {
                    int up = arr[i + 1] - arr[i];
                    if (upRe < up) {
                        upRe = up;
                    }
                }
            }

            System.out.printf("#%d %d %d\n", t, upRe, downRe);

        }
    }
}
