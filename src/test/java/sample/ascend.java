package sample;

public class ascend {
	public static void main(String[] args)
	{
		int a[]= {100,10,90,20,50,70};
		int c;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
			if (a[i]<a[j])
			{
				c=a[i];
				a[i]=a[j];
				a[j]=c;
				
			}
			}
			
		
		System.out.println(a[i]);
	}
		System.out.println("the minimum value is : "+a[a.length-3]);
	}
}
