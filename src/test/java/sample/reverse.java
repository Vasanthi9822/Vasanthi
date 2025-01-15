package sample;

public class reverse {
	public static void main(String[] args)
	{
		String s="vasanthi";
		System.out.println(s.length());
		for(int i=s.length()-1;i>=0;i--)
		{
			char c = s.charAt(i);
			System.out.print(c);
		}
		
	}

}
