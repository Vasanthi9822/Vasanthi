import java.util.Scanner;

public class character {
	public static void main(String[] args)
	{
		int upperCaseCount=0;
		int lowerCaseCount=0;
		int numberCount=0;
		int specialCount=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string:");
		String str=s.nextLine();
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
	if(Character.isUpperCase(ch[i]))
	{
		upperCaseCount++;
	}
	else if(Character.isLowerCase(ch[i]))
	{
		lowerCaseCount++;	
	}
	else if(Character.isDigit(ch[i]))
	{
		numberCount++;
	}
	else
	{
		specialCount++;
	}
		}
		System.out.println("upper case count is:"+upperCaseCount);
		System.out.println("lower case count is:"+lowerCaseCount);
		System.out.println("number count is:"+numberCount);
		System.out.println("special count is:"+specialCount);
	}

		}



