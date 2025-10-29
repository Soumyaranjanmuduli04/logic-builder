class Neon
{
public static void main(String[]args)
{
int n=1;
int square=n*n;
int sum=0;
while(square>0)
    {
   sum=sum+(square%10);
  
    square=square/10;
	}
if(sum==n)
    {	
System.out.print("Neon");
    }
else
	{
		System.out.print("Not Neon");
	}
}} 