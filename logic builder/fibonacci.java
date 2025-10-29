class fibonacci
{
public static void main(String[] args)
	{
	int a=0;
	int b=1;
	int sum=0;
	int N=18;
	int temp;
	System.out.println(a+" "+b);
	while(a<=N)
		{
		temp=a+b;
		if(temp%2==0)
			sum=sum+temp;
		if(temp>N)
			break;
			temp=a+b;
			a=b;
			b=temp;
			System.out.println(" "+temp);
				}}}