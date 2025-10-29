class arr6
{
    public static void main(String args[])
    {
        int []arr={12,23,34,44,56};
        int n=arr.length;
        int left=0;
        int right=n-1;
        int temp;
        while(left<right)
        {
            temp=arr[left];
          arr[left]=arr[right];
            arr[right]=temp;
            left++;
         right--;
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}