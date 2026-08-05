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
			String s = sc.next();
			for(int i = 1; i<=s.length(); i++) {
				String tmp = s.substring(0, i);
				String tmp2 = s.substring(i, i+i);
				if(tmp.equals(tmp2)) {
					System.out.printf("#%d %d\n", t, tmp.length());
					break;
				}
			}
			
		}
	}
}
