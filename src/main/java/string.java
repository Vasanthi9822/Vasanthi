import java.util.Scanner;

public class string {
	public static void main(String[] args)
	{
		int vowelCount=0;
		int constantCount=0;
		Scanner s=new Scanner(System.in);
				System.out.println("enter the string:");
		String str=s.nextLine();
		str=str.toLowerCase();
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
		vowelCount++;
		}
			else
			{
				constantCount++;
			}
			
			System.out.println(("vowel count is")+vowelCount+" ");
			System.out.println(("constant count is")+constantCount+" ");
	
	}
	}
}



