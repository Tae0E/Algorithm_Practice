import java.util.*;

public class Main {

    static int N;
    static int[] num;
    static int[] operator = new int[4];
    static int min = 0x7fffffff;
    static int max = -0x7fffffff*1;

    public static void main(String[] args) {

        //입력부분
        Scanner input = new Scanner(System.in);
        N=input.nextInt();
        num = new int[N];

        for(int n = 0; n < N; n++)
            num[n]=input.nextInt();

        for(int n = 0; n < 4; n++)
            operator[n]=input.nextInt();

        dfs(num[0], 0);
        System.out.println(max);
        System.out.println(min);

    }
    public static void dfs(int result, int count)
    {
        if(count == N-1)
        {
            if(min > result)
                min = result;
            if(max < result)
                max = result;
            return;
        }

        for(int n = 0; n < 4; n++) {
            if(operator[n] != 0) {
                --operator[n];
                if (n == 0) {
                    dfs(result + num[count + 1], count + 1);
                } else if (n == 1) {
                    dfs(result - num[count + 1], count + 1);
                } else if (n == 2) {
                    dfs(result * num[count + 1], count + 1);
                } else if (n == 3) {
                    dfs(result / num[count + 1], count + 1);
                }
                ++operator[n];
            }

        }

    }
}