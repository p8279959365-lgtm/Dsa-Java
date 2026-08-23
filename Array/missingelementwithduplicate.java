


import java.util.*;
class missingelementwithduplicate
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i;
        int arr[]=new int[n];
        System.out.println("Enter the elements");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int temp;
        for(i=0;i<n;i++)
        {
            temp=Math.abs(arr[i]);
            if(arr[temp-1]>0)
                arr[temp-1]=0-arr[temp-1];
        }
        for(i=0;i<n;i++)
        {
            if(arr[i]>0)
                System.out.println("Missing element is: "+(i+1));
        }

    }
}