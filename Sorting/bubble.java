


import java.util.*;
class bubble
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements to be in array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int i,j;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int min=0,temp=0;
        for(i=0;i<n-1;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(arr[j]<arr[i])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        System.out.println("Array sorted succesfully ");
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}