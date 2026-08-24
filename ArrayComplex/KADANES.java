import java.util.*;
class KADANES
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int i;
        System.out.println("Enter the elements to be entered in the array");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        int maxsum=Integer.MIN_VALUE;
        int sum=0;
        for(i=0;i<n;i++)
        {
            sum=sum+arr[i];
            if(sum>maxsum)
            {
                maxsum=sum;
            }
            if(sum<0)
            {
                sum=0;
            }
        }
        System.out.println("Maximum sum of subarray is: "+maxsum);
    }
}