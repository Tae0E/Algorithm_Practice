
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] triangle= {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
		System.out.print(solution(triangle));
	}
	public static int solution(int[][] triangle) {
	    int answer = 0;
	    for(int i = triangle.length-1; i>0; i--)
	    {
	    	for(int j = 0; j<triangle[i-1].length; j++)
	        {
	        	if(triangle[i][j] < triangle[i][j+1])
	        		triangle[i-1][j]=triangle[i-1][j]+triangle[i][j+1];
	        	else
	        		triangle[i-1][j]=triangle[i-1][j]+triangle[i][j];
	        }
	    }
	        
	    answer=triangle[0][0];
	    return answer;
	}
}
