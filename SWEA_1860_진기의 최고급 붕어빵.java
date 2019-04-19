import java.util.*;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int T, bread=0;
		int N;
		int M;
		int K;
		int[] arr = new int[100];
		int[] result = new int[1000];
		
		Scanner scan = new Scanner(System.in);
		T= scan.nextInt();
		
		for(int i = 0; i<T; i++)
		{
			N = scan.nextInt();
			M = scan.nextInt();
			K = scan.nextInt();
			
			for(int j = 0; j<N; j++)
				arr[j] = scan.nextInt();
			
			for(int j = 0; j<N-1; j++)
			{
				int min=j;
				for(int k=j+1; k<N; k++)
					if(arr[k]<arr[min])
						min = k;
				int temp = arr[min];
				arr[min] = arr[j];
				arr[j] = temp;
			}
			

			for(int j = 0; j<N; j++)
			{
				if(j == 0)
					bread = arr[j]/M*K;
				else
					bread = arr[j]/M*K - j;

				if(bread == 0)
				{
					//½ÇÆÐ
					result[i] = 0;
					break;
				}
				if(j == N-1)
					result[i] = 1;
			}

		}
		for(int i = 0; i<T; i++)
		{
			if(result[i]==1)
				System.out.println("#"+(i+1)+" Possible");
			else
				System.out.println("#"+(i+1)+" Impossible");
		}
			
		scan.close();
	}

}
