import java.util.*;
class peakElement
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int mid,start=0,end=n-1;
        while(start<=end)
        {
            mid=(start+end)/2;
            if(arr[mid+1]>arr[mid])
            {
                start=mid+1;
            }
            else if(arr[mid-1]<arr[mid] && arr[mid+1]<arr[mid])
            {
                System.out.println("Peak element is: "+arr[mid]);
                break;
            }
            else if(arr[mid-1]<arr[mid] && arr[mid+1]>arr[mid])
            {
                end=mid-1;
            }
        }
    }
}