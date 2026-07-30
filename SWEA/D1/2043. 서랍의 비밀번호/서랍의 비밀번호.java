import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int p, k;
		p = sc.nextInt();
		k = sc.nextInt();
		int result = 0;
		
		for(int i = k; i<=p; i++) {
			result += 1;
		}
		
		System.out.println(result);
	}
}