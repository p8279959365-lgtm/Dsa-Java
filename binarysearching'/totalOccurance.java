
// we are using the concept of binary search for this question we have to count the number of occurance of number / element in an sorted array     


/*the  main hint is the "sorted array"
we willl aplly the concept of lower bound and upper bound
the lower bound will be the leftmost index of the element 

upper bound will be the element which is next greater element that the target element 

the total occurance will be upperbound-lowerbound= total occurance
*/







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