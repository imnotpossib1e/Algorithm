import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		ArrayList<Integer> nums = new ArrayList<>();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            nums.add(sc.nextInt());
		}
		
		Collections.sort(nums);
		
		System.out.println(nums.get((T-1)/2));
	}
}