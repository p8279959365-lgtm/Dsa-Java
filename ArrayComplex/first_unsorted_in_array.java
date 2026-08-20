class first_unsorted_in_array
{
    public static void main(String[]args)
    {
        int arr[]={15,20,30,23,43,53};
        int len=arr.length;
        int i;
        for(i=0;i<len-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                System.out.println(arr[i+1]+ " is first unsorted element");
                break;
            }
        }

    }
}