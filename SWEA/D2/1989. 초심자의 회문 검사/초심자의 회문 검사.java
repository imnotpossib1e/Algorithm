import java.util.Scanner;
import java.io.FileInputStream;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t = 1; t<=T; t++) {
			String s = sc.next();
			int len = s.length();
			int mid = 0;
			
			String s1 = "";
			String s2 = "";
			
			if(len % 2 == 0) {
				// 글자수 짝수
				mid = len/2;
				s1 = s.substring(0, mid);
				s2 = s.substring(mid, len);
			}else {
				mid = (len+1)/2;
				s1 = s.substring(0, mid);
				s2 = s.substring(mid-1, len);
			}

			String reS2 = "";
			
			for(int i = mid-1; i>=0; i--) {
				reS2 = reS2+s2.charAt(i);
			}
			
			System.out.print("#" + t + " ");
			
			 if(s1.equals(reS2)) {
				 System.out.println(1);
			 }else {
				 System.out.println(0);
			 }
		}
	}
}
