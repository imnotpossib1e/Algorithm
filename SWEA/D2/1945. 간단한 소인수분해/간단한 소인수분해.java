import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
            int N = sc.nextInt();
            int[] arr = new int[5];

            while (true) {
                if (N % 2 == 0) {
                    N /= 2;
                    arr[0]++;
                } else if (N % 3 == 0) {
                    N /= 3;
                    arr[1]++;
                } else if (N % 5 == 0) {
                    N /= 5;
                    arr[2]++;
                } else if (N % 7 == 0) {
                    N /= 7;
                    arr[3]++;
                } else if (N % 11 == 0) {
                    N /= 11;
                    arr[4]++;
                } else {
                    break;
                }
            }

            System.out.printf("#%d", t);
            for (int i = 0; i < 5; i++) {
                System.out.printf(" %d", arr[i]);
            }
            System.out.println();
        }
    }
}
