class exprofit3
{
    public static void main(String args[])
    {
        int arr[]={1,2,-3,5,6,-4,-5};
        int L=arr.length;
        int result=0;
        for(int i=0;i<L-1;i++)
        {
            int sum=0;
            for( int j=i+1;j<L;j++)
            {
                sum=sum+arr[j];
                result=Math.max(result,sum);
            }
    }
    System.out.println(result);
}
}