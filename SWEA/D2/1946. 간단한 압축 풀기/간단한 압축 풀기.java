import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
            int N = sc.nextInt();
            String[] str = new String[N];
            int[] num = new int[N];
            for (int n = 0; n < N; n++) {
                str[n] = sc.next();
                num[n] = sc.nextInt();
            }
            int cnt = 0;
            System.out.println("#" + t);
            for (int n = 0; n < N; n++) {
                for (int i = 0; i < num[n]; i++) {
                    System.out.print(str[n]);
                    cnt++;

                    if (cnt == 10) {
                        System.out.println();
                        cnt = 0;
                    }
                }
            }
            System.out.println();
        }
    }
}
