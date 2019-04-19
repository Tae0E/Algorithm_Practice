import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int R = input.nextInt();
        int C = input.nextInt();
        int T = input.nextInt();
        int answer = 0;
        int[][] map = new int[R][C];

        for(int r = 0; r < R; r++)
            for(int c = 0; c < C; c++)
                map[r][c] = input.nextInt();

        for(int t = 0; t<T; t++)
        {
            //미세먼지 퍼지는 부분
            int[][] temp_map = new int[R][C];
            for(int r = 0; r < R; r++) {
                for (int c = 0; c < C; c++)
                {
                    if(map[r][c] != -1 && map[r][c] != 0)
                    {
                        if(r == 0 && c == 0)
                        {
                            int num=0;
                            if(map[r][c+1] != -1)
                            {
                                temp_map[r][c+1] +=  map[r][c]/5;
                                num -= map[r][c]/5;
                            }
                            if(map[r+1][c] != -1)
                            {
                                temp_map[r+1][c] +=  map[r][c]/5;
                                num -= map[r][c]/5;
                            }
                            temp_map[r][c] += num;
                        }
                        else if(r == 0 && c == C-1)
                        {
                            int num=0;
                            if(map[r][c-1] != -1)
                            {
                                temp_map[r][c-1] +=  map[r][c]/5;
                                num -= map[r][c]/5;
                            }
                            if(map[r+1][c] != -1)
                            {
                                temp_map[r+1][c] +=  map[r][c]/5;
                                num -= map[r][c]/5;
                            }
                            temp_map[r][c] += num;
                        }
                        else if(r == R-1 && c == 0)
                        {
                            int num=0;
                            if(map[r][c+1] != -1)
                            {
                                temp_map[r][c+1] +=  map[r][c]/5;
                                num -= map[r][c]/5;
                            }
                            if(map[r-1][c] != -1)
                            {
                                temp_map[r-1][c] +=  map[r][c]/5;
                                num -= map[r][c]/5;
                            }
                            temp_map[r][c] += num;
                        }
                        else if(r == R-1 && c == C-1)
                        {
                            int num=0;
                            if(map[r][c-1] != -1)
                            {
                                temp_map[r][c-1] +=  map[r][c]/5;
                                num -= map[r][c]/5;
                            }
                            if(map[r-1][c] != -1)
                            {
                                temp_map[r-1][c] +=  map[r][c]/5;
                                num -= map[r][c]/5;
                            }
                            temp_map[r][c] += num;
                        }
                        else
                        {
                            if(r == 0)
                            {
                                int num=0;
                                if(map[r][c-1] != -1)
                                {
                                    temp_map[r][c-1] +=  map[r][c]/5;
                                    num -= map[r][c]/5;
                                }
                                if(map[r][c+1] != -1)
                                {
                                    temp_map[r][c+1] +=  map[r][c]/5;
                                    num -= map[r][c]/5;
                                }
                                if(map[r+1][c] != -1)
                                {
                                    temp_map[r+1][c] +=  map[r][c]/5;
                                    num -= map[r][c]/5;
                                }
                                temp_map[r][c] += num;
                            }
                            else if(r == R-1)
                            {
                                int num=0;
                                if(map[r][c-1] != -1)
                                {
                                    temp_map[r][c-1] +=  map[r][c]/5;
                                    num -= map[r][c]/5;
                                }
                                if(map[r][c+1] != -1)
                                {
                                    temp_map[r][c+1] +=  map[r][c]/5;
                                    num -= map[r][c]/5;
                                }
                                if(map[r-1][c] != -1)
                                {
                                    temp_map[r-1][c] +=  map[r][c]/5;
                                    num -= map[r][c]/5;
                                }
                                temp_map[r][c] += num;
                            }
                            else if(c == 0)
                            {
                                int num=0;
                                if(map[r+1][c] != -1)
                                {
                                    temp_map[r+1][c] +=  map[r][c]/5;
                                    num -= map[r][c]/5;
                                }
                                if(map[r-1][c] != -1)
                                {
                                    temp_map[r-1][c] +=  map[r][c]/5;
                                    num -= map[r][c]/5;
                                }
                                if(map[r][c+1] != -1)
                                {
                                    temp_map[r][c+1] +=  map[r][c]/5;
                                    num -= map[r][c]/5;
                                }
                                temp_map[r][c] += num;
                            }
                            else if(c == C-1)
                            {
                                int num=0;
                                if(map[r+1][c] != -1)
                                {
                                    temp_map[r+1][c] +=  map[r][c]/5;
                                    num -= map[r][c]/5;
                                }
                                if(map[r-1][c] != -1)
                                {
                                    temp_map[r-1][c] +=  map[r][c]/5;
                                    num -= map[r][c]/5;
                                }
                                if(map[r][c-1] != -1)
                                {
                                    temp_map[r][c-1] +=  map[r][c]/5;
                                    num -= map[r][c]/5;
                                }
                                temp_map[r][c] += num;
                            }
                            else
                            {
                                int num=0;
                                if(map[r+1][c] != -1)
                                {
                                    temp_map[r+1][c] +=  map[r][c]/5;
                                    num -= map[r][c]/5;
                                }
                                if(map[r-1][c] != -1)
                                {
                                    temp_map[r-1][c] +=  map[r][c]/5;
                                    num -= map[r][c]/5;
                                }
                                if(map[r][c-1] != -1)
                                {
                                    temp_map[r][c-1] +=  map[r][c]/5;
                                    num -= map[r][c]/5;
                                }
                                if(map[r][c+1] != -1)
                                {
                                    temp_map[r][c+1] +=  map[r][c]/5;
                                    num -= map[r][c]/5;
                                }
                                temp_map[r][c] += num;
                            }
                        }
                    }
                }
            }
            for(int r = 0; r < R; r++)
                for(int c = 0; c < C; c++)
                    map[r][c] += temp_map[r][c];

            //공기청정기로 이동시키는 부분
            for(int r = 0; r < R; r++)
            {
                if(map[r][0] == -1)
                {
                    for(int i = r-1; i>0; i--)
                        map[i][0]=map[i-1][0];
                    for(int i = 0; i<C-1; i++)
                        map[0][i]=map[0][i+1];
                    for(int i = 0; i<r; i++)
                        map[i][C-1]=map[i+1][C-1];
                    for(int i = C-1; i>1; i--)
                        map[r][i]=map[r][i-1];
                    map[r][1]=0;

                    for(int i = r+2; i<R-1; i++)
                        map[i][0]=map[i+1][0];
                    for(int i = 0; i<C-1; i++)
                        map[R-1][i]=map[R-1][i+1];
                    for(int i = R-1; i>r+1; i--)
                        map[i][C-1]=map[i-1][C-1];
                    for(int i = C-1; i>1; i--)
                        map[r+1][i]=map[r+1][i-1];
                    map[r+1][1]=0;
                    break;
                }
            }
        }

        for(int r = 0; r < R; r++){
            for(int c = 0; c < C; c++) {
                if(map[r][c] != -1 && map[r][c] != 0)
                    answer += map[r][c];
            }
        }
        System.out.print(answer);
    }
}