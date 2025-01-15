package sample;

public class cons {
	public static void main(String[] args)

	{
	String s="anand veerappan";
	int vowelcount=0;
	int constantcount=0;
	for(int i=0;i<s.length();i++)
	{
		char c=s.charAt(i);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
		{
			vowelcount++;
		}
		else {
			constantcount++;
		}
	}
	System.out.println("the vowelcount number is:"+vowelcount);
	System.out.println("the constantcount number is:"+constantcount);

	}
}
