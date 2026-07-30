import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t = 1; t<=T; t++) {
			int N = sc.nextInt();
			int[][] arr = new int[N][N];
			
			int[] dx = {0, 1, 0, -1};
			int[] dy = {1, 0, -1, 0};
			
			int x = 0;
			int y = 0;
			int dir = 0;
			
			for(int i = 1; i<= N*N; i++) {
				arr[x][y] = i;
				if(x + dx[dir] >= N || y + dy[dir] >= N
						|| x +dx[dir] < 0 || y + dy[dir] < 0
						|| arr[x+dx[dir]][y+dy[dir]] != 0) {
					dir = (dir + 1) % 4;
				}
				x += dx[dir];
				y += dy[dir];
			}
			
			System.out.println("#" + t);
			for(int j = 0; j<N; j++) {
				for(int k = 0; k<N; k++) {
					System.out.print(arr[j][k]+ " ");
				}
				System.out.println();
			}
		}
	}
}