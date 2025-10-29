public class amstrong1
{
    class amstrong
{
	public static void main(String args[])
	{
		int n=234;
		int digit=0;
		int t=n;
		int sum=0;
		while(t!=0)
		{
			t=t/10;
			digit++;
		}
		System.out.println("no of digit" +digit);
		t=n;
		while(t!=0)
		{
			int r=t%10;
		sum=sum+(int)Math.pow(r,digit);
		t=t/10;
	}
	if(sum==n)
		System.out.println("the number is amstrong");
	else
		System.out.println("the number is not amstrong");
}
}
}
