import java.util.*;
class pairs
{
    public static void printpairs(int arr[])
    {
        int i,j,n,totalpairs;
        n=arr.length;
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
             {   
                System.out.print(" ("+arr[i]+","+arr[j]+") ");
             }
            System.out.println();
        }
        totalpairs=n*(n-1)/2;
        System.out.println("Total pairs: "+totalpairs);

    }
    public static void main(String[] args)
    {
        int arr[]={10,58,56,89};
        printpairs(arr);
    }
}