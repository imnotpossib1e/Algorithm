import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.io.FileInputStream;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
	
		// 총점 = 중간(35%) + 기말(45%) + 과제(20%)
		// 학점은 각 N/10명의 학생에게 동일 평점
		// N=학생수
		// K=학점을 알고싶은 번호
		for(int t = 1; t<=T; t++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			
			// 성적 배열
			int scores[][] = new int [N][3];
			
			// 성적 배열
			String[] credit =  {"D0", "C-", "C0", "C+", "B-", "B0", "B+", "A-", "A0", "A+"}; 
			
			
			// 성적 입력
			for(int n =0; n<N; n++) {
				for(int i=0; i<3; i++) {
					scores[n][i] = sc.nextInt();
				}
			}
			
			
			// 총합 배열
			double[] total = new double [N];
			
			// 총점 계산
			for(int i = 0; i<N; i++) {
				double mid = scores[i][0]*0.35;
				double fin = scores[i][1]*0.45;
				double hw = scores[i][2]*0.20;
				
				total[i] = mid + fin + hw;
			}
			
			
			// 출력할 학생의 성적
			double grade = total[K-1];
			
			
			// 정렬
			Arrays.sort(total);
			
			// 출력할 학생의 학점 구하기
			String s = "";
			for(int i = 0; i<N; i++) {
				// 총점이 대상학생의 성적과 같을 때
				if(grade==total[i]) {
					// 학점 계산( 총점 순위 / (학생수/학점총개수))
					s = credit[i/(N/10)];
					break;
				}
			}
			
			System.out.printf("#%d %S\n", t, s);
		}
	}
}
