import java.util.*;
class totalOccurance{
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
        System.out.println("Enter the element whose occurance has to be counted");
        int target=sc.nextInt();
        int start=0;
        int end=n-1;
        int lb=-1,mid;
        int ub=-1;
        while(start<=end)
        {
            mid=(start+end)/2;
            if(target>arr[mid])
            {
                start=mid+1;
            }
            else if(target<=arr[mid])
            {
                lb=mid;
                end=mid-1;
            }
        }
        start=0;
        end=n-1;
         while(start<=end)
        {
            mid=(start+end)/2;
            if(target>=arr[mid])
            {
                start=mid+1;
            }
            else if(target<arr[mid])
            {
                ub=mid;
                end=mid-1;
            }
        }
        System.out.println("frequency of: "+target+" is: "+(ub-lb));

        
    }
}