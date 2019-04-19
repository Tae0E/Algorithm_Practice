import java.util.*;
//상담 적절히 해서 최대 수익
public class Main {
    static int answer = -1;
    static int N; //일
    static int[] T; //상담을 완료하는데 걸리는 기간
    static int[] P; //상담을 했을 때 받을 수 있는 금액
    static int[] DP;
    public static void main(String[] args) {

        //입력부분
        Scanner input = new Scanner(System.in);
        N = input.nextInt();
        T = new int[N];
        P = new int[N];
        DP = new int[N];
        for(int n = 0; n<N; n++)
        {
            T[n] = input.nextInt();
            P[n] = input.nextInt();
        }
        answer = solve(0);
        System.out.print(answer);
    }
    public static int solve(int day)
    {
        if(day > N)
            return -987654321;
        if(day == N)
            return 0;

        int ret = -1;
        if(ret != -1)
            return ret;

        ret = max(solve(day+1), solve(day + T[day]) + P[day]);
        return ret;

    }
    public static int max(int a, int b)
    {
        if(a > b)
            return a;
        else
            return b;
    }
}