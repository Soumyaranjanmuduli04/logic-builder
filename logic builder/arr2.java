class arr2
{
    public static void main(String args[])
    {
        int arr[]={10,5,34,50,67};
        int large=arr[0];
        int n=arr.length;
        for(int i=1;i<n;i++)
        {
            if(arr[i]>large)
            {
                large=arr[i];
            }
        }
        System.out.println(large);
    }
}