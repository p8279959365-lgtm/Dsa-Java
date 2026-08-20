import java.util.*;
class TWO_SUM
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int arr[]={10,2,5,8,6,9,17};
        int len=arr.length;
        int i;
        System.out.println("Enter the sum to be obtained");
        int diff;
        int sum=sc.nextInt();
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(i=0;i<len;i++)
        {
            freq.put(arr[i],i);
            diff=sum-arr[i];
            for(int j:freq.keySet())
            {
                if(diff==j)
                System.out.println(freq.get(j)+"  "+i);
            }
        }

    }
}