import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
 
public class Solution {
    public static int[][] map = new int[4][4];
    public static HashMap<String,Integer> hashmap = new HashMap<String,Integer>();
    public static void main(String[] args) 
    {
        int T;
        Scanner input = new Scanner(System.in);
        T = input.nextInt();
         
        for(int test_case = 1; test_case <= T; test_case++)
        {
            for(int i = 0; i<4; i++)
                for(int j = 0; j<4; j++)
                        map[i][j]=input.nextInt();
             
            for(int i = 0; i<4; i++)
                for(int j = 0; j<4; j++)
                    dfs(i,j, Integer.toString(map[i][j]));
                  //Test Case Print
            System.out.println("#"+test_case+" "+hashmap.size());
            hashmap.clear();
        }
    }
    public static void dfs(int i, int j, String num)
    {
        if(num.length()==7)
        {
            hashmap.put(num, 1);
            return;
        }
         
        if(i>0)
        {
            dfs(i-1, j, num+Integer.toString(map[i-1][j]));
        }
        if(i<3)
        {
            dfs(i+1, j, num+Integer.toString(map[i+1][j]));
        }
        if(j>0)
        {
            dfs(i, j-1, num+Integer.toString(map[i][j-1]));
        }
        if(j<3)
        {
            dfs(i, j+1, num+Integer.toString(map[i][j+1]));
        }
    }
}