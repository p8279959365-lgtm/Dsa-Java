


import java.util.*;
class sort012
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }


        int j;
        i=0;
        j=n-1;
        int temp;
        while(i<=j)
        {
            if(arr[i]==0)
            {
                ++i;
            }
            else if(arr[j]!=0)
            {
                --j;
            }
            else if(arr[i]!=0 && arr[j]==0)
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                int tempo=i;
                j--;
            }
        }
        

        j=n-1;
        while(i<j)
        {
            if(arr[i]==1)
                ++i;
            else if(arr[j]!=1)
                --j;
            else if(arr[i]!=1 && arr[j]==1)
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
         System.out.println("Array is:");
        for(i=0;i<n;i++)
        System.out.print(arr[i]+" ");
    }
}