class arr4
{
    public static void main(String args[])
    {int i=0,j=0;
        int arr1[]={10,15,34,50,67};
        int n=arr1.length;
        int[] arr2=new int[n];
        for(i=n-1;i>=0;i--)
        {
            arr2[j]=arr1[i];
            j++;
        }
        for(i=0;i<n;i++) {
        System.out.println(arr2[i]);
    }
}}