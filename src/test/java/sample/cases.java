package sample;

public class cases {
	public static void main(String[] args)
	{
		int uppercasecount=0;
		int lowercasecount=0;
		int numbercount=0;
		int specialcount=0;
		String s="Vasanthi9822@gmail.com";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(Character.isUpperCase(c))
			{
				uppercasecount++;
			}
			else if(Character.isLowerCase(c))
			{
				lowercasecount++;
		}
			else if(Character.isDigit(c))
			{
				numbercount++;
			}
			else
			{
				specialcount++;
			}
		}
		System.out.println("the upper case count is :"+uppercasecount);
		System.out.println("the lower case count is :"+lowercasecount);
		System.out.println("the number case count is :"+numbercount);
		System.out.println("the special case count is :"+specialcount);

	
	
	
	}

}
