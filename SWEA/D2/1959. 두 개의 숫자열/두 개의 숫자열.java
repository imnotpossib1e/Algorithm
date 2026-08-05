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
			int M = sc.nextInt();
			
			int arr1[] = new int [N];
			int arr2[] = new int [M];
			
			for(int i = 0; i<N; i++) {
				arr1[i]=sc.nextInt();
			}
			
			for(int j = 0; j<M; j++) {
				arr2[j]=sc.nextInt();
			}
			
			int max = Integer.MIN_VALUE;
			int sum = 0;
			int cnt = 0;

			if(M > N) {
				for(int i = 0; i<M-N+1; i++) {
					sum = 0;
					
					for(int j = 0; j<N; j++) {
						sum += arr1[j]*arr2[j+cnt];
						
					}
					cnt++;
					
					if(max <= sum) {
						max = sum;
					}
				}
				
			}else {
				for(int i = 0; i<N-M+1; i++) {
					sum = 0;
					for(int j = 0; j<M; j++) {
						sum += arr1[j+cnt]*arr2[j];
					}
					cnt++;
					if(max < sum) {
						max = sum;
					}
				}
			}
			
			System.out.printf("#%d %d\n", t, max);
		}
	}
}
