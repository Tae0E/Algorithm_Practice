import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		int T;
		int N=1;
		Scanner input = new Scanner(System.in);
		Integer Arr[];
		T = input.nextInt();
		int result[] = new int[T];
		for(int test_case = 1; test_case <= T; test_case++)
		{
			N=input.nextInt();
			int sum=0;
			Arr = new Integer[N];
			for(int n = 0; n < N; n++)
				Arr[n]=input.nextInt();
			Arrays.sort(Arr, Collections.reverseOrder());
			for(int i = 0; i < N; i=i+3)
			{
				if(N%3==0)
				{
					sum = sum + Arr[i] + Arr[i+1] + Arr[i+2];

					int min = Arr[i];
					if(min > Arr[i+1])
						min = Arr[i+1];
					if(min > Arr[i+2])
						min = Arr[i+2];
					sum = sum-min;
				}
				else if(N%3==1)
				{
					if(i==N-1)
						sum = sum + Arr[i];
					else
					{
						sum = sum + Arr[i] + Arr[i+1] + Arr[i+2];
						int min = Arr[i];
						if(min > Arr[i+1])
							min = Arr[i+1];
						if(min > Arr[i+2])
							min = Arr[i+2];
						sum = sum-min;
					}
				}
				else if(N%3==2)
				{
					if(i==N-2)
						sum = sum + Arr[i] + Arr[i+1];
					else
					{
						sum = sum + Arr[i] + Arr[i+1] + Arr[i+2];
						int min = Arr[i];
						if(min > Arr[i+1])
							min = Arr[i+1];
						if(min > Arr[i+2])
							min = Arr[i+2];
						sum = sum-min;
					}
				}
				
			}
			result[test_case-1] = sum;
		}
		for(int test_case = 1; test_case <= T; test_case++)
			System.out.println("#"+test_case+" "+result[test_case-1]);
		
	}
}