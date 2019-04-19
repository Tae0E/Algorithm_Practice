import java.util.*;

public class Main {

    static int[][] Wheel = new int[4][8];
    public static void main(String[] args) {

        //입력부분
        Scanner input = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < 4; i++) {
                String tmp = input.nextLine();
                for(int k = 0; k<8; k++)
                {
                    Wheel[i][k] = tmp.charAt(k) - '0';
                }
        }
        int K = input.nextInt();

        for (int i = 0; i < K; i++)
        {
            int WNum = input.nextInt();
            int dir = input.nextInt();

            if(WNum == 1)
            {
                if(dir == 1)//시계방향
                {
                    if(Wheel[0][2]!=Wheel[1][6])
                    {
                        if(Wheel[1][2]!=Wheel[2][6])
                        {
                            if(Wheel[2][2]!=Wheel[3][6])
                            {
                                rotate(1, 1);
                                rotate(-1, 2);
                                rotate(1, 3);
                                rotate(-1, 4);
                            }
                            else
                            {
                                rotate(1, 1);
                                rotate(-1, 2);
                                rotate(1, 3);
                            }
                        }
                        else
                        {
                            rotate(1, 1);
                            rotate(-1, 2);
                        }
                    }
                    else
                    {
                        rotate(1, 1);
                    }

                }
                else//반시계방향
                {
                    if(Wheel[0][2]!=Wheel[1][6])
                    {
                        if(Wheel[1][2]!=Wheel[2][6])
                        {
                            if(Wheel[2][2]!=Wheel[3][6])
                            {
                                rotate(-1, 1);
                                rotate(1, 2);
                                rotate(-1, 3);
                                rotate(1, 4);
                            }
                            else
                            {
                                rotate(-1, 1);
                                rotate(1, 2);
                                rotate(-1, 3);
                            }
                        }
                        else
                        {
                            rotate(-1, 1);
                            rotate(1, 2);
                        }
                    }
                    else
                    {
                        rotate(-1, 1);
                    }
                }
            }
            else if(WNum == 2)
            {
                if(dir == 1)//시계방향
                {
                    if(Wheel[0][2]!=Wheel[1][6]) {
                        if(Wheel[1][2]!=Wheel[2][6])
                        {
                            if(Wheel[2][2]!=Wheel[3][6])
                            {
                                rotate(-1, 1);
                                rotate(1, 2);
                                rotate(-1, 3);
                                rotate(1, 4);
                            }
                            else
                            {
                                rotate(-1, 1);
                                rotate(1, 2);
                                rotate(-1, 3);
                            }
                        }
                        else
                        {
                            rotate(-1, 1);
                            rotate(1, 2);
                        }
                    }
                    else
                    {
                        if(Wheel[1][2]!=Wheel[2][6])
                        {
                            if(Wheel[2][2]!=Wheel[3][6])
                            {
                                rotate(1, 2);
                                rotate(-1, 3);
                                rotate(1, 4);
                            }
                            else
                            {
                                rotate(1, 2);
                                rotate(-1, 3);
                            }
                        }
                        else
                        {
                            rotate(1, 2);
                        }
                    }
                }
                else//반시계방향
                {
                    if(Wheel[0][2]!=Wheel[1][6]) {
                        if(Wheel[1][2]!=Wheel[2][6])
                        {
                            if(Wheel[2][2]!=Wheel[3][6])
                            {
                                rotate(1, 1);
                                rotate(-1, 2);
                                rotate(1, 3);
                                rotate(-1, 4);
                            }
                            else
                            {
                                rotate(1, 1);
                                rotate(-1, 2);
                                rotate(1, 3);
                            }
                        }
                        else
                        {
                            rotate(1, 1);
                            rotate(-1, 2);
                        }
                    }
                    else
                    {
                        if(Wheel[1][2]!=Wheel[2][6])
                        {
                            if(Wheel[2][2]!=Wheel[3][6])
                            {
                                rotate(-1, 2);
                                rotate(1, 3);
                                rotate(-1, 4);
                            }
                            else
                            {
                                rotate(-1, 2);
                                rotate(1, 3);
                            }
                        }
                        else
                        {
                            rotate(-1, 2);
                        }
                    }
                }
            }
            else if(WNum == 3)
            {
                if(dir == 1)//시계방향
                {
                    if(Wheel[2][2]!=Wheel[3][6]) {
                        if(Wheel[1][2]!=Wheel[2][6]) {
                            if(Wheel[0][2]!=Wheel[1][6]) {
                                rotate(1, 1);
                                rotate(-1, 2);
                                rotate(1, 3);
                                rotate(-1, 4);
                            }
                            else
                            {
                                rotate(-1, 2);
                                rotate(1, 3);
                                rotate(-1, 4);
                            }
                        }
                        else
                        {
                            rotate(1, 3);
                            rotate(-1, 4);
                        }
                    }
                    else
                    {
                        if(Wheel[1][2]!=Wheel[2][6]) {
                            if(Wheel[0][2]!=Wheel[1][6]) {
                                rotate(1, 1);
                                rotate(-1, 2);
                                rotate(1, 3);
                            }
                            else
                            {
                                rotate(-1, 2);
                                rotate(1, 3);
                            }
                        }
                        else
                        {
                            rotate(1, 3);
                        }
                    }
                }
                else//반시계방향
                {
                    if(Wheel[2][2]!=Wheel[3][6]) {
                        if(Wheel[1][2]!=Wheel[2][6]) {
                            if(Wheel[0][2]!=Wheel[1][6]) {
                                rotate(-1, 1);
                                rotate(1, 2);
                                rotate(-1, 3);
                                rotate(1, 4);
                            }
                            else
                            {
                                rotate(1, 2);
                                rotate(-1, 3);
                                rotate(1, 4);
                            }
                        }
                        else
                        {
                            rotate(-1, 3);
                            rotate(1, 4);
                        }
                    }
                    else
                    {
                        if(Wheel[1][2]!=Wheel[2][6]) {
                            if(Wheel[0][2]!=Wheel[1][6]) {
                                rotate(-1, 1);
                                rotate(1, 2);
                                rotate(-1, 3);
                            }
                            else
                            {
                                rotate(1, 2);
                                rotate(-1, 3);
                            }
                        }
                        else
                        {
                            rotate(-1, 3);
                        }
                    }
                }
            }
            else if(WNum == 4)
            {
                if(dir == 1)//시계방향
                {
                    if(Wheel[3][6]!=Wheel[2][2])
                    {
                        if(Wheel[2][6]!=Wheel[1][2])
                        {
                            if(Wheel[1][6]!=Wheel[0][2])
                            {
                                rotate(-1, 1);
                                rotate(1, 2);
                                rotate(-1, 3);
                                rotate(1, 4);
                            }
                            else
                            {
                                rotate(1, 2);
                                rotate(-1, 3);
                                rotate(1, 4);
                            }
                        }
                        else
                        {
                            rotate(-1, 3);
                            rotate(1, 4);
                        }
                    }
                    else
                    {
                        rotate(1, 4);
                    }
                }
                else//반시계방향
                {
                    if(Wheel[3][6]!=Wheel[2][2])
                    {
                        if(Wheel[2][6]!=Wheel[1][2])
                        {
                            if(Wheel[1][6]!=Wheel[0][2])
                            {
                                rotate(1, 1);
                                rotate(-1, 2);
                                rotate(1, 3);
                                rotate(-1, 4);
                            }
                            else
                            {
                                rotate(-1, 2);
                                rotate(1, 3);
                                rotate(-1, 4);
                            }
                        }
                        else
                        {
                            rotate(1, 3);
                            rotate(-1, 4);
                        }
                    }
                    else
                    {
                        rotate(-1, 4);
                    }
                }
            }
            
        }
        if(Wheel[0][0] != 0)//N극이면
            sum = sum+1;
        if(Wheel[1][0] != 0)//N극이면
            sum = sum+2;
        if(Wheel[2][0] != 0)//N극이면
            sum = sum+4;
        if(Wheel[3][0] != 0)//N극이면
            sum = sum+8;

        System.out.print(sum);


    }
    public static void rotate(int dir, int wnum)
    {
        int temp;
        if(dir == 1)
        {
            temp = Wheel[wnum-1][7];
            for(int i = 6; i>=0; i--) {
                Wheel[wnum - 1][i + 1] = Wheel[wnum - 1][i];
            }
            Wheel[wnum-1][0]=temp;
        }
        else
        {
            temp = Wheel[wnum-1][0];
            for(int i = 1; i<8; i++) {
                Wheel[wnum - 1][i - 1] = Wheel[wnum - 1][i];
            }
            Wheel[wnum-1][7]=temp;
        }
    }

}