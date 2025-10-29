//take a no 
//caluculate digit 
//calculate square of the no 
// int temp=temp^digit
//result=square%10 
//n==result
class automorphic
{
    public static void main(String[] args)
    {   
        int range=1000; 
    for(int i=1;i<range;i++)
    {   int square=i*i;
        int digit=0;
        int m=i;
        while(m!=0)
        {
            m=m/10;
            digit++;
        }
        int temp=(int)Math.pow(10,digit);
        int result=square%temp;
        if(i==result){
        System.out.println(i);
	}
    }
	}
}
