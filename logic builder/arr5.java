class arr5
{
    public static void main(String args[])
    {
        int arr1[]={10,15,34,50,67};
        int n=arr1.length;
        int[] arr2=new int[n];
        int j=0;
        for(int i=n-1;i>=0;i--)
        {
            arr2[j]=arr1[i];
            j++;
        }
        System.out.println(arr2[j]);
    }
}