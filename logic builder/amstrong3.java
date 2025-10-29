public class amstrong3
 {
    public static void main(String[] args)
{
    for(int i=1;i<100;i++)
    {
        int digit=0;
        int m=i;
        int sum=0;
        while(m!=0)
        {
            m=m/10;
            digit++;
        }
        m=i;
        while(m!=0)
        {
            int r=m%10;
           sum=sum+(int)Math.pow(r,digit);
            m=m/10;
        }
		if(sum==m)
		{
			System.out.println(i);
		}
    }
}
 }
