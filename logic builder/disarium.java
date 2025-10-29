import java.util.*;
class disarium
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int x=sc.nextInt();
        int temp=x;
        int count=0;
        while(temp!=0)
        {
            temp/=10;
            count++;
        }
        temp=x;
        int rem,sum=0;
        while(temp!=0)
        {
            rem=temp%10;
            
           sum+=Math.pow(rem , count);
            count--;
            temp/=10;
        }
        if(sum==x)
        {
            System.out.println("disarium number");
        }
        else
        {
            System.out.println("not");
        }

    }
       
}