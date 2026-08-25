

import java.util.*;
class selection
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elments in the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int i,j;
        int min;
                for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n-1;i++)
        {
            min=i;
            for(j=i+1;j<n;j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;
                }
            }

            if(min!=arr[i])
            {
                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }


        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}