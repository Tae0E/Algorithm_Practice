import java.util.*;

public class Solution {
    static int N, M;
    static int[][] map;
    static int ans = 0;
    static LinkedList<Pos> isChicken = new LinkedList<Pos>();
    static LinkedList<Pos> isHome = new LinkedList<Pos>();
    static LinkedList<Pos> s = new LinkedList<Pos>();
    static Queue<Pos> chkChicken = new LinkedList<Pos>();
    static Queue<Pos> chkHome = new LinkedList<Pos>();
    static LinkedList<Pos> tmp = new LinkedList<Pos>();
    static ArrayList<Integer> chicken_store_dist = new ArrayList<Integer>();
    public static void main(String[] args) {

        //입력부분
        Scanner input = new Scanner(System.in);
        N = input.nextInt();
        M = input.nextInt();

        map = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                map[i][j] = input.nextInt();
                if (map[i][j] == 1)
                    isHome.add(new Pos(i, j));
                if (map[i][j] == 2)
                    isChicken.add(new Pos(i, j));
            }
        }

        //거리 구하기 위해 큐에 저장
        for(int i = 0; i<isChicken.size(); i++) {
            chkChicken.add(isChicken.get(i));
        }
        for(int i = 0; i<isHome.size(); i++) {
            chkHome.add(isHome.get(i));
        }


        //치킨거리 구하는 부분
        if(M >= isChicken.size()){//폐업시킬 필요 없는 경우
            getDist(chkChicken, chkHome);
        }
        else //폐업시켜야 할 경우
        {
            combin(-1, M);
            System.out.println(chicken_store_dist);
            for(int i = 0; i<chicken_store_dist.size(); i++)
            {
                if(i==0)
                    ans=chicken_store_dist.get(i);
                else
                {
                    if(ans > chicken_store_dist.get(i))
                        ans=chicken_store_dist.get(i);
                }
            }
        }

        System.out.print(ans);

    }
    public static void combin(int start, int cnt)
    {

        for(int i = start+1; i<isChicken.size(); i++)
        {
            s.push(isChicken.get(i));
            if(s.size() == M) {
                tmp.addAll(s);
                getDist2(s, chkHome);
                tmp.clear();
            }
            if(cnt-1 != 0)
                combin(i, cnt-1);
            s.pop();
        }
        return;
    }
    public static void getDist2(LinkedList<Pos> chkChicken, Queue<Pos> chkHome)
    {
        while(!chkHome.isEmpty())
        {
            Pos pos_home = chkHome.poll();
            int dist=0;
            while(!chkChicken.isEmpty())
            {
                Pos pos_chicken = chkChicken.poll();

                //치킨거리 계산
                int dist_i, dist_j;
                if(pos_home.i < pos_chicken.i)
                    dist_i = pos_chicken.i - pos_home.i;
                else
                    dist_i = pos_home.i - pos_chicken.i;
                if(pos_home.j < pos_chicken.j)
                    dist_j = pos_chicken.j - pos_home.j;
                else
                    dist_j = pos_home.j - pos_chicken.j;

                //치킨거리 비교해서 최소값 저장
                if(dist==0)
                    dist = dist_i + dist_j;
                else{
                    if(dist > dist_i+dist_j)
                        dist = dist_i + dist_j;
                }
            }

            chkChicken.addAll(tmp);

            ans = ans + dist;
        }
        chicken_store_dist.add(ans);
    }
    public static void getDist(Queue<Pos> chkChicken, Queue<Pos> chkHome)
    {
        while(!chkHome.isEmpty())
        {
            Pos pos_home = chkHome.poll();
            int dist=0;
            while(!chkChicken.isEmpty())
            {
                Pos pos_chicken = chkChicken.poll();

                //치킨거리 계산
                int dist_i, dist_j;
                if(pos_home.i < pos_chicken.i)
                    dist_i = pos_chicken.i - pos_home.i;
                else
                    dist_i = pos_home.i - pos_chicken.i;
                if(pos_home.j < pos_chicken.j)
                    dist_j = pos_chicken.j - pos_home.j;
                else
                    dist_j = pos_home.j - pos_chicken.j;

                //치킨거리 비교해서 최소값 저장
                if(dist==0)
                    dist = dist_i + dist_j;
                else{
                    if(dist > dist_i+dist_j)
                        dist = dist_i + dist_j;
                }
            }
            for(int i = 0; i<isChicken.size(); i++) {
                chkChicken.add(isChicken.get(i));
            }
            ans = ans + dist;
        }
    }

    private static class Pos {
        int i;
        int j;

        public Pos(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }
}