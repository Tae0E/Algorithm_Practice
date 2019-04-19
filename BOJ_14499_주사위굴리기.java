import java.util.*;

public class Main {
    static int N, M, X, Y, K;
    static int[][]map;
    static int[]cmd;
    static int[] dice = new int[6];

    public static void main(String[] args) {

        //입력부분
        Scanner input = new Scanner(System.in);
        N = input.nextInt();
        M = input.nextInt();
        X = input.nextInt();
        Y = input.nextInt();
        K = input.nextInt();

        map = new int[N][M];
        cmd = new int[K];

        for(int n = 0; n < N; n++)
            for(int m = 0; m < M; m++)
                map[n][m] = input.nextInt();

        for(int k = 0; k < K; k++)
            cmd[k] = input.nextInt();

        //탐색
        for(int k = 0; k < K; k++){
            if(cmd[k] == 1) //동쪽
            {
                if(Y == M-1)
                {

                }
                else
                {
                    Y+=1;

                    int t1 = dice[5];
                    int t2 = dice[4];
                    int t3 = dice[1];
                    int t4 = dice[3];

                    dice[1] = t1;
                    dice[3] = t2;
                    dice[4] = t3;
                    dice[5] = t4;

                    if(map[X][Y] == 0)
                        map[X][Y] = dice[1];
                    else {
                        dice[1] = map[X][Y];
                        map[X][Y] = 0;
                    }

                    //주사위 윗면 출력
                    System.out.println(dice[3]);
                }
            }
            else if(cmd[k] == 2) //서쪽
            {
                if(Y == 0)
                {

                }
                else
                {
                    Y-=1;

                    int t1 = dice[4];
                    int t2 = dice[5];
                    int t3 = dice[3];
                    int t4 = dice[1];

                    dice[1] = t1;
                    dice[3] = t2;
                    dice[4] = t3;
                    dice[5] = t4;

                    if(map[X][Y] == 0)
                        map[X][Y] = dice[1];
                    else {
                        dice[1] = map[X][Y];
                        map[X][Y] = 0;
                    }

                    //주사위 윗면 출력
                    System.out.println(dice[3]);
                }
            }
            else if(cmd[k] == 3) //북쪽
            {
                if(X == 0)
                {

                }
                else
                {
                    X-=1;

                    int t1 = dice[3];
                    int t2 = dice[0];
                    int t3 = dice[1];
                    int t4 = dice[2];

                    dice[0] = t1;
                    dice[1] = t2;
                    dice[2] = t3;
                    dice[3] = t4;

                    if(map[X][Y] == 0)
                        map[X][Y] = dice[1];
                    else {
                        dice[1] = map[X][Y];
                        map[X][Y] = 0;
                    }

                    //주사위 윗면 출력
                    System.out.println(dice[3]);
                }
            }
            else if(cmd[k] == 4) //남쪽
            {
                if(X == N-1)
                {

                }
                else
                {
                    X+=1;

                    int t1 = dice[1];
                    int t2 = dice[2];
                    int t3 = dice[3];
                    int t4 = dice[0];

                    dice[0] = t1;
                    dice[1] = t2;
                    dice[2] = t3;
                    dice[3] = t4;

                    if(map[X][Y] == 0)
                        map[X][Y] = dice[1];
                    else {
                        dice[1] = map[X][Y];
                        map[X][Y] = 0;
                    }

                    //주사위 윗면 출력
                    System.out.println(dice[3]);
                }
            }

        }
    }


}
