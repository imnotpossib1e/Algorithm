import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.io.FileInputStream;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		//N: 배열 크기
		//M: 파리채 크기
		//배열만큼 입력받기
		
		for(int t = 0; t<T; t++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			int[][] arr = new int[N][N];
			
			// 배열 입력받기
			for(int i = 0; i<N; i++) {
				for(int j = 0; j<N; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			int max = 0;
			int sum = 0;
			// 시작점에서 M-1만큼 범위 전체의 덧셈 후 비교
			for(int a = 0; a<=N-M; a++) {
				for(int b = 0; b<=N-M; b++) {
					sum = 0;
					for(int i = a; i<a+M; i++) {
						for(int j = b; j<b+M; j++) { 
							sum += arr[i][j];
						}
					}
					if(sum > max) {
						max = sum;
					}
				}
			}
			System.out.println("#"+(t+1) + " " + max);
		}
	}
}
