
public class Solution {
	static int[] visited;
	static int cnt;
	static int ans=-1;
	public static void main(String[] args) {
		String begin = "hit";
		String target = "cog";
		String[] words = {"hot", "dot", "dog", "lot", "log", "cog"}; 
		System.out.print(solution(begin, target, words));
	}
	
	public static int solution(String begin, String target, String[] words) {
        int answer = 0;
        
        visited = new int[words.length];
        boolean iscontain=false;
        //target이 있는가부터 검사
        for(int i = 0; i< words.length; i++)
        	if(words[i].equals(target))
        		iscontain=true;
        
        if(iscontain==true)//있으면 재귀로 돌리기 시작
        {
        	cnt=0;
        	dfs(begin, target, words);
        	answer=ans;
        	return answer;
        }
        else//없으면 0리턴
        	return answer;
        
    }
	
	public static void dfs(String str, String target, String[] words) {
		if(str.equals(target))
		{
			if(ans != -1) //처음이아니면 값이 작을 때만 값 넣기
			{
				if(ans>cnt)
					ans=cnt;
			}
			else//처음엔 값 넣기
				ans=cnt;
			return;
		}
		
		for(int i = 0; i < words.length; i++)
		{
			int chk=0;
			if(visited[i] == 0)
			{
				for(int j = 0; j < str.length(); j++)
					if(str.charAt(j)==words[i].charAt(j))
						chk++;
				
				if(chk == str.length()-1)
				{
					visited[i] = 1;
					cnt++;
					dfs(words[i], target, words);
					visited[i] = 0;
					cnt--;
				}
			}
		}
		
		return;
	}
}
