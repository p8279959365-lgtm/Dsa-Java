import java.util.*;
class upperbound
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int i,start,end;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int mid,temp=-1;
        System.out.println("Enter the target element");
        int target=sc.nextInt();
        start=0;
        end=n-1;
        while(start<=end)
        {
            mid=start+end/2;
            if(target>=arr[mid])
            {
                temp=mid;
                start=mid+1;
            }
            else if(target<arr[mid])
            {
                end=mid-1;
            }
        }
        System.out.println("the upper limit of the occurance of target is "+temp);
    }
}