class sort0s_and_1s
{
    public static void main(String[] args)
    {
        int arr[]={0,1,0,0,1,0,1,1,0,0,1,0};
        int i,j;
        i=0;j=arr.length-1;
        while(i<j)
        {
            if(arr[i]==0)
                ++i;
            if(arr[j]==1)
                --j;
            if(arr[i]!=0 && arr[j]!=1)
            {
                swap(i,j,arr);
                i++;
                j--;
            }
        }
        for(i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    static void swap(int i,int j,int arr[])
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}