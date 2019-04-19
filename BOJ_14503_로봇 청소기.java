import java.util.Scanner;

public class Main {
    static int answer=0;
    static int N, M, r, c, d;
    static int[][] map;
    static int[][] visited;
    static int dr[] = { -1,0,1,0 };//북,동,남,서
    static int dc[] = { 0,1,0,-1 };
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        N = input.nextInt();
        M = input.nextInt();
        r = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();

        map = new int[N][M];
        visited = new int[N][M];

        for(int n = 0; n < N; n++)
            for(int m = 0; m < M; m++)
                map[n][m] = input.nextInt();
        dfs(r, c, d);
        System.out.println(answer);
    }
    public static void dfs(int n, int m, int dir) {
        if (map[n][m] == 0)
        {
            map[n][m] = -1;
            answer++;
        }
        //네 방향 돌리기
        for(int i = 0; i < 4; i++)
        {
            int change_dir = (dir + 3 - i) % 4;
            int change_n = n + dr[change_dir];
            int change_m = m + dc[change_dir];

            if(change_n>N-2 || change_n<1 || change_m>M-2 || change_m<1 || map[change_n][change_m]==1)  //이동한 칸이 벽이면
                continue;

            if(map[change_n][change_m] == 0)
            {
                answer++;
                map[change_n][change_m] = -1;
                dfs(change_n, change_m, change_dir);
                return;
            }
        }

        //후진
        if(map[n+dr[(dir+2)%4]][m+dc[(dir+2)%4]]==1)
            return;
        else
            dfs(n+dr[(dir+2)%4], m+dc[(dir+2)%4], dir);
    }
}