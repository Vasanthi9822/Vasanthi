package sample;

public class palin {
	public static void main(String[] args)
	{
		String s="malayalam";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
		char c=s.charAt(i);
		rev=rev+c;
		}
		System.out.println(rev);
		if(s.equals(rev))
		{
			System.out.println("this is palindrome");
		}
		else
		{
			System.out.println("this is not palindrome");
		}
		
	}

}
