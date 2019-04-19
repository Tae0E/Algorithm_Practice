import java.util.*;

public class Main {

    public static void main(String[] args) {

        //입력부분
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int L = input.nextInt();
        int answer = 0;
        int[][] map = new int[N*2][N];

        for(int i = 0; i < N; i++)
            for(int j = 0; j < N; j++)
                map[i][j] = input.nextInt();

        for(int j = 0; j < N; j++)
            for (int i = 0; i < N; i++)
                map[j+N][i]=map[i][j];


        int distance = 0;
        int j;
        for(int i = 0; i < 2 * N; i++)
        {
            distance=1;
            for (j = 0; j < N-1; j++)
            {
                if(map[i][j] == map[i][j+1])
                    distance++;
                else if(map[i][j]+1 == map[i][j+1] && distance >= L)
                    distance = 1;
                else if(map[i][j] == map[i][j+1]+1 && distance >= 0)
                    distance = 1-L;
                else
                    break;
            }
            if(j == N-1 && distance >= 0)
                answer++;
        }
        System.out.print(answer);

    }

}