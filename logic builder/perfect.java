public class perfect {
    public static void main(String[] args)
{
    int n=28;
    int m=n;
    int sum=0;
    for (int i=1; i<m;i++)
    {
        if(m%i==0)
        {
           sum=sum+i;
        }
    }
    if(sum==n)
    {
        System.out.println("perfect"+" "+n);
    }
}
}
