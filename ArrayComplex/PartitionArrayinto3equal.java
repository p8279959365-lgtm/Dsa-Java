import java.util.*;
class PartitionArrayinto3equal{
    public static boolean canThreePartsEqualSum(int[] arr)
    {

        int i,j;
        int len=arr.length;
        int sum=0,sumr=0; 
        for(i=0;i<len;i++)
        {
            sum+=arr[i];
        }
        int target=sum/3;
        int count=0;  
        if(sum%3!=0)
        {
            return false;
        } 
       
        else if(sum%3==0)
        {
            for(i=0;i<len;i++)
            {
                sumr=sumr+arr[i];
                if(sumr==target)
                {
                    ++count;
                    sumr=0;
                }
            }
            if(count>=3)
            return true;
        }
        return false;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in array;");
        int n=sc.nextInt();
        int i;
        int arr[]=new int[n];
        for(i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println(canThreePartsEqualSum(arr));
    }
}
