import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.io.FileInputStream;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		// NxN 행렬
		// 시계방향으로 90, 180, 270도 회전
		for(int t = 1; t<=T; t++) {
			int arr[][] = new int[9][9];
			
			// 배열 입력 
			for(int i = 0; i<9; i++) {
				for(int j = 0; j<9; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			
			int cnt=0;
			// 가로줄
			for(int i = 0; i<9; i++) {
				int row[] = new int[9];
				for(int j = 0; j<9; j++) {
					row[arr[i][j]-1]++;
				}
				for(int j = 0; j<9; j++) {
					if(row[j] >1) {
						cnt++;
					}
				}
			}

			// 세로줄

			for(int i = 0; i<9; i++) {
				int col[] = new int [9];
				for(int j = 0; j<9; j++) {
					col[arr[j][i]-1]++;
				}
				for(int j = 0; j<9; j++) {
					if(col[j] > 1) {
						cnt++;
					}
				}
			}
			
			
			
			for(int n = 0; n<9; n+=3) {	
				int box[] = new int[9];
				for (int i=0; i<3; i++) {
					for (int j = 0; j<3; j++){
						box[arr[i][j]-1]++;
					}
				}
				for (int i=0; i<9; i++) {
					if(box[i] > 1) {
						cnt++;
					}
				}
			}

			
			if(cnt==0) {
				System.out.printf("#%d %d\n", t, 1);
			}else {
				System.out.printf("#%d %d\n", t, 0);
			}
			
		}
	
		
	}
}
