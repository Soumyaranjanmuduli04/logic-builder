import java.util.*;
class star7
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
   System.out.println(" enter the number");
   int n=sc.nextInt();
    for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(" ");
            }
        for(int k=1;k<=i;k++)
        {
                System.out.print(" *");
        }
            System.out.println(" ");
        }
}
}