import java.util.*;
class binarySearch
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int i;
        int mid,start,end;
        start=0;
        end=n-1;
        int c=0;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        while(start<=end)
        {
            mid=(start+end)/2;
            if(arr[mid]==target)
            {
                System.out.println("Element found at index "+mid);
                c++;
                break;
            }
            if(target<arr[mid])
            {
                end=mid-1;
            }
            else if(target>arr[mid])
            {
                start=mid+1;
            }
        }
        if(c==0)
        System.out.println("element not found");
    }
}