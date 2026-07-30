import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i = 1; i<=T; i++) {
			int[] scoreArr = new int[101];
			sc.nextInt();
			for(int j = 0; j<1000; j++) {
				scoreArr[sc.nextInt()]++;
			}
			int max = 0, idx = 0;
			
			for(int j = 100; j>0; j--) {
				if(scoreArr[j] > max) {
					max = scoreArr[j];
					idx = j;
				}
			}
			
			System.out.println("#"+i + " " + idx);
		}
	}
}