import java.util.*;

public class Solution {

	public static void main(String[] args) throws Exception{
		int T;

		Scanner scan = new Scanner(System.in);
		
		T=scan.nextInt();
		
		String[] Str=new String[T];
		scan.nextLine();
		for(int i = 0; i < T; i++)
			Str[i] = scan.nextLine();

		for(int i = 0; i < T; i++)
		{
			System.out.print(".");
			for(int j = 0; j<Str[i].length(); j++)
				System.out.print(".#..");
			System.out.println();
			
			System.out.print(".");
			for(int j = 0; j<Str[i].length()*2; j++)
				System.out.print("#.");
			System.out.println();
			
			if(Str[i].length()==1)
				System.out.println("#."+Str[i]+".#");
			else if(Str[i].length()>1)
			{
				System.out.print("#");
				for(int j = 0; j<Str[i].length(); j++)
					System.out.print("."+Str[i].charAt(j)+".#");
				System.out.println();	
			}
			System.out.print(".");
			for(int j = 0; j<Str[i].length()*2; j++)
				System.out.print("#.");
			System.out.println();
			
			System.out.print(".");
			for(int j = 0; j<Str[i].length(); j++)
				System.out.print(".#..");
			System.out.println();
		}
	}

}
