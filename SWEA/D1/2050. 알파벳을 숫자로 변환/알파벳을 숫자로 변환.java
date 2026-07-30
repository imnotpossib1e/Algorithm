import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		for(int test_case = 0; test_case < str.length(); test_case++)
		{
			System.out.print(((int)str.charAt(test_case)-64) + " ");		
		}
	}
}