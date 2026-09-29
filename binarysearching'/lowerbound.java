

import java.util.*;
class lowerbound
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
        System.out.println("Enter the target element");
        int target=sc.nextInt();
        int mid,temp=-1;
        int start=0,end=n-1;
        while(start<=end)
        {
            mid=start+end/2;
            if(arr[mid]>=target)
            {
                temp=mid;
                end=mid-1;
            }
            else if(target>mid)
            {
                start=mid+1;
            }
        }
        System.out.println("the lower bound of element is "+temp);

    }
}