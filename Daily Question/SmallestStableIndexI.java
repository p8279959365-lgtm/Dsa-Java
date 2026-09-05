


import java.util.*;
class SmallestStableIndexI
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int i,j,min,max;
        int minsum[]=new int[n];
        int maxsum[]=new int[n];
        int k;
        System.out.println("Enter the max degree of stability");
        k=sc.nextInt();
       
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
         min=arr[n-1];
        max=arr[0];

        for(i=0;i<n;i++)
        {
            if(arr[i]>=max)
            {
                maxsum[i]=arr[i];
                max=arr[i];
            }
            else
            {
                maxsum[i]=max;
            }
        }



        for(i=n-1;i>=0;i--)
        {
            if(arr[i]<=min)
            {
                minsum[i]=arr[i];
                min=arr[i];
            }
             else
            {
                minsum[i]=min;
            }
        }



        for(i=0;i<n;i++)
        {
            if(maxsum[i]-minsum[i]<=0)
            {
                System.out.println(i);
                break;
            }
        }

    }
}