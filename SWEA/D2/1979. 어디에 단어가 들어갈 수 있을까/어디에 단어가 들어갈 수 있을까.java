import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.io.FileInputStream;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t = 1; t<=T; t++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int[][] arr = new int[N][N];
			
			int reCnt =0;

			for(int i = 0; i<N; i++) {
				for(int j = 0; j<N; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			for(int i = 0; i<N; i++) {
				int cnt = 0;
				for(int j = 0; j<N; j++) {
					if(arr[i][j] == 1) {
						cnt++;
					}else {
						if(cnt == K){
							reCnt++;
						}
						cnt = 0;
					}
				}
				if(cnt == K) {
					reCnt++;
				}
			}
			for(int i = 0; i<N; i++) {
				int cnt = 0;
				for(int j = 0; j<N; j++) {
					if(arr[j][i] == 1) {
						cnt++;
					}else {
						if(cnt == K){
							reCnt++;
						}
						cnt = 0;
					}
				}
				if(cnt == K) {
					reCnt++;
				}
			}
			System.out.println("#" + t + " " + reCnt);
		}
	}
}
