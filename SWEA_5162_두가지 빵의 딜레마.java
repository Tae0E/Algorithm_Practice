import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int test_case = input.nextInt();
		for(int t = 1; t<=test_case; t++)
		{
			int A = input.nextInt();
			int B = input.nextInt();
			int C = input.nextInt();
			
			if(A>B)
				System.out.println("#"+t+" "+C/B);
			else
				System.out.println("#"+t+" "+C/A);
		}
	}
}